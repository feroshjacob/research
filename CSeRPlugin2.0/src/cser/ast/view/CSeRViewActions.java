package cser.ast.view;

import org.eclipse.jdt.internal.ui.viewsupport.ProjectTemplateStore;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import cser.Activator;
import cser.core.CSeRChange;
import cser.core.CSeRChanges;
import cser.core.CSeRDBController;
import cser.core.CSeRException;
import cser.editors.CSeREditor;
import cser.file.CSeRFileListener;
import cser.track.core.ChangeController;

public class CSeRViewActions {
	

}
class DeleteAcion extends Action { 
	  

    /**
     * Creates the action
     */
    public DeleteAcion() {
        super("Delete");
        setImageDescriptor(Activator.getImageDescriptor("delete.gif"));
        setToolTipText("Delete");
        setEnabled(true);
    }

    public void run() {
    	CSeRDBController.clearAll();
        ChangeController.clearChanges();
   //     FileUtils.clearFolder(GlobalConfig.db_folder+GlobalConfig.seperator+"changes");
    }
}
class ShowGroupsAction extends Action { 
	  

    /**
     * Creates the action
     */
    public ShowGroupsAction() {
        super("Show Groups");
        setImageDescriptor(Activator.getImageDescriptor("meBook.gif"));
        setToolTipText("Show Groups");
        setEnabled(true);
    }

    public void run() {
    	/*
       FileDialog dialog = new FileDialog(Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().Activator.getShell());
   dialog.open();
      */
     IEditorPart editorPart=	Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
       CSeRChanges changes = ChangeController.loadChanges((( IFileEditorInput) editorPart.getEditorInput()).getFile() );
       for(CSeRChange change : changes){
    	   System.out.println("s_pos:" + change.getPosition() +", msg:" + change.getMessage() + ",p_pos:" + change.getParentPosition());
       }
       }
}


 
 class TrackAction extends Action { 
	  

    /**
     * Creates the action
     */
    public TrackAction() {
        super("Track");
        setImageDescriptor(Activator.getImageDescriptor("track.gif"));
        setToolTipText("track");
        setEnabled(true);
    }

    /**
     * Opens the dialog. Notifies the view if the filter has been modified.
     */
    public void run() {
    	   IEditorPart editorPart=	Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
    	   try {
    		   if(editorPart instanceof CSeREditor){
    			   IFileEditorInput editorInput = ( IFileEditorInput) editorPart.getEditorInput();
    			   CSeRDBController.initcopy(editorInput.getFile()) ;
    			   CSeREditor editor = (CSeREditor) editorPart;
    			   IDocument document = editor.getDocumentProvider().getDocument(editorInput);
    			    document.addDocumentListener(new CSeRFileListener(editor));
    		   }

		} catch (CSeRException e) {
				e.printStackTrace();
		} 	

    }
}
 
 class CopyPasteAction extends Action { 
	  

		private static ProjectTemplateStore fTemplateStore;

	
	    /**
	     * Creates the action
	     */
	    public  CopyPasteAction () {
	        super("Add template");
	        setImageDescriptor(Activator.getImageDescriptor("refresh.png"));
	        setToolTipText("Copy Paste ");
	        setEnabled(true);
	    }


	    
	    

		/**
	     * Opens the dialog. Notifies the view if the filter has been modified.
	     */
	    public void run() {

	    
	    }


 

		
	}
 
 