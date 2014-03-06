package hdp.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import utils.FileUtils;
import codegen.CodeGenerateHelper;
import codegen.FileReaderCodGenHelper;
import codegen.MRCodeGenHelper;
import codegen.MainCodeGenHelper;
import codegen.ReaderCodeGenHelper;
import codegen.ScannerCodeGenHelper;
import codegen.UtilsCodeGenHelper;
import cs.ua.edu.se.mapRedoop.Argument;
import cs.ua.edu.se.mapRedoop.Content;
import cs.ua.edu.se.mapRedoop.Entity;
import cs.ua.edu.se.mapRedoop.Feature;
import cs.ua.edu.se.mapRedoop.ListofEntities;
import cs.ua.edu.se.mapRedoop.MRBlock;
import cs.ua.edu.se.mapRedoop.MapRedoop;
import cs.ua.edu.se.mapRedoop.ReadorWrite;
import cs.ua.edu.se.mapRedoop.Type;

public class HelperHPDParser {

	
	private MapRedoop mapRedoop = null; 
	private Set<String> keyTypes = new HashSet<String>();
	private IProject project =null;
	private Set<String> writableEntities = new HashSet<String>();
	public static Map<String, String> name2Type = new HashMap<String, String>();
	String progName =null;
	private MRBlock block =null;
	public HelperHPDParser(MapRedoop mapRedoop, IProject iProject) {
		this.mapRedoop = mapRedoop;
		this.project =  iProject;
	}
	
	
	public void createClasses(boolean flag) {
		if(!flag){
		 updateClassPaths();	
		 setMapRedoopParams();
		 createDSClasses();
		 createMainClass();
		 createUtilClass();
		}
		else {
			 setMapRedoopParams();
			 createDSClasses();
				
		}
	

		
	}
	private void createUtilClass() {

		String classString = new UtilsCodeGenHelper(name2Type,block,reducerValueType ).createClass("hadoop.core", "CoreHelper");
		   FileUtils.writeToFile("core","CoreHelper.java", classString, project);
		   FileUtils.writeToFile("utils", "MRScanner.java", ScannerCodeGenHelper.classString, project);
	}



 private String reducerValueType =null;
	private void setMapRedoopParams() {
		progName = mapRedoop.getDeclaration().getName();
		for(Content content: mapRedoop.getContent()){
			   block = content.getMrBlocks();
              if(block==null) continue;
              addWritableEntities( block.getMapper().getInkey());
              	addWritableEntities(block.getReducer().getInkey(), block.getMapper().getOutKeyType());
              	addWritableEntities(  block.getMapper().getInvalue());
              	reducerValueType = addWritableEntities(block.getReducer().getInvalue(),  block.getMapper().getOutValueType());
              	addWritableEntities("",  block.getReducer().getOutKeyType());
              	addWritableEntities( "", block.getReducer().getOutValueType());
              	

		}
	}
	private void createMainClass() {
			String classString =  	new MainCodeGenHelper(keyTypes, block).createClass("hadoop.core", "Main", progName);
    	   FileUtils.writeToFile("core","Main.java", classString, project);
		
	}
	private void createDSClasses() {
		for(Content content: mapRedoop.getContent()){
		     ListofEntities entitieslist = content.getEntities();
		     if(entitieslist==null) continue;
		       for(Entity entity: entitieslist.getEntities()) {
		    	   String formatter =null;
		    	   List<CodeGenerateHelper.Field> fields = new ArrayList<CodeGenerateHelper.Field>();
		    	   CodeGenerateHelper codeGenerateHelper =  getCodeGenerator(entity.getName());
		    	   for(Feature feature: entity.getFeatures()){
		    		   
		    		 if(feature.getType()!=null)  {
		    			 if(feature.getType().isMulti())
		    				 fields.add(  codeGenerateHelper.new Field(feature.getName(), getFieldType(feature.getType().getReferenced()),true));
		    			 else
		    			 fields.add(  codeGenerateHelper.new Field(feature.getName(), getFieldType(feature.getType().getReferenced())));
		    		 }
		    		 else {
		    			  if(feature.getReadorWrite()!=null) {
		    				  ReadorWrite readorWrite = feature.getReadorWrite();
		    				  formatter= readorWrite.getReadval();
		    			  }
		    		 }
		    		 
		    	   }
		    	   String classString =  codeGenerateHelper.createClass("hadoop.ds", entity.getName(), fields,formatter);
		    	   FileUtils.writeToFile("ds", entity.getName()+".java", classString, project);
		    	   if(writable(entity.getName()) && formatter!=null){
		    		   String newclassString =  new FileReaderCodGenHelper("GenFileReader",
		    				   entity.getName(), formatter, fields).createClass();
			    	   FileUtils.writeToFile("utils","GenFileReader"+".java", newclassString, project);
			    	   formatter=null;
			    		   
		    	   }
		    	   
		       }
		 }
	}



