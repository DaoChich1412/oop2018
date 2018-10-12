package week4.task2;

public class TestTask2 {
	public static void main(String[] args){
		//test class shape
		System.out.println("Test class Shape");
		Shape shape1=new Shape();
		System.out.println("Shape1: "+shape1.getColor()+" "+shape1.isFilled());
		shape1.setColor("blue");
		shape1.setFilled(false);
		System.out.println("Shape1: "+shape1.toString());
		Shape shape2=new Shape("white",true);
		System.out.println("Shape2: "+shape2.toString());
		//test class circle
		System.out.println("Test class Circle");
		Circle circle1=new Circle();
		System.out.println("Circle1: "+circle1.toString()+" Area: "+circle1.getArea()+" Perimeter: "+circle1.getPerimeter());
		Circle circle2=new Circle(2.0);
		System.out.println("Radius circle2: "+circle2.getRadius());
		circle2.setRadius(3.0);
		System.out.println("Circle2: "+circle2.toString()+" Area: "+circle2.getArea()+" Perimeter: "+circle2.getPerimeter());
		Circle circle3=new Circle(2.5,"black",false);
		System.out.println("Circle3: "+circle3.toString()+" Area: "+circle3.getArea()+" Perimeter: "+circle3.getPerimeter());
		//test class rectangle
		System.out.println("Test class Rectangle");
		Rectangle rec1=new Rectangle();
		System.out.println("Rectangle1: "+"width "+rec1.getWidth()+" length "+rec1.getLength());
		rec1.setLength(3.0);
		rec1.setWidth(2.0);
		System.out.println("Rectangle1: width "+rec1.getWidth()+" length " +rec1.getLength()+" Area "+rec1.getArea()+ " Perimeter "+rec1.getPerineter());
		Rectangle rec2=new Rectangle(3.5,4.0);
		System.out.println("Rec2: "+rec2.toString());
		Rectangle rec3=new Rectangle(2.5,3.0,"gray",true);
		System.out.println("Rec3: "+rec3.toString());
		//test class square
		System.out.println("Test class square");
		Square square1=new Square();
		System.out.println("Square1: "+square1.toString());
		System.out.println("Square1: "+square1.getSide());
		Square square2=new Square(3.0);
		System.out.println("Square2: "+square2.getSide());
		square2.setLength(3.5);
		System.out.println("Square2: "+square2.getSide());
		square2.setWidth(4.0);
		System.out.println("Square2: "+square2.getSide());
		System.out.println("Square2: "+square2.getWidth()+" "+square2.getLength());
		square2.setSide(5.0);
		System.out.println("Square2: "+square2.getWidth()+" "+square2.getLength());
		square2.setLength(1.0);
		System.out.println("Square2: "+square2.getSide());
		Square square3=new Square(3.0,"yellow",false);
		System.out.println("Square3: "+square3.getWidth()+" "+square3.getLength());
		System.out.println("Square3: "+square3.toString());
	}
}
