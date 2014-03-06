package cser.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;

import cser.Activator;
import cser.region.ConstantStore;



public class CopyAction extends Action {
	private IAction oldCopyAction;
	
   // true when the content in the clipboard is copied from a region in a java file and that region hasn't changed since.
	public static boolean CnPCopy = false;

    public static IEditorInput editorInput=null;
	public static IFile javaFile=null;
	
	private static IDocument copiedDoc=null;
	private static ITextSelection textSelection=null;


	
	public CopyAction(IAction oldCopyAction){
		this.oldCopyAction = oldCopyAction; 
		this.setText(oldCopyAction.getText());
	}
	public void runWithEvent(Event e){
	oldCopyAction.runWithEvent(e);
		
		ITextEditor editor =  (ITextEditor)Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		ISelection selection = editor.getSelectionProvider().getSelection();
		textSelection = (ITextSelection)selection;
		Position position = new Position(textSelection.getOffset(),textSelection.getLength());
		ConstantStore.saveInfo(((FileEditorInput) editor.getEditorInput()).getFile(), position);
		

		}
	public static IDocument getCopiedDoc(){
		return copiedDoc;
	}
}