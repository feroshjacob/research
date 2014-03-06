package ui.actions;

import hdp.parser.HelperHPDParser;
import hdp.parser.MainParser;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import ui.refactoring.MRRefactorHelper;
import utils.FileUtils;


public class ReGenerateCode implements IObjectActionDelegate {


	
	/**
	 * Constructor for Action1.
	 */
	public ReGenerateCode() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		if(currFile!=null){
			HelperHPDParser helper =  new HelperHPDParser( MainParser.getMapRedoop(currFile), currFile.getProject());
			try {
				helper.createClasses(true);
				 //  new MRRefactorHelper(unit).replaceMapReduceCode(MainParser.getMapCode(), MainParser.getReduceCode());
			    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	IFile currFile = null;
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final Object object = structuredSelection.getFirstElement();
			if (object instanceof IFile) {
				currFile = (IFile) object;
		//		launch(mode);
			}
		}

	}

}
