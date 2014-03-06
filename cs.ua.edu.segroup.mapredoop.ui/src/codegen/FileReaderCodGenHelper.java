package codegen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import codegen.CodeGenerateHelper.Field;

public class FileReaderCodGenHelper extends ReaderCodeGenHelper {
	
	private String formatter =null;
	private List<CodeGenerateHelper.Field> fields = null;
	public FileReaderCodGenHelper(String className,String classType, String formatter,  List<CodeGenerateHelper.Field> fields) {
    this.className = className;
	this.classType = classType;	
	this.formatter = formatter;
	this.fields = fields;
	}

	@Override
	protected String createObject() {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(getstart());
		for(Field field: fields){
			
			buffer.append("	 if(map.get(\""+field.getFieldName()+"\")!=null)	{\n" );
			if(field.isMulti()){
				buffer.append(
						"		String "+field.getFieldName()+"str =  map.get(\""+field.getFieldName()+"\");\n"+
						"		StringTokenizer tokenizer = new StringTokenizer("+field.getFieldName()+"str);\n"+
						"		obj.set"+field.getFieldName()+"size(tokenizer.countTokens());\n"+
						"		"+field.getFieldtype()+"[] "+field.getFieldName()+" = new "+field.getFieldtype()+"[obj.get"+field.getFieldName()+"size()];\n"+
						"		for(int i=0;i<obj.get"+field.getFieldName()+"size();i++){\n"+
						"			"+field.getFieldName()+"[i]= "+getParseType(field.getFieldtype())+"(tokenizer.nextToken());\n"+
						"		}\n"+
						"	    obj.setadjacentlist(adjacentlist);\n");
			}
			else {
				if(field.getFieldtype().equals("text"))
				buffer.append(
				"		String  "+field.getFieldName()+" =  map.get(\""+field.getFieldName()+"\");\n");
				buffer.append(
			    "		"+field.getFieldtype()+"  "+field.getFieldName()+" =  "+getParseType(field.getFieldtype())+"(map.get(\""+field.getFieldName()+"\"));\n"+
			    "	    obj.set"+field.getFieldName()+"("+field.getFieldName()+");\n");
			}
			buffer.append("	 }\n" );
		}

		buffer.append(getEnd());
		return buffer.toString();
	}
		

	private String getParseType(String fieldtype) {
		 if("int".equals(fieldtype)) return "Integer.parseInt";
		 if("long".equals(fieldtype)) return "Long.parseLong";
		 if("double".equals(fieldtype)) return "Double.parseDouble";
		 if("float".equals(fieldtype)) return "Float.parseFloat";
		 throw new RuntimeException("Now supports only basic type");
	}
	private String getType(String fieldtype) {
		 if("int".equals(fieldtype)) return "Integer";
		 if("long".equals(fieldtype)) return "Long";
		 if("double".equals(fieldtype)) return "Double";
		 if("float".equals(fieldtype)) return "Float";
		 throw new RuntimeException("Now supports only basic type");
	}

	private String getstart() {
		
		return "	private "+classType+" create"+classType+"Object(String s) {\n"+
		"	    "+classType+" obj = new "+classType+"();\n"+
		"	    Map<String, String> map = new  MRScanner(s, \""+formatter+"\").parse();\n";
	}
	private String getEnd() {
		
		return "	    return obj;\n"+
		"	    \n"+
		"	}\n" +
		"}";
	}

	@Override
	protected String getAdditonalImports() {
		return "import hadoop.ds."+classType+";\n";
	}

}
