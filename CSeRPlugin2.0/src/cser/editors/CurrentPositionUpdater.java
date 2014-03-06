package cser.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.Position;

import cser.core.CSeRDBController;
import cser.core.CSeRException;
import cser.track.core.ChangeController;
import cser.utils.PositionUtils;

public class CurrentPositionUpdater extends BasePositionUpdater {

	public CurrentPositionUpdater(String category, IFile latestFile) {
		super(category, latestFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void updateLinkedPositions() {
		try {
			Position positionInParent = PositionUtils
					.getPosition(getCategory());
//			if(!notDeleted()){
//			System.out.println("newPOsition" +fPosition);
//			System.out.println("fREpa" +fReplaceLength);
//			System.out.println("fIns" + fLength);
//			}
			CSeRDBController.updateLinkedPositions(file, positionInParent,fPosition);
			updateChangePositions();
		} catch (CSeRException e) {
			e.printStackTrace();
		}

	}

	private void updateChangePositions() {
		
		ChangeController.updatePositions(file, fPosition, PositionUtils.getPosition(getCategory()));

	}

}
