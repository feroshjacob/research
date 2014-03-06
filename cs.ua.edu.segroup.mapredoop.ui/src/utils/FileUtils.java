package utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class FileUtils {

	public static void copyToFile(IFile file,String folderName, String fileName, IProject  project) {
		StringBuilder contents = new StringBuilder();

		InputStream input;
		try {
			input = file.getContents();
			int line = 0;
			while ((line = input.read()) != -1) {
				contents.append((char) line);

			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeToFile(folderName,fileName, contents.toString(), project);
	}
	public static IFile writeToFile(String folderName,String fileName, String text, IProject project) {
		
		IFile file = getFile(folderName,fileName, project);
		try {
			InputStream source = new ByteArrayInputStream(text.getBytes());

			if (file.exists())  file.delete(true, null);
				try {
					file.create(source, IResource.NONE, null);
					return file;
				} catch (CoreException e) {
					e.printStackTrace();
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
		
	}
	public static void writeToFile(String fileName, String text, IProject  project) {
	
		writeToFile(null, fileName, text, project);
  
	}

	public static IFile getFile(String fileName, IProject project) {
         return getFile(null, fileName, project);
	}
	public static IFile getFile(String folderName,String fileName, IProject project) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		if(folderName==null) return  project.getFile(fileName);
         IFolder  srcfolder = project.getFolder("src");  
         if(!srcfolder.exists()){
        	 try {
				srcfolder.create(IResource.NONE, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
         IFolder  hadoopfolder = srcfolder.getFolder("hadoop");  
         if(!hadoopfolder.exists()){
        	 try {
        		 hadoopfolder.create(IResource.NONE, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
         IFolder  folder = hadoopfolder.getFolder(folderName);  
         if(!folder.exists()){
        	 try {
        		 folder.create(IResource.NONE, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
        
         return	folder.getFile(fileName);
	
	}

}
