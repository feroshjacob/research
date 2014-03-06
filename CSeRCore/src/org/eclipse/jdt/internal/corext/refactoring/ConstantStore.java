package org.eclipse.jdt.internal.corext.refactoring;

import org.eclipse.core.resources.IFile;

public class ConstantStore {
	
	private static IFile file =null;
	private static String newFilepath =null;
	private static String newName = "";
	public static IFile getFile() {
		return file;
	}
	public static void setFile(IFile file) {
		ConstantStore.file = file;
	}
	public static String getNewFilepath() {
		return newFilepath;
	}
	public static void setNewFilepath(String newFilepath) {
		ConstantStore.newFilepath = newFilepath;
	}
	public static String getNewName() {
		return newName;
	}
	public static void setNewName(String newName) {
		ConstantStore.newName = newName;
	}


}
