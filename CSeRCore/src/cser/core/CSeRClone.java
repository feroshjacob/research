package cser.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jface.text.Position;

public class CSeRClone {
	public CSeRClone(IFile file1) {
		this.file = file1;
		fileName = file.getName();
	}

	private IFile file = null;
	private CSeRClone parent = null;
	private String fileName = "";
	private CheckPositions checkPositions = new CheckPositions();
	private List<ASTNode> statements = new ArrayList<ASTNode>();
	private CSeRChanges changes = new CSeRChanges();

	public void setChanges(CSeRChanges changes) {
		this.changes = changes;
	}

	public CSeRClone getParent() {
		return parent;
	}

	public void setParent(CSeRClone parent) {
		this.parent = parent;
	}

	public CheckPositions getCheckPositions() {
		return checkPositions;
	}

	public void setCheckPositions(CheckPositions checkPositions) {
		this.checkPositions = checkPositions;
	}

	public void addCheckPosition(Position currentPosition,
			Position parentPosition) {
		CheckPosition checkPosition = new CheckPosition(currentPosition
				.toString(), parentPosition.toString());
		checkPositions.put(parentPosition.toString(), checkPosition);
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public IFile getFile() {
		return file;
	}

	public void setFile(IFile file) {
		this.file = file;
	}

	public void setStatements(List<ASTNode> statements) {
		if(this.statements!=null && this.statements.size() >0) {
			this.statements.addAll(statements);
		}
		else 
		this.statements = statements;
	}

	public List<ASTNode> getStatements() {
		return statements;
	}

	public void addStatement(ASTNode astNode) {
		this.statements.add(astNode);
	}

	public void addChange(String chgmessage,int type, String position,String parentPosition,String fileName) {
		this.changes.addChange(chgmessage,type, position,parentPosition,fileName);
	}
	public void addChangeForParent(String chgmessage,int type, String position,String parentPosition,String fileName) {
		this.changes.addChange(chgmessage,type, position,parentPosition,fileName,true);
	}

	public CSeRChanges getChanges() {
		return changes;
	}

}
