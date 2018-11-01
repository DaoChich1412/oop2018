package week7.task2;

public class NullPointerException {
	public static void main(String[] args){
		try{
			Task2.NullPointer();
		}
		catch(java.lang.NullPointerException e){
			System.out.println("ERROR: Null Pointer Exception!!!");
		}
		System.out.println("Bye Bye!!!");
	}
}
