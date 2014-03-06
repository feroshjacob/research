package cser.compare.view;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

public class CSeRCompareAction implements IActionDelegate {

	private IFile left, right;

	public void run(IAction action) {

	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection.isEmpty() || !(selection instanceof IStructuredSelection))
			return;
		Object[] files = ((IStructuredSelection) selection).toArray();
		if (files.length == 2) {
			for (int i = 0; i < 2; i++) {
				Object o = files[i];
				if (!(o instanceof IFile))
					return;
			}
			left = (IFile) files[0];
			right = (IFile) files[1];

		}

	}


}