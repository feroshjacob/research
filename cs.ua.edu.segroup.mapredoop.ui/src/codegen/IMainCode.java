package codegen;

public interface IMainCode {
	
	String imports ="import java.io.IOException;\n"+
	"import org.apache.hadoop.conf.Configuration;\n"+
	"import org.apache.hadoop.conf.Configured;\n"+
	"import org.apache.hadoop.fs.Path;\n"+
	"import org.apache.hadoop.mapreduce.Job;\n"+
	"import org.apache.hadoop.mapreduce.Mapper;\n"+
	"import org.apache.hadoop.mapreduce.Reducer;\n"+
	"import org.apache.hadoop.util.Tool;\n"+
	"import org.apache.hadoop.util.ToolRunner;\n" +
	"import org.apache.hadoop.fs.FileSystem;\n";

  String sequenceImports = "import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;\n"+
  "import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;\n"+
  "import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;\n"+
  "import org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat;\n";
	
	String mainMethod ="	public static void main(String[] args) throws Exception {\n"+
	"	//	Setup.begin();\n"+
	"		int res = ToolRunner\n"+
	"		.run(new Configuration(), new Main(), args);\n"+
	"	//	Setup.end();\n"+
	"		System.exit(res);\n"+
	"\n"+
	"	}\n";

}
