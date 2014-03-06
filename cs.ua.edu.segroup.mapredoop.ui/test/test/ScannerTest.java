package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

public class ScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "elts: {0:-0.036677416087417695, 1:1.9868985862402793}";
		String parse = "elts: {0:%p1%, 1:%p2%}";
		char[] iarray = input.trim().toCharArray();
		char[] parray = parse.trim().toCharArray();
		Map<String, String> map = new HashMap<String, String>();
		StringBuffer pbuffer = new StringBuffer();
		boolean start=false, end=false ;
		for(int i=0; i<parray.length;i++){
			System.out.println("iter" + i+ parray[i]);
			if(iarray[i+getValues(map)-getKeys(map)]== parray[i])  continue;
			if(parray[i]=='%'&& start) {
				end =true;
				start=false;
				System.out.println("end" + i+ parray[i]);
			}
			else if(parray[i]=='%'||start) {
				pbuffer.append(parray[i+1]);
				start = true;
				System.out.println("start" + i+ parray[i]);
			}
			if(end){
				String key1 = pbuffer.toString();
				int lenght = key1.length();
				String key = key1.substring(0, lenght-1);
				String value = readFromTillYoufind(input, i+getValues(map)-pbuffer.toString().length()-getKeys(map), parray[i+1]);
				map.put(key, value);
				pbuffer = new StringBuffer();
				end = false;
				start =false;
			}


		}

		System.out.println(map);

	}

	private static int getKeys(Map<String, String> map) {
		int k =0;
		for(String string : map.keySet()){
			k = k+ string.length() +2;
		}
		 
		return k;	}

	private static int getValues(Map<String, String> map) {
		int k =0;
		for(String string : map.values()){
			k = k+ string.length();
		}
		 
		return k;
	}

	public static  String readFromTillYoufind(String text, int index, char c){
		int length = text.length();
		String str = text.substring(index, length);
		char[] array = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i< array.length;i++){
			if(array[i]!=c)
				buffer.append(array[i]);
			else  
				return buffer.toString();
		}
		throw new RuntimeException("Couldn't find the character " + c + "in "+ text);
	}


} 
