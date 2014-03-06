package ui.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class MapRedoopShortcut implements ILaunchShortcut {

	private IFile currFile;

	
	public void launch(final ISelection selection, final String mode) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final Object object = structuredSelection.getFirstElement();
			if (object instanceof IAdaptable) {
				currFile = (IFile) ((IAdaptable) object).getAdapter(IResource.class);
		//		launch(mode);
			}
		}
	}

	public void launch(final IEditorPart editor, final String mode) {
		final IEditorInput input = editor.getEditorInput();
		currFile = (IFile) input.getAdapter(IFile.class);
		//launch(mode);
	}
	

	
}  
