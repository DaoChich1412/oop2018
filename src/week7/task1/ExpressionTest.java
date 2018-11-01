package week7.task1;

public class ExpressionTest {
	public static void main(String[] args){
		Numeral n1=new Numeral(10);
		Square sqr1=new Square(n1);

		Numeral n2=new Numeral(1);
		Subtraction sub=new Subtraction(sqr1,n2);

		Numeral n3=new Numeral(2);
		Numeral n4=new Numeral(3);
		Multiplication mul=new Multiplication(n3,n4);

		Addition add=new Addition(sub,mul);
		Square sqr=new Square(add);

		System.out.print(sqr.toString());
		System.out.println(" ="+sqr.evaluate());

		Numeral m1=new Numeral(9);
		Numeral m2=new Numeral(0);
		Division div=new Division(m1,m2);
		System.out.print(div.toString()+" = ");
		try{
			int s=div.evaluate();
			System.out.println(s);
		}catch (ArithmeticException e){
			System.out.println("Math Error");
		}
	}
}
