package week10;

import week9.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task1 {
	public static void main(String[] args){
		Task1 task1=new Task1();
		ArrayList<String> a= (ArrayList<String>) task1.getAllFunctions(Utils.findFileByName("C:\\GitHub\\oop2018\\src\\week9","Utils.java"));
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
	}
	public List<String> getAllFunctions(File path){
		ArrayList<String> a=new ArrayList<>();
		try{
			FileReader read=new FileReader(path);
			BufferedReader reader=new BufferedReader(read);
			String line=new String("");
			String s="";
			while((line=reader.readLine())!=null){
				s+=line+"\n";
			}
			a.add(s);
		}catch(IOException e){
			e.printStackTrace();
		}
		return a;
	}
}
