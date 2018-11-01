package week7.task2;

public class ArrayIndexOfBoundexception {
	public static void main(String[] args){
		try{
			Task2.ArrayIndex();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR: Array Index Of Bounds Exception");
		}
	}
}