	private void updateClassPaths() {
	
		try {
			 IJavaProject javaProject =JavaCore.create(project);
			IClasspathEntry[] entries = javaProject.getRawClasspath();
			IClasspathEntry[] newentries = new IClasspathEntry[entries.length+4];
			for(int i=0; i< entries.length;i++){
				IClasspathEntry entry = entries[i];
				if( entry.getPath().toOSString().contains("hadoop-")) return ;
				newentries[i] = entries[i];
			}
			IClasspathEntry libraryEntry = JavaCore.newLibraryEntry(new Path("/home/ferosh/research/cloud/hadoop-0.20.2/hadoop-0.20.2-core.jar"), null, null, false);
			IClasspathEntry libraryEntry2 = JavaCore.newLibraryEntry(new Path("/home/ferosh/research/cloud/hadoop-0.20.2/lib/commons-logging-1.0.4.jar"), null, null, false);
			IClasspathEntry libraryEntry3 = JavaCore.newLibraryEntry(new Path("/home/ferosh/research/cloud/hadoop-0.20.2/lib/commons-cli-1.2.jar"), null, null, false);
			IClasspathEntry libraryEntry4 = JavaCore.newLibraryEntry(new Path("/home/ferosh/research/cloud/hadoop-0.20.2/lib/commons-httpclient-3.0.1.jar"), null, null, false);
			newentries[entries.length]= libraryEntry;
			newentries[entries.length+1]= libraryEntry2;
			newentries[entries.length+2]= libraryEntry3;
			newentries[entries.length+3]= libraryEntry4;
			javaProject.setRawClasspath(newentries, null);
			
			
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private CodeGenerateHelper getCodeGenerator(String name) {
		if(writable(name)) 
		return new MRCodeGenHelper();
		else return new CodeGenerateHelper();
	}
	private boolean writable(String name) {
		if(writableEntities.contains(name))return true;
		return false;
	}
	public static String  getFieldType(Type type) {
		if( type.getName()==null)
			return type.getType();
		else return type.getName();
	}
	private String  addWritableEntities(Argument arg) {
		
		Type type = arg.getType();
		return addWritableEntities(arg.getArgname(), type);
	    }


	private String addWritableEntities(String name, Type type) {
		String argType =null;
		if( type.getName()==null){
			argType= type.getType();
			writableEntities.add(argType);
		}
		else argType= type.getName();
		keyTypes.add(argType);
		if(name!=null && name.length() >0 )name2Type.put(name, argType);
		return argType;
	}
	private String addWritableEntities(String name, String type) {
		String argType =null;
		argType= type;
		if( !isNative(type)){
			writableEntities.add(argType);
		}
		keyTypes.add(argType);
		if(name!=null && name.length() >0 )name2Type.put(name, argType);
		return argType;
	}


	public static boolean isNative(String type) {
		 if(type.equals("int"))
		return true; 
		 if(type.equals("long"))
			return true;
		 if(type.equals("double"))
				return true;
		 if(type.equals("float"))
				return true;
		 if(type.equals("text"))
				return true;
		 return false;
	}
	 
	}
