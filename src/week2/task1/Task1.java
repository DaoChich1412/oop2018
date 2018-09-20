package week2.task1;
import java.util.Scanner;
public class Task1 {
	public static int gcd(int a, int b) {
        if(b==0) return a;
		else  return gcd(b,a%b);
    }
	public static int fibonacci(int n) {
		if(n==0) return 0;
		else{
			if(n==1) return 1;
			else return fibonacci(n-2)+fibonacci(n-1);
		}
    }
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 integers: ");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println(gcd(a,b));
		System.out.println("Enter n: ");
		int n=input.nextInt();
		System.out.println(fibonacci(n));
	}
}
