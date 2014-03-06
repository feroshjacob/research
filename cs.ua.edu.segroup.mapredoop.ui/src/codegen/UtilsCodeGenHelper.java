package codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cs.ua.edu.se.mapRedoop.JavaFunction;
import cs.ua.edu.se.mapRedoop.MRBlock;

public class UtilsCodeGenHelper extends MainCodeGenHelper {
	private Map<String, String> name2Type = new HashMap<String, String>();
	private String mapName ;
	private String reduceName;
	private String paramMaptext =null;
	private String paramReducetext =null;
    private String reducerValueType =null;
	private String mapInitName;
	private String mapClearName;
	private String redInitName;
	private String redClearName;
	public UtilsCodeGenHelper(Map<String, String> name2Type, MRBlock block, String reducerValueType) {
		super(null, block);
		this.name2Type = name2Type;
		this.reducerValueType = reducerValueType;
		this.fieldTypes = getFieldTypes();
		calculateMapnames() ;
		
	}
	private void calculateMapnames() {
		 for(JavaFunction function : block.getMapper().getText().getJavafunctions()){
			 if(function.getTimeofCall().equals("call")) mapName = function.getParamname();
			 if(function.getTimeofCall().equals("before")) mapInitName = function.getParamname();
			 if(function.getTimeofCall().equals("after")) mapClearName = function.getParamname();
		 }
		 for(JavaFunction function : block.getReducer().getText().getJavafunctions()){
			 if(function.getTimeofCall().equals("call")) reduceName = function.getParamname();
			 if(function.getTimeofCall().equals("before"))redInitName = function.getParamname();
			 if(function.getTimeofCall().equals("after")) redClearName = function.getParamname();
		 }
		
	}
	public String createClass(String packageName, String className) {
		return super.createClass(packageName, className, "");
	}
	public Set<String> getFieldTypes() {
	     List<String> listofMapParams = getParams( true);
	     List<String> listofReduceParams = getParams( false);
	     HashSet<String> types = new HashSet<String>();
	     StringBuffer mapBuffer = new StringBuffer();
	     for(String list : listofMapParams){
	    	 String type = name2Type.get(list);
	    	 types.add(type);
	    	 String type1 = getWritableTypeNonNull(name2Type.get(list));
	    	 mapBuffer.append(type1 +" " + list +",");
	    	 
	     }
	     int length = mapBuffer.toString().length();
	     paramMaptext = mapBuffer.toString().substring(0, length-1);
	     StringBuffer redBuffer = new StringBuffer();
	     
	     for(String list : listofReduceParams){
	    	 String type = name2Type.get(list);
	    	 types.add(type);
	    	 if(reducerValueType.equals(type))
	         redBuffer.append("Iterable<"+type +"> " + list +",");
	    	 else{
	    	 String type1 = getWritableTypeNonNull(name2Type.get(list));
	    	 redBuffer.append(type1 +" " + list +",");
	    	 }
	     }
	     length = redBuffer.toString().length();
	     paramReducetext = redBuffer.toString().substring(0, length-1);
	     return types;
	}
	

	private List<String> getParams(boolean flag) {
		List<String> params = new ArrayList<String>();
	     if(flag){
	    	 
	    	 params.add(block.getMapper().getInkey().getArgname());
	    	 params.add(block.getMapper().getInvalue().getArgname());
	     }
	     else {
	    	 params.add(block.getReducer().getInkey());
	    	 params.add(block.getReducer().getInvalue());
	     } 
	     
		 return params;
	}
	
	@Override
	protected String getMainImports() {
		return 	"import org.apache.hadoop.mapreduce.Mapper.Context;\n";
		

	}
	@Override
	protected String getClassDeclaration(String name) {
		
		return "public class "+name+"  {\n"+ getMapMethod() + getRedMethod()  + getMapinitMethod() + 
		getMapclearMethod() +getRedInitMethod() + getRedclearMethod() ;
	}
	private String getRedInitMethod() {
		if(redInitName!=null)
			 return "public void " + redInitName + "( Context context)\n{\n\n}\n\n";
			return "";
	}
	private String getRedclearMethod() {
		if(redClearName!=null)
			 return "public void " + redClearName + "( Context context)\n{\n\n}\n\n";
			return "";
	}
	private String getMapinitMethod() {
		if(mapInitName!=null)
		 return "public void " + mapInitName + "( Context context)\n{\n\n}\n\n";
		return "";
	}
	private String getMapclearMethod() {
		if(mapClearName!=null)
		 return "public void " + mapClearName + "( Context context)\n{\n\n}\n\n";
		return "";
		 }
	
	
	private String getRedMethod() {
		if(reduceName!=null)
		 return "public void " + reduceName + "(" + paramReducetext +",  org.apache.hadoop.mapreduce.Reducer.Context context)\n{\n\n}\n\n";
		return "";
	}
	private String getMapMethod() {
		 return "public void " + mapName + "(" + paramMaptext +", Context context)\n{\n\n}\n\n";
	}
	@Override
	protected String getMainMethod() {
		// TODO Auto-generated method stub
		return "";
	}
	
}
