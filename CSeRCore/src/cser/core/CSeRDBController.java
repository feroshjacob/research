package cser.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.compiler.IProblem;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.text.Position;

import cser.ast.PartVisitor;
import cser.utils.FileUtils;
import cser.utils.GlobalConfig;
import cser.utils.ParseHelper;
import cser.utils.SerialiseHelper;

public class CSeRDBController extends CSeRSubController {
	
	public static boolean UNCOMPILABLE_CODE = false;

	public static void initcopy(IFile file, IFile file1)
			throws CSeRException {

     initcopy(file, file1,null,null);

	}
	public static void initcopy(IFile file )
	throws CSeRException {
        SerialiseHelper.copy(file);

        IFile file1 = FileUtils.getCloneFile(file) ;
        if(file1!=null)
		 initcopy(file1,file,null,null);
        else throw new CSeRException("File Creation Failed");

}
 
	 public static List<CSeRClone> getLinkedClones(IFile file) { 
		 List<CSeRClone> linkedClones = new ArrayList<CSeRClone>();
		  for(String filePath :clones.keySet()){
			  CSeRClone clone = clones.get(filePath);
			  if(clone.getParent()!=null && clone.getParent().getFile().equals(file)) linkedClones.add(clone);
		  }
		  return linkedClones;
	 }
     
	public static void initcopy(IFile file, IFile file1,
			Position pos1, Position pos2) throws CSeRException {
		if(file==null || file1 ==null) return;
	    CSeRClone clone1 = saveCSeRClone(file,pos1);
	     CSeRClone clone2 = saveCSeRClone(file1,pos2);
	     linkClonePairs(file1,clone1,clone2);
	     
	
	}



	public static void updateLinkedPositions(IFile file,
			Position orginalPosition, Position newPosition) throws CSeRException {

		CSeRClone file2 = getRCFFIle(file);
		if (file2 == null) {
			throw new CSeRException("The File doesn't exist in DB");
		}
		file2.getCheckPositions().updateCurrentPosition(orginalPosition,
				newPosition);

	}
	public static void updateParentPositions(IFile file,
			Position currentPosition, Position newParentPosition) throws CSeRException {

		CSeRClone file2 = getRCFFIle(file);
		if (file2 == null) {
			throw new CSeRException("The File doesn't exist in DB");
		}
		 List<CSeRClone> clones = CSeRDBController.getLinkedClones(file);
		 for(CSeRClone clone: clones){
		     clone.getCheckPositions().updateParentPosition(currentPosition,
				newParentPosition);
		 }
	}

	public static void updateDeletedPositions(IFile file,
			Position orginalPosition) throws CSeRException {

		CSeRClone file2 = getRCFFIle(file);
		if (file2 == null) {
			throw new CSeRException("The File doesn't exist in DB");
		}
		file2.getCheckPositions().updateDeletedPosition(orginalPosition);

	}

	public static CheckPositions getLinkedPositions(IFile file)
			throws CSeRException {
		CSeRClone file2 = getRCFFIle(file);
		if (file2 == null) {
			throw new CSeRException("The File doesn't exist in DB");
		}
		return file2.getCheckPositions();

	}

	public static ASTNode getJavaElement(IFile file, Position position)
			throws CSeRException {

		PartVisitor visitor;
		try {
			ICompilationUnit unit = JavaCore.createCompilationUnitFrom(file);
			visitor = new PartVisitor(position);
			CompilationUnit cu = ParseHelper.parse(unit);
			UNCOMPILABLE_CODE = false;
			 IProblem problems[] = cu.getProblems();
			 for(int i=0; i < problems.length ; i++){
				 if (problems[i].isError()){
					 UNCOMPILABLE_CODE = true;
					 break;
				 }
	
			 }
			cu.accept(visitor);
			return visitor.getNode();
				
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new CSeRException(e.getMessage());
		}

	}

	public static Map<String, CSeRClone> getFiles() throws CSeRException {
		return clones;
	}

	public static void clearAll() {
		clones = new HashMap<String, CSeRClone>();
	}




}
