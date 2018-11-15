package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
	public static void WriteAFile(String path,String k){
		try{
			FileWriter writer=new FileWriter(path);
			writer.write(k);
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public static String readContentFromFile(String path){
		String s=new String("");
		try{
			File inFile=new File(path);
			FileReader fileReader=new FileReader(inFile);
			BufferedReader reader=new BufferedReader(fileReader);
			String line=null;
			while((line=reader.readLine())!=null){
				s+=line+"\n";
			}
			reader.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return s;
	}
	public static void writeContentToFile(String path){
		try{
			FileWriter writer=new FileWriter(path);
			String s;
			Scanner input=new Scanner(System.in);
			s=input.nextLine();
			writer.write(s+"\n");
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void writeNextToFile(String path){
		try{
			FileWriter writer=new FileWriter(path,true);
			String s;
			Scanner input=new Scanner(System.in);
			s=input.nextLine();
			writer.write(s+"\n");
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static File findFileByName(String folderPath,String fileName){
		String s = folderPath + "//" + fileName;
		File f = new File(s);
		if(f.isFile()) {
			return f;
		}
		return null;
	}
	public static void main(String[] args){
		WriteAFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ1.txt","Nguyễn Anh Quân\nSinh ngày 21/11/1999\n");
		WriteAFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ2.txt","Nguyễn Anh Quân\nSinh ngày 21/11/1999\n");
		System.out.println(readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ1.txt"));
		System.out.println(readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ2.txt"));
		writeContentToFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ1.txt");
		writeNextToFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ2.txt");
		System.out.println(readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ1.txt"));
		System.out.println(readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\NAQ2.txt"));
		File f =findFileByName("C:\\GitHub\\oop2018\\src\\week9","NAQ1.txt");
		if(f==null) System.out.println("Không có File");
		else System.out.println(f.getAbsolutePath());
	}
}
