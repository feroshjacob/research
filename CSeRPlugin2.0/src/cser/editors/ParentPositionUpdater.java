package cser.editors;

import org.eclipse.core.resources.IFile;

import cser.core.CSeRDBController;
import cser.core.CSeRException;
import cser.track.core.ChangeController;
import cser.utils.PositionUtils;

public class ParentPositionUpdater extends BasePositionUpdater {

	public ParentPositionUpdater(String category, IFile latestFile) {
		super(category, latestFile);
	}

	@Override
	protected void updateLinkedPositions() {
		try {
			CSeRDBController.updateParentPositions(file, PositionUtils.getPosition(getCategory()),
					fPosition);
			updateChangePositions();
		} catch (CSeRException e) {
			e.printStackTrace();
		}

	}

	private void updateChangePositions() {
		ChangeController.updateParentPositions(file, fPosition, fOriginalPosition);

	}

}
