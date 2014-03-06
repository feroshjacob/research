package codegen;

public abstract class  ReaderCodeGenHelper {
	
	public String createClass (){
		StringBuffer buffer = new StringBuffer();
		buffer.append(createClassDeclaration());
		buffer.append(createReadMethod());
		buffer.append(createReadSequenceFileMethod());
		buffer.append(createSequenceFileMethod());
		buffer.append(createObject());
		return buffer.toString();
	}
	
	protected abstract String createObject();

	protected String classType =null;
	protected String className =null;
	
	private String createReadMethod()  {return 	
			"	public void readFromTextFile(String in) {\n"+
			"		\n"+
			"		try {\n"+
			"			FileReader 	fr = new FileReader(in);\n"+
			"			BufferedReader br = new BufferedReader(fr);\n"+
			"			String s;\n"+
			"			List<"+classType+"> list = new ArrayList<"+classType+">();\n"+
			"			while((s = br.readLine()) != null) {\n"+
			"			if(s!=null && s.trim().length()>0)\n"+
			"			 list.add(create"+classType+"Object(s));\n"+
			"			}\n"+
			"			createSeqFile(list,in);\n"+
			"			fr.close();\n"+
			"		} catch (FileNotFoundException e) {\n"+
			"			e.printStackTrace();\n"+
			"		} catch (IOException e) {\n"+
			"			e.printStackTrace();\n"+
			"		}\n"+
			"	}\n"; 
	}
	
	private String createSequenceFileMethod() { 
		return 
		"	private void createSeqFile(List<"+classType+"> list, String in) {\n"+
		"		Configuration conf =  new Configuration();\n"+
		"	    Path input = new Path(in+\"seq\");\n"+
		"		try {\n"+
		"			FileSystem	fs1 = FileSystem.get(input.toUri(), conf);\n"+
		"		    if (fs1.exists(input))     fs1.delete(input, true);\n"+
		"			SequenceFile.Writer writer = new SequenceFile.Writer(fs1, conf, input, Text.class, "+classType+".class);\n"+
		"		      for ("+classType+"	 obj : list) {\n"+
		"		    	writer.append(new Text(), obj);\n"+
		"		      }\n"+
		"		   \n"+
		"		      writer.close();\n"+
		"		\n"+
		"		} catch (IOException e) {\n"+
		"			e.printStackTrace();\n"+
		"		}\n"+
		"	    	\n"+
		"	}\n";
	
	}
	
//	"		    "+classType+" value = ("+classType+") reader.getValueClass().newInstance();\n"+
	private String createReadSequenceFileMethod() {
		return 	"private String readSequenceFile(String in) {\n"+
			"		Configuration conf = new Configuration();\n"+
			"		Path samples = new Path(in);\n"+
			"		StringBuffer buffer = new StringBuffer();\n"+
			"\n"+
			"		try {\n"+
			"			FileSystem fs = FileSystem.get(samples.toUri(), conf);\n"+
			"			SequenceFile.Reader reader = new SequenceFile.Reader(fs, samples,\n"+
			"					conf);\n"+
			"		    Writable key =  (Writable) reader.getKeyClass().newInstance();\n"+
			"		    "+classType+" value = ("+classType+") reader.getValueClass().newInstance();\n"+
			"			while (reader.next(key, value)) {\n"+
			"				buffer.append(value.toString() +\"\\n\");\n"+
			"			}\n"+
			"			reader.close();\n"+
			"		} catch (IOException e) {\n"+
			"			e.printStackTrace();\n"+
			"		} catch (InstantiationException e) {\n"+
			"			e.printStackTrace();\n"+
			"		} catch (IllegalAccessException e) {\n"+
			"			e.printStackTrace();\n"+
			"		}\n"+
			"		return buffer.toString();\n"+
			"\n"+
			"	}\n";
 
	}
	protected abstract String getAdditonalImports() ;
	private String createClassDeclaration(){ return "package hadoop.utils;\n"+ getAdditonalImports()+
		"import java.io.BufferedReader;\n"+
		"import java.io.BufferedWriter;\n"+
		"import java.io.FileNotFoundException;\n"+
		"import java.io.FileReader;\n"+
		"import java.io.FileWriter;\n"+
		"import java.io.IOException;\n"+
		"import java.util.ArrayList;\n"+
		"import java.util.List;\n"+
		"import java.util.Map;\n"+
		"import java.util.StringTokenizer;\n"+
		"\n"+
		"import org.apache.hadoop.conf.Configuration;\n"+
		"import org.apache.hadoop.fs.FileSystem;\n"+
		"import org.apache.hadoop.fs.Path;\n"+
		"import org.apache.hadoop.io.SequenceFile;\n"+
		"import org.apache.hadoop.io.Writable;\n"+
		"import org.apache.hadoop.io.Text;\n"+
		"\n"+
		"public class GenFileReader {\n"+
		"\n"+
		"	public static void main(String[] args) {\n"+
		"		GenFileReader reader = new GenFileReader();\n"+
		"\n"+
		"		if (args[0].equals(\"write\")) {\n"+
		"			reader.readFromTextFile(args[1]);\n"+
		"			return;\n"+
		"		}\n"+
		"		String str = reader.readSequenceFile(args[0]);\n"+
		"		reader.writetoTextFile(args[1], str);\n"+
		"	}\n"+
		"\n"+
		"	private void writetoTextFile(String out, String content) {\n"+
		"		try {\n"+
		"			FileWriter fileWriter = new FileWriter(out);\n"+
		"			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);\n"+
		"			bufferedWriter.write(content);\n"+
		"			bufferedWriter.close();\n"+
		"			fileWriter.close();\n"+
		"		} catch (IOException e) {\n"+
		"			e.printStackTrace();\n"+
		"		}\n"+
		"\n"+
		"	}\n"+
		"\n";
	}

}
