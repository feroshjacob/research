package codegen;

import hdp.parser.HelperHPDParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


import cs.ua.edu.se.mapRedoop.JavaFunction;
import cs.ua.edu.se.mapRedoop.MRBlock;
import cs.ua.edu.se.mapRedoop.Type;

public class MainCodeGenHelper extends CodeGenerateHelper {
	
	protected Set<String> fieldTypes = new HashSet<String>();
	private boolean isSimple; 
	protected MRBlock block ;
	private String className; 
	private String progName;
	private String formatter;
	private String mapName;
	private String reduceName;

	public MainCodeGenHelper(Set<String> fields, MRBlock block) {
	 this.fieldTypes = fields;
	 this.isSimple = true;
	 this.block = block;
	 calculateMapnames();
	
	}
	private void calculateMapnames() {
		 for(JavaFunction function : block.getMapper().getText().getJavafunctions()){
			 if(function.getTimeofCall().equals("call")) mapName = function.getParamname();
		 }
		 for(JavaFunction function : block.getReducer().getText().getJavafunctions()){
			 if(function.getTimeofCall().equals("call")) reduceName = function.getParamname();
		 }
		
	}
	public String createClass(String packageName, String className, String progName) {
		this.className = className;
		this.progName = progName;
		return super.createClass(packageName, className, new ArrayList<Field>(), formatter);
	}
	
	@Override
	protected String getpackageDeclaration(String name) {
		// TODO Auto-generated method stub
		return super.getpackageDeclaration(name) + getMainImports() + getAdditionalImports() ;
	}
	protected String getMainImports() {
		return IMainCode.imports;
	}
	
	protected String getAdditionalImports() {
		StringBuffer buffer = new StringBuffer();
		for(String type : fieldTypes){
			String  typeName =getWritableType(type);
			if(typeName!=null)
			buffer.append("import org.apache.hadoop.io."+getWritableType(type)+";\n");
			else {
				buffer.append("import hadoop.ds."+type+";\n");
				isSimple = false;
			}
		}
		if(!isSimple) buffer.append(IMainCode.sequenceImports);
	 return buffer.toString();
	}
	protected String getWritableType(String type){
		if(type.equals("int")) return "IntWritable";
		if(type.equals("long")) return "LongWritable";
		if(type.equals("double")) return "DoubleWritable";
		if(type.equals("float")) return "FloatWritable";
		if(type.equals("text")) return "Text";
		return null;
	}
	private String getWritableTypeNonNull(Type type) {
		String strType = HelperHPDParser.getFieldType(type);
		String value = getWritableType(strType);
		if(value==null) return strType;
		return value;
	}
	protected String getWritableTypeNonNull(String strType) {
		String value = getWritableType(strType);
		if(value==null) return strType;
		return value;
	}
	@Override
	protected String getClassDeclaration(String name) {
		
		return "public class "+name+" extends Configured implements Tool {\n"+ getMapper(mapName) + getReducer(reduceName)+ getRun();
	}
	
