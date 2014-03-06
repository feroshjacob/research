package codegen;

public class ScannerCodeGenHelper {
	

	
	public static String classString = "\n"+
	"package hadoop.utils;\n"+
	"\n"+
	"import java.util.HashMap;\n"+
	"import java.util.Map;\n"+
	"\n"+
	"public class MRScanner {\n"+
	"\n"+
	"	private Map<String, String> map = new HashMap<String, String>();\n"+
	"	private String input =null;\n"+
	"	private String parse=null;\n"+
	"\n"+
	"	public MRScanner(String input, String parse) {\n"+
	"		super();\n"+
	"       if(input==null || input.trim().length() <1) return; \n"+	
	"		this.input = input;\n"+
	"		this.parse = parse;\n"+
	"	}\n"+
	"\n"+
	"	public  Map<String, String> parse() {\n"+
	"       if(input==null || input.trim().length() <1) return map; \n"+
	"		char[] iarray = input.trim().toCharArray();\n"+
	"		char[] parray = parse.trim().toCharArray();\n"+
	"			StringBuffer pbuffer = new StringBuffer();\n"+
	"		boolean start=false, end=false ;\n"+
	"		for(int i=0; i<parray.length;i++){\n"+
	"			int length=getValues(map)-getKeys(map);\n"+
	"			if(i+length < iarray.length)\n"+
	"			if(iarray[i+length]== parray[i])  continue;\n"+
	"			if(parray[i]=='%'&& start) {\n"+
	"				end =true;\n"+
	"				start=false;\n"+
	"			}\n"+
	"			else if(parray[i]=='%'||start) {\n"+
	"				pbuffer.append(parray[i+1]);\n"+
	"				start = true;\n"+
	"			}\n"+
	"			if(end){\n"+
	"				String key1 = pbuffer.toString();\n"+
	"				int lenght = key1.length();\n"+
	"				String key = key1.substring(0, lenght-1);\n"+
	"				String value =null;\n"+
	"				if(i<(parray.length-1))\n"+
	"					value = readFromTillYoufind(input, i+getValues(map)-pbuffer.toString().length()-getKeys(map), parray[i+1]);\n"+
	"				else \n"+
	"					value = readFromTillYoufind(input, i+getValues(map)-pbuffer.toString().length()-getKeys(map));\n"+
	"				map.put(key, value);\n"+
	"				pbuffer = new StringBuffer();\n"+
	"				end = false;\n"+
	"				start =false;\n"+
	"			}\n"+
	"\n"+
	"\n"+
	"		}\n"+
	"\n"+
	"		return map;\n"+
	"\n"+
	"	}\n"+
	"\n"+
	"	private  int getKeys(Map<String, String> map) {\n"+
	"		int k =0;\n"+
	"		for(String string : map.keySet()){\n"+
	"			k = k+ string.length() +2;\n"+
	"		}\n"+
	"		 \n"+
	"		return k;	}\n"+
	"\n"+
	"	private  int getValues(Map<String, String> map) {\n"+
	"		int k =0;\n"+
	"		for(String string : map.values()){\n"+
	"			k = k+ string.length();\n"+
	"		}\n"+
	"		 \n"+
	"		return k;\n"+
	"	}\n"+
	"	public   String readFromTillYoufind(String text, int index){\n"+
	"		int length = text.length();\n"+
	"		String str = text.substring(index, length);\n"+
	"		return str;\n"+
	"		}\n"+
	"\n"+
	"	public   String readFromTillYoufind(String text, int index, char c){\n"+
	"		int length = text.length();\n"+
	"		String str = text.substring(index, length);\n"+
	"		char[] array = str.toCharArray();\n"+
	"		StringBuffer buffer = new StringBuffer();\n"+
	"		for(int i=0; i< array.length;i++){\n"+
	"			if(array[i]!=c)\n"+
	"				buffer.append(array[i]);\n"+
	"			else  \n"+
	"				return buffer.toString();\n"+
	"		}\n"+
	"		throw new RuntimeException(\"Couldn't find the character \" + c + \"in \"+ text);\n"+
	"	}\n"+
	"\n"+
	"\n"+
	"} \n"+
	"\n"+
	"\n";
	
	}
