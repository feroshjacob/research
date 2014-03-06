package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ResourceUtils {
	
	private static String templatePath ="template/";
	private static String grammarPath ="src/grmr/";
	
	public static String getGrammarPath() {
		return grammarPath;
	}	
	public static String getTemplatePath() {
		return templatePath;
	}
	
	
	public static String readAsString(String fileName) {
		StringBuffer fileData = new StringBuffer(1000);

		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(fileName));
			char[] buf = new char[1024];
			int numRead=0;
			while((numRead=reader.read(buf)) != -1){
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileData.toString();

	}
	public static String readContent(int offset, int length, String fileName) {

		try {
			byte[] buffer = new byte[offset];
			FileInputStream f = new FileInputStream(fileName);
			f.read(buffer);
			File file = new File(fileName);
			int finalloc =(int)file.length();
			byte[] buffer2 = new byte[finalloc];
			FileInputStream f2 = new FileInputStream(fileName);
			f2.read(buffer2);
			byte[] buffer3 = new byte[length];
			int j=0;
			for(int i=offset; i<offset+length;i++ ){
				buffer3[j]= buffer2[i];
				j++;
			}
			String text2= new String(buffer3);
			f.close();
			f2.close();
			return text2;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static String readContent(int offset,String fileName){
		File file = new File(fileName);
		 return readContent(offset, (int)file.length()-offset,fileName);
		
	}

	public static void writeContent(String newFilePath,
			String beforeinclude) {
		try {
			FileWriter fileWriter = new FileWriter(new File(newFilePath));
			   fileWriter.write(beforeinclude);
			   fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  static String replaceContentbyString(int offset,int length, String replacement, String oldContent) {
		StringBuffer beforeinclude = new StringBuffer(oldContent.substring(0, offset));
		 String afterinclude=oldContent.substring(offset+length,oldContent.length()-1);
		beforeinclude.append(replacement);
		beforeinclude.append(afterinclude);
        return beforeinclude.toString();
	}
	
}
