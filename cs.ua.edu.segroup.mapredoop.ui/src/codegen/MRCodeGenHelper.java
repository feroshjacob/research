package codegen;

public class MRCodeGenHelper extends CodeGenerateHelper {
	@Override
	protected String getEndClass() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append( 
		"	\n"+
		"    public void readFields(DataInput arg0) throws IOException {\n" );
		StringBuffer readStr = new StringBuffer();
		StringBuffer writeStr = new StringBuffer();
		
		for(CodeGenerateHelper.Field field: fields){
			if(field.isMulti())
				readStr.append("		"+field.getFieldName()+"size = arg0.readInt();\n"+
							   "		"+field.getFieldName()+" = new "+field.getFieldtype()+"["+field.getFieldName()+"size];\n"+
							   "		for(int i=0; i< "+field.getFieldName()+"size; i++){\n"+
							   "		  "+field.getFieldName()+"[i] = arg0.read"+getType(field.getFieldtype())+"();\n"+
							   "		}\n");
			else
				readStr.append("	    "+field.getFieldName()+" = arg0.read"+getType(field.getFieldtype())+"();\n");
			
			if(field.isMulti())
				writeStr.append("		arg0.writeInt("+field.getFieldName()+"size);\n"+
								"		for(int i=0; i<"+field.getFieldName()+"size;i++){\n"+
								"			arg0.write"+getType(field.getFieldtype())+"("+field.getFieldName()+"[i]);\n"+
								"		}\n"
							);
			else
			writeStr.append("	    arg0.write"+getType(field.getFieldtype())+"("+field.getFieldName()+");\n");
		}
		
		buffer.append(readStr);
		
		buffer.append("	}\n"+
		"	public void write(DataOutput arg0) throws IOException {\n");
		buffer.append(writeStr);
		buffer.append(
		"		\n"+
		"	}\n");
		return buffer.toString()+  getComparable(className) +super.getEndClass();
	}
   private String getType(String fieldtype) {
	 if(fieldtype.equals("float")) return "Float";
	 if(fieldtype.equals("double")) return "Double";
	 if(fieldtype.equals("int")) return "Int";
	 if(fieldtype.equals("long")) return "Long";
	 throw new RuntimeException("Unexpected type" + fieldtype);

	}
@Override
   protected String getClassDeclaration(String name) {
	   
	   return 
	   "\n"+
	   "import java.io.DataInput;\n"+
	   "import java.io.DataOutput;\n"+
	   "import java.io.IOException;\n"+
	   "\n"+
	   "import org.apache.hadoop.io.WritableComparable;\n"+
	   "\n"+
	   "public class "+name+" implements WritableComparable<"+name+"> {\n"+
	   "	\n"+
	   "	public "+name+"() {\n"+
	   "		// TODO Auto-generated constructor stub\n"+
	   "	}\n";
	   
   }

private String getComparable (String name) {
return "	public int compareTo("+name+" arg0) {\n"+
"		\n"+
"       return 0;\n"+
"	}\n";	
}

}
 