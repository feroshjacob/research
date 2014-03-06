package ui.actions;

public interface ITemplate {
	
String imports ="\n"+
"import java.io.IOException;\n"+
"import java.util.ArrayList;\n"+
"import java.util.Iterator;\n"+
"import java.util.List;\n"+
"import java.util.StringTokenizer;\n"+
"\n"+
"import org.apache.hadoop.conf.Configuration;\n"+
"import org.apache.hadoop.conf.Configured;\n"+
"import org.apache.hadoop.fs.Path;\n"+
"import org.apache.hadoop.io.IntWritable;\n"+
"import org.apache.hadoop.io.LongWritable;\n"+
"import org.apache.hadoop.io.Text;\n"+
"import org.apache.hadoop.mapred.FileInputFormat;\n"+
"import org.apache.hadoop.mapred.FileOutputFormat;\n"+
"import org.apache.hadoop.mapred.JobClient;\n"+
"import org.apache.hadoop.mapred.JobConf;\n"+
"import org.apache.hadoop.mapred.MapReduceBase;\n"+
"import org.apache.hadoop.mapred.Mapper;\n"+
"import org.apache.hadoop.mapred.Reducer;\n"+
"import org.apache.hadoop.mapred.OutputCollector;\n"+
"import org.apache.hadoop.mapred.Reporter;\n"+
"import org.apache.hadoop.util.Tool;\n"+
"import org.apache.hadoop.util.ToolRunner;\n"+
"\n"+
"/**\n"+
" * This is an example Hadoop Map/Reduce application.\n"+
" * It reads the text input files, breaks each line into words\n"+
" * and counts them. The output is a locally sorted list of words and the \n"+
" * count of how often they occurred.\n"+
" *\n"+
" * To run: bin/hadoop jar build/hadoop-examples.jar wordcount\n"+
" *            [-m <i>maps</i>] [-r <i>reduces</i>] <i>in-dir</i> <i>out-dir</i> \n"+
" */\n";

String mainpart ="public class Main extends Configured implements Tool {\n"+
"  \n"+
"  /**\n"+
"   * Counts the words in each line.\n"+
"   * For each line of input, break the line into words and emit them as\n"+
"   * (<b>word</b>, <b>1</b>).\n"+
"   */\n"+
"  \n"+
"  \n"+
"  static int printUsage() {\n"+
"    System.out.println(\"wordcount [-m <maps>] [-r <reduces>] <input> <output>\");\n"+
"    ToolRunner.printGenericCommandUsage(System.out);\n"+
"    return -1;\n"+
"  }\n"+
"  \n"+
"  /**\n"+
"   * The main driver for word count map/reduce program.\n"+
"   * Invoke this method to submit the map/reduce job.\n"+
"   * @throws IOException When there is communication problems with the \n"+
"   *                     job tracker.\n"+
"   */\n"+
"  public int run(String[] args) throws Exception {\n"+
"    JobConf conf = new JobConf(getConf(), Main.class);\n"+
"    conf.setJobName(\"wordcount\");\n"+
" \n"+
"    // the keys are words (strings)\n"+
"    conf.setOutputKeyClass(Text.class);\n"+
"    // the values are counts (ints)\n"+
"    conf.setOutputValueClass(IntWritable.class);\n"+
"    \n"+
"    conf.setMapperClass(MapperImpl.class);\n"+
"    conf.setCombinerClass(ReducerImpl.class);\n"+
"    conf.setReducerClass(ReducerImpl.class);\n"+
"    \n"+
"    List<String> other_args = new ArrayList<String>();\n"+
"    for(int i=0; i < args.length; ++i) {\n"+
"      try {\n"+
"        if (\"-m\".equals(args[i])) {\n"+
"          conf.setNumMapTasks(Integer.parseInt(args[++i]));\n"+
"        } else if (\"-r\".equals(args[i])) {\n"+
"          conf.setNumReduceTasks(Integer.parseInt(args[++i]));\n"+
"        } else {\n"+
"          other_args.add(args[i]);\n"+
"        }\n"+
"      } catch (NumberFormatException except) {\n"+
"        System.out.println(\"ERROR: Integer expected instead of \" + args[i]);\n"+
"        return printUsage();\n"+
"      } catch (ArrayIndexOutOfBoundsException except) {\n"+
"        System.out.println(\"ERROR: Required parameter missing from \" +\n"+
"                           args[i-1]);\n"+
"        return printUsage();\n"+
"      }\n"+
"    }\n"+
"    // Make sure there are exactly 2 parameters left.\n"+
"    if (other_args.size() != 2) {\n"+
"      System.out.println(\"ERROR: Wrong number of parameters: \" +\n"+
"                         other_args.size() + \" instead of 2.\");\n"+
"      return printUsage();\n"+
"    }\n"+
"    FileInputFormat.setInputPaths(conf, other_args.get(0));\n"+
"    FileOutputFormat.setOutputPath(conf, new Path(other_args.get(1)));\n"+
"        \n"+
"    JobClient.runJob(conf);\n"+
"    return 0;\n"+
"  }\n"+
"  \n"+
"  \n"+
"  public static void main(String[] args) throws Exception {\n"+
"    int res = ToolRunner.run(new Configuration(), new Main(), args);\n"+
"    System.exit(res);\n"+
"  }\n"+
"\n"+
"}\n";

String mapperpart = "  public  class MapperImpl extends MapReduceBase\n"+
"    implements Mapper<LongWritable, Text, Text, IntWritable> {\n"+
"    \n"+
"    private final static IntWritable one = new IntWritable(1);\n"+
"    private Text word = new Text();\n"+
"    \n"+
"    public void map(LongWritable key, Text value, \n"+
"                    OutputCollector<Text, IntWritable> output, \n"+
"                    Reporter reporter) throws IOException {\n"+
"      }\n"+
"    }\n";
String reducerpart = "  /**\n"+
"   * A reducer class that just emits the sum of the input values.\n"+
"   */\n"+
"  public  class ReducerImpl extends MapReduceBase\n"+
"    implements Reducer<Text, IntWritable, Text, IntWritable> {\n"+
"    \n"+
"    public void reduce(Text key, Iterator<IntWritable> values,\n"+
"                       OutputCollector<Text, IntWritable> output, \n"+
"                       Reporter reporter) throws IOException {\n"+
"      int sum = 0;\n"+
"      while (values.hasNext()) {\n"+
"        sum += values.next().get();\n"+
"      }\n"+
"      output.collect(key, new IntWritable(sum));\n"+
"    }\n"+
"  }\n";

String driverClass ="import org.apache.hadoop.util.ProgramDriver;\n"+
"\n"+
"public class Driver { \n"+
"	public static void main(String argv[]){ \n"+
"		int exitCode = -1;   \n"+
"		ProgramDriver pgd = new ProgramDriver(); \n"+
"		try {      \n"+
"			pgd.addClass(\"mapredoop\", Main.class,  \"A \"); \n"+
"			pgd.driver(argv);      \n"+
"			// Success  \n"+
"			exitCode = 0;    }   \n"+
"		catch(Throwable e){ \n"+
"			e.printStackTrace();     \n"+
"			} \n"+
"		System.exit(exitCode);  \n"+
"		\n"+
"		}\n"+
"	\n" +
"}";

}



