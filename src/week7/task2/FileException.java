package week7.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
	public static void main(String[] args){
		try{
			Task2.IOException();
		}
		catch(FileNotFoundException e1){
			System.out.println("ERROR: File Not Found");
		}
		catch (IOException e2){
			System.out.println("ERROR: IOException");
		}
	}
}
