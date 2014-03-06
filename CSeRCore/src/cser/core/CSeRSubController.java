package cser.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jface.text.Position;

import cser.ast.MainVisitor;
import cser.utils.FileUtils;
import cser.utils.ParseHelper;

public class CSeRSubController {
	protected static Map<String, CSeRClone> clones = new HashMap<String, CSeRClone>();

	public static CSeRClone getRCFFIle(IFile file) throws CSeRException {

		String filePath = FileUtils.getRelativeFileName(file);
		if (!clones.containsKey(filePath))
			return null;
		return clones.get(filePath);
	}

	public static CSeRClone getRCFRootFIle(IFile file) throws CSeRException {
		String filePath = FileUtils.getRelativeFileName(file);
		if (!clones.containsKey(filePath))
			return null;
		CSeRClone file2 = clones.get(filePath);
		if (file2 == null)
			return null;
		return file2.getParent();
	}

	protected static void addFile(IFile file, CSeRClone file2)
			throws CSeRException {

		clones.put(FileUtils.getRelativeFileName(file), file2);

	}

	protected static CSeRClone saveCSeRClone(IFile file,Position pos) throws CSeRException {

		MainVisitor visitor = (MainVisitor) ParseHelper.visit(file,
				new MainVisitor(pos));

		CSeRClone file2 = getRCFFIle(file);  
		if(file2 ==null) {
		file2 = new CSeRClone(file);
		file2.setFile(file);
		addFile(file, file2);
		}
		file2.setStatements(visitor.getStatements());
		
		return file2;

	}

	protected static void linkClonePairs(IFile file,CSeRClone rfile, CSeRClone file2) throws CSeRException {
	
		if (file2 == null || rfile==null) throw new CSeRException("Either of clones  cannot be null");
			
		file2.setParent(rfile);
		savecheckPositions(file, rfile, file2);
	}




	private static void savecheckPositions(IFile file, CSeRClone file2,
			CSeRClone file1) throws CSeRException {
		int count = 0;
		
		if(file2.getFileName().equals(file1.getFileName())){
			saveCheckedPositionsSameFile(file,file2);
			return;
		}
		while (count < file1.getStatements().size()) {
			ASTNode node = file2.getStatements().get(count);
			Position position = new Position(node.getStartPosition(), node
					.getLength());

			Position updatedPosition = new Position(file1.getStatements().get(
					count).getStartPosition(), file1.getStatements().get(count)
					.getLength());
			saveLinkedPositions(file, updatedPosition, position);
			System.out.println(++count + ")" + node + "[" + updatedPosition
					+ "]");

		}
	}

	private static void saveCheckedPositionsSameFile(IFile file, CSeRClone file2) throws CSeRException {
		int SIZE = file2.getStatements().size()/2;
		int count =0;
		while (count < SIZE) {
			ASTNode node = file2.getStatements().get(count);
			Position position = new Position(node.getStartPosition(), node
					.getLength());

			Position updatedPosition = new Position(file2.getStatements().get(
					count +SIZE).getStartPosition(), file2.getStatements().get(count)
					.getLength());
			saveLinkedPositions(file, updatedPosition, position);
			System.out.println(++count + ")" + node + "[" + updatedPosition
					+ "]");

		}
		
	}

	private static void saveLinkedPositions(IFile file, Position position,
			Position position2) throws CSeRException {

		CSeRClone file2 = getRCFFIle(file);
		if (file2 == null) {
			throw new CSeRException("The File doesn't exist in DB");
		}

		file2.addCheckPosition(position, position2);
	}

}
