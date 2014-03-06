package cser.file;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jface.text.Position;

import cser.core.CSeRChange;
import cser.core.CSeRChanges;
import cser.core.CSeRClone;
import cser.core.CSeRDBController;
import cser.core.CSeRException;
import cser.core.CheckPositions;
import cser.editors.BaseDocumentListener;
import cser.editors.CSeRMarkerAnnotation;
import cser.track.core.ChangeController;
import cser.track.core.IMessages;
import cser.utils.PositionUtils;

@SuppressWarnings("restriction")
public class CSeRFileListener extends BaseDocumentListener {

	public CSeRFileListener(JavaEditor editor) {

		super(editor);
	}

	protected void setUpTrackDB() throws CSeRException {

		cserFile = CSeRDBController.getRCFRootFIle(file);
		currentCserFile = CSeRDBController.getRCFFIle(file);
		if (cserFile == null) {
			List<CSeRClone> clones = CSeRDBController.getLinkedClones(file);
			if (clones == null || clones.size() < 1)
				return;
			CheckPositions checkPositions = new CheckPositions();
			for (CSeRClone clone : clones) {
				CheckPositions chks = clone.getCheckPositions();
				checkPositions.putAll(chks);
			}
			addPositionUpdater(checkPositions);
			return;
		}
		/*
		 * we decided to remove the comment and add marker instead
		 */
		// if(!cserFile.isCommentGenerated()){
		// new
		// InsertComment(file,document).insertOneLineComment(cserFile.getFileName());
		// cserFile.setCommentGenerated(true);
		// }
		addPositionUpdater(CSeRDBController.getLinkedPositions(file));
		// addCopyAnnotation(new Position(0, 0));

	}
	protected void showExistingChanges() {
		CSeRChanges changes =null;
	    changes = ChangeController.loadChanges(file);
		if(changes==null) return;
		for (CSeRChange change : changes) {
			CSeRMarkerAnnotation marker = null;
			try {
				marker = new CSeRMarkerAnnotation(getAnnotationType(change
						.getType()), change.getMessage(), file);
				model.addAnnotation(marker, getPosition(change));
			} catch (CoreException e) {
				e.printStackTrace();
			} catch (CSeRException e) {
				e.printStackTrace();
			}

		}
		if (currentCserFile != null)
			currentCserFile.setChanges(changes);
	}
	private void addCopyAnnotation(Position position) {

		CSeRMarkerAnnotation marker = null;
		try {
			StringBuffer comment = new StringBuffer();
			comment.append("\n");
			comment.append(" * Parent File :" + cserFile.getFileName() + "\n");
			comment.append(" * Date        :"
					+ new SimpleDateFormat("EEE, MMM d, yy").format(Calendar
							.getInstance().getTime()) + "\n");
			marker = new CSeRMarkerAnnotation("cserannotation2", comment
					.toString(), file);
			marker.setQuickFixable(true);
			model.addAnnotation(marker, position);

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Position getPosition(CSeRChange change) {
		Position position = PositionUtils.getPosition(change.getPosition());
		if (change.isParent()){
			position = PositionUtils.getPosition(change.getParentPosition());

			if (change.getType() == IMessages.chgInsert
					|| change.getType() == IMessages.chgInsert_Field) {

				Position pos = new Position(position.offset + position.length - 2,
						2);
				return pos;
			}
			return position;
		}
		else 
			position = PositionUtils.getPosition(change.getPosition());

		if (change.getType() == IMessages.chgDelete
				|| change.getType() == IMessages.chgDelete_Field) {

			Position pos = new Position(position.offset + position.length - 2,
					2);
			return pos;
		}
		return position;
	}

	private String getAnnotationType(int type) throws CSeRException {
		if (type == IMessages.chgDelete|| type==IMessages.nodeChgInsert)
			return IMessages.annotationForDelete;
		if (type == IMessages.chgInsert || type==IMessages.nodeChgInsert)
			return IMessages.annotationForInsert;
		if (type == IMessages.chgUpdate)
			return IMessages.annotationForUpdate;
		if (type == IMessages.chgDelete_Field)
			return IMessages.annotationForDeleteF;
		if (type == IMessages.chgInsert_Field)
			return IMessages.annotationForInsertF;
		if (type == IMessages.moveMessge)
			return IMessages.annotationForMove;

		throw new CSeRException("Unexpected Change");
	}

}