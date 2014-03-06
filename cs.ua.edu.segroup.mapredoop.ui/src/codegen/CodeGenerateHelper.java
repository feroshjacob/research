package codegen;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerateHelper  {
	
	protected List<CodeGenerateHelper.Field> fields = null;
    protected String className =null;
		
    private String formatter =null;
	
	public String createClass (String packageName, String className, List<CodeGenerateHelper.Field> fields,String formatter){
		this.formatter = formatter;
		this.fields = fields;
		this.className = className;
		StringBuffer buffer = new  StringBuffer(getpackageDeclaration(packageName));
		buffer.append(getClassDeclaration(className));
		for(CodeGenerateHelper.Field field: fields){
			buffer.append(getFieldDeclaration(field));
		}
		buffer.append(getEndClass());
		return buffer.toString();
	}
	protected String getpackageDeclaration(String name){
		return "package "+name+";\n\n";
	}
	protected String getClassDeclaration(String name){
		return "public class "+name+" {\n\n";
	}
	private String getFieldDeclaration(CodeGenerateHelper.Field field){
		
		if(field.isMulti()){
			StringBuffer buffer = new StringBuffer();
			String sizename = field.getFieldName()+ "size";
			String sizetype = "int";
			buffer.append(getFieldDeclaration(sizename, sizetype));
			String name = field.getFieldName();
			String type = field.getFieldtype()+"[]";
			buffer.append(getFieldDeclaration(name, type));
			return buffer.toString();
		}
		else {
		String name = field.getFieldName();
		String type = field.getFieldtype();
		
		return getFieldDeclaration(name, type);
		}

	}
	private String getFieldDeclaration(String name, String type) {
		return
		"	private "+type+" "+name+";\n"+
		"	public void set"+name+"("+type+" "+name+") {\n"+
		"		this."+name+" = "+name+";\n"+
		"	}\n"+
		"	public "+type+" get"+name+"() {\n"+
		"		return "+name+";\n"+
		"	}\n";
	}
	protected String getEndClass() {
		
		return getFormatter()+ "\n"+
		"}\n";
		
	}
	private String getFormatter() {
		 if(formatter==null) return "";
		 
		return 
		"	public String toString() {\n"+
		"	    	StringBuffer buffer = new StringBuffer();\n"+ getBufferAppends()+
		"	    	return buffer.toString();\n"+
		"	}\n";
		
	}
	private String getBufferAppends() {
		String[] parts = formatter.split("%");
		List<String> fiedNames = new ArrayList<String>();
		for(Field field: fields){
			fiedNames.add(field.getFieldName());
		}
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i< parts.length;i++){
			if(fiedNames.contains(parts[i])){
				
				if(ismUlti(parts[i])){
					buffer.append(
    	    	"for(int i =0;i< "+parts[i]+"size; i++)\n"+
	            "	buffer.append(\" \" +"+parts[i]+"[i] +\" \");\n");
				}
				else 
					buffer.append("	    	buffer.append("+parts[i]+");\n");
			}
			else buffer.append("	    	buffer.append(\""+parts[i]+"\");\n");
		
		}
			
		return buffer.toString();
	}
	private boolean ismUlti(String string) {
		  for(Field field : fields ){
		  	  if(field.getFieldName().equals(string)){
		  		  return field.isMulti;
		  	  }
		  }
		  return false;
		}
	public class Field {
		private String fieldName;
		private String fieldtype;
		private boolean isMulti;
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public String getFieldName() {
			return fieldName;
		}
		public Field(String fieldName, String fieldtype) {
			super();
			this.fieldName = fieldName;
			this.fieldtype = fieldtype;
			this.isMulti= false;
		}

		public Field(String fieldName, String fieldtype, boolean multi) {
			super();
			this.fieldName = fieldName;
			this.fieldtype = fieldtype;
			this.isMulti= true;
		}
		public void setFieldtype(String fieldtype) {
			this.fieldtype = fieldtype;
		}
		public String getFieldtype() {
			return fieldtype;
		}
		public void setMulti(boolean isMulti) {
			this.isMulti = isMulti;
		}
		public boolean isMulti() {
			return isMulti;
		}
		
	}
}
