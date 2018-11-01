package week7.task2;

public class ClassCastException {
	public static void main(String[] args){
		try{
			Task2.ClassCast();
		}
		catch(java.lang.ClassCastException e){
			System.out.println(e.getMessage());
			System.out.println("ERROR: Class Cast Exception!!!");
		}
	}
}
