package hdp.parser;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.internal.menus.TrimAdditionCacheEntry;

import cs.ua.edu.se.MapRedoopStandaloneSetup;
import cs.ua.edu.se.mapRedoop.Content;
import cs.ua.edu.se.mapRedoop.MRBlock;
import cs.ua.edu.se.mapRedoop.MapRedoop;

public class MainParser {
	
	private static MapRedoop mapRedoop ;
	
	public static void init(IFile file){
		if(mapRedoop==null)
			getMapRedoop(file);
	}


	public static MapRedoop getMapRedoop(IFile currentFile) {
		new MapRedoopStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource= rs.getResource(URI.createURI(currentFile.getFullPath().toString()), true);
		
		 mapRedoop = (MapRedoop) resource.getContents().get(0);
		 return mapRedoop;
	}


	public static MapRedoop getMapRedoop() {
		return mapRedoop;
	}
	

 private  static String trim(String text){
     String finalTeString = text.replace('[', ' ');
     String finalFinal = finalTeString.replace(']', ' ');
     return finalFinal;
 }

}