	private String getReducer(String callerName) {
		
		return "	public static class Reduce extends Reducer<"+getWritableTypeNonNull(block.getMapper().getOutKeyType())+"" +
				", "+getWritableTypeNonNull(block.getMapper().getOutValueType())+"" +
						", "+getWritableTypeNonNull(block.getReducer().getOutKeyType())+"," +
								" "+getWritableTypeNonNull(block.getReducer().getOutValueType())+"> {\n"+
		"		public void reduce("+getWritableTypeNonNull(block.getMapper().getOutKeyType())+" " +
				""+block.getReducer().getInkey()+", Iterable<" +
						""+getWritableTypeNonNull(block.getMapper().getOutValueType())+"> " +
								""+block.getReducer().getInvalue()+", Context context) throws IOException, InterruptedException {\n"+
								"		    new CoreHelper()."+callerName+"( "+block.getReducer().getInkey()+"," +
								""+block.getReducer().getInvalue()+",context);	\n"+

		"\n"+
		"\n"+
		"\n"+
		"		}\n"+
		"	}\n";
	}
	private String getRun() {
		
		String start= "	public int run(String[] args) throws Exception {\n"+
		"\n"+
		"		Path finaloutput = new Path(args[1]);\n"+
		"		Path input = new Path(args[0]);\n"+
		"			Configuration configuration = new Configuration();\n"+
		"			FileSystem	fs1 = FileSystem.get(finaloutput.toUri(), configuration);\n"+
		"		    if (fs1.exists(finaloutput))     fs1.delete(finaloutput, true);\n"+
		"			Job job = new Job(configuration, \""+progName+"\"); \n"+
		"			job.setOutputKeyClass("+getWritableTypeNonNull(block.getReducer().getOutKeyType())+".class);\n"+
		"			job.setOutputValueClass("+getWritableTypeNonNull(block.getReducer().getOutValueType())+".class);\n"+
		"\n"+
		"			job.setMapperClass(MapClass.class);\n"+
		"			job.setReducerClass(Reduce.class);\n";
		StringBuffer buffer = new StringBuffer(start);
		
		String seq =	"			job.setInputFormatClass(SequenceFileInputFormat.class); 	\n"+
		"			job.setOutputFormatClass(SequenceFileOutputFormat.class);\n";
		if(!isSimple) buffer.append(seq);
		String end=
		"			FileInputFormat.addInputPath(job, input);\n"+
		"			FileOutputFormat.setOutputPath(job,finaloutput);\n"+
		"			job.setJarByClass("+className+".class);\n"+
		"			\n"+
		"			if (job.waitForCompletion(true) == false) {\n"+
		"				throw new InterruptedException(\""+progName+" Iteration failed processing \" );\n"+
		"			}\n"+
		"			\n"+
		"		return 0;\n"+
		"\n"+
		"	}\n";
		buffer.append(end);
		return buffer.toString();
		
		

	}
	private String getMapper(String callerName) {
		
		return 
		"	public static class MapClass extends Mapper<"+getWritableTypeNonNull(block.getMapper().getInkey().getType())+"" +
				", "+getWritableTypeNonNull(block.getMapper().getInvalue().getType())+", " +
						""+getWritableTypeNonNull(block.getMapper().getOutKeyType())+", " +
								""+getWritableTypeNonNull(block.getMapper().getOutValueType())+"> {\n"+
		"\n"+
		"		protected void map("+getWritableTypeNonNull(block.getMapper().getInkey().getType())+" " +
					block.getMapper().getInkey().getArgname()+", " +
							""+getWritableTypeNonNull(block.getMapper().getInvalue().getType())+" " +
									""+block.getMapper().getInvalue().getArgname()+", Context context)\n"+
		"		throws IOException, InterruptedException{\n"+
		"		    new CoreHelper()."+callerName+"( "+block.getMapper().getInkey().getArgname()+"," +
				""+block.getMapper().getInvalue().getArgname()+",context);	\n"+
		"\n"+ 
		"\n"+
		"		}\n"+ getAdditonalMapMethods()+
		"	\n"+
		"	}\n";
	}
	private String getAdditonalMapMethods() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(getMapMethod("before", "setup"));
		buffer.append(getMapMethod("after", "cleanup"));
		return buffer.toString();
		}
	private String getMapMethod(String timeofCall, String callName) {
		for(JavaFunction function: block.getMapper().getText().getJavafunctions()){
			if(function.getTimeofCall().equals(timeofCall)){
				return "		protected void "+callName+"(org.apache.hadoop.mapreduce.Mapper<org.apache.hadoop." +
						"io."+getWritableTypeNonNull(block.getMapper().getInkey().getType())+","+getWritableTypeNonNull(block.getMapper().getInvalue().getType())+"," +
								""+getWritableTypeNonNull(block.getMapper().getOutKeyType())+","+getWritableTypeNonNull(block.getMapper().getOutValueType())+">.Context context) \n"+
				"		throws IOException ,InterruptedException {\n"+
				"		    new CoreHelper()."+function.getParamname()+"( context);	\n"+
				"		}\n";
			}
		}
		return "";
		
	}

	@Override
	protected String getEndClass() {
		return getMainMethod()+ super.getEndClass();
	}
	protected String getMainMethod() {
		return IMainCode.mainMethod;
	}

}
