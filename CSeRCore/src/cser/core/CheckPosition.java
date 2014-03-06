package cser.core;


import org.eclipse.jface.text.Position;

import cser.utils.PositionUtils;

public class CheckPosition {
	private boolean isdeleted = false;
	private String currentPosition =null;
	private String parentPosition = null;
	public CheckPosition(String currentPosition, String parentPosition) {
		this.setCurrentPosition(currentPosition);
		this.setParentPosition(parentPosition);
	}
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	public Position getCurrentPosition() {
		return PositionUtils.getPosition(currentPosition);
	}

	public void setParentPosition(String parentPosition) {
		this.parentPosition = parentPosition;
	}
	public Position getParentPosition() {
		return PositionUtils.getPosition(parentPosition);
	}
	public boolean containsCurrent(String position) {
		return PositionUtils.contains(this.currentPosition, position);
	}
	
	public boolean equals(Object obj) {
		if(obj==null || ! (obj instanceof CheckPosition)) return false;
		CheckPosition checkPosition = (CheckPosition) obj;
		return checkPosition.currentPosition.equals(this.currentPosition);
	}
	public int hashCode() {
		return this.currentPosition.hashCode();
	}

	public String toString() {
		
	return "O="+parentPosition +",C=" + currentPosition;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public boolean Isdeleted() {
		return isdeleted;
	}
}
