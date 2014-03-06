package cser.region;

import org.eclipse.jface.text.Position;
import org.eclipse.ui.texteditor.ITextEditor;

import cser.core.CSeRDBController;
import cser.core.CSeRException;
import cser.editors.BaseDocumentListener;
import cser.editors.PasteAction;

public class CSeRRegionListener extends BaseDocumentListener {

	public CSeRRegionListener(ITextEditor editor) {
		super(editor);
	}

	protected void execute(Position event) throws CSeRException {
		if(PasteAction.pasted==1  && !ConstantStore.isnull()){
			Position pos = new Position(event.getOffset(),ConstantStore.getPosition().getLength());
			if(CSeRDBController.getLinkedClones(CSeRDBController.getRCFRootFIle(file).getFile()).size() >0) return ;
			CSeRDBController.initcopy(ConstantStore.getFile(), file, ConstantStore.getPosition(), pos);
			addPositionUpdater(CSeRDBController.getLinkedPositions(file));
			cserFile = CSeRDBController.getRCFFIle(file);
			currentCserFile = cserFile;
			}
		else super.execute(event);
	}

	protected void setUpTrackDB() throws CSeRException {
		
	}

}
