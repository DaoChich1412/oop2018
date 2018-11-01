package week7.task2;

import java.io.*;

public class Task2 {
	public static void NullPointer() throws java.lang.NullPointerException {
		System.out.println("Hello Java!!!");
		String s=null;
		System.out.println(s.toString());
		System.out.println("Hello World!!!");
	}
	public static void ArrayIndex() throws ArrayIndexOutOfBoundsException{
		String[] s=new String[]{"1","2","3"};
		int i;
		System.out.println(s[0]);
		for(i=0;i<3;i++){
			System.out.println(s[i+1]);
		}
		System.out.println("OK");
	}
	public static void Arithmetic(int a, int b)throws java.lang.ArithmeticException{
		int c=a/b;
		System.out.println("Kết quả: "+c);
	}
	public static void ClassCast() throws java.lang.ClassCastException{
		
	}
	public static void IOException() throws IOException {
		File file=new File("Exception.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		String line=null;
		while((line=reader.readLine())!=null){
			System.out.println(line);
		}
		reader.close();
	}
}
