package cser.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.Position;

public class PositionUtils {
	
	
	public static void main(String[] args) {
		Position pos1 = new Position(23,23);
		Position pos2 = new Position(23,23);
		
		System.out.println( PositionUtils.contains(pos1,pos2));
	}
	
	/*
	 * position2 is contained in position1 
	 * 
	 */
	public static boolean contains(Position pos1, Position pos2) {

		if (pos1.offset > pos2.offset)
			return false;
		if (getSecondPoint(pos1) < getSecondPoint(pos2))
			return false;
		return true;
	}
	public static boolean strictlycontains(Position pos1, Position pos2) {

		if(pos1.getOffset()==pos2.getOffset() && pos1.getLength()== pos2.getLength()) return false;
		if(getSecondPoint(pos1)==getSecondPoint(pos2)) return false;
		else return  contains(pos1, pos2);

	}
	public static boolean containsOrContainsPart(Position pos1, Position pos2) {
		
	
		if (pos2.offset >= pos1.offset && pos1.offset + pos1.length > pos2.offset )
			return true;
				return false;
	}

	public static boolean contains(String pos1, String pos2) {

	 return contains(getPosition(pos1), getPosition(pos2));
	}
	

	private static int getSecondPoint(Position pos) {
		return pos.length + pos.offset;
	}
	
	
	public static Position getPosition(String position){
		String strings[] = position.split(":");
		int offset=0;
		int length=0;
		try {
			offset = Integer.parseInt(strings[1].split(",")[0].trim());
			length = Integer.parseInt(strings[2].replace("(deleted)", "").trim());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Position(offset,length);

	}
	
	public static boolean isSame(Position pos1,Position pos2){
		if(pos1.length != pos2.length) return false;
		if(pos1.offset != pos2.offset) return false;
		return true;
		
	}

}
