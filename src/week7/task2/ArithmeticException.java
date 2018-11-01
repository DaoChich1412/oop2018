package week7.task2;

import java.util.Scanner;

public class ArithmeticException {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		try{
			Task2.Arithmetic(a,b);
		}
		catch(java.lang.ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("ERROR: Arithmetic Exception");
		}
	}
}
