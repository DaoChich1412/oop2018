package week4.task2;
//Lớp hình tròn
public class Circle extends Shape{
	private double radius;//bán kính
	private final double pi=3.14;//số pi
	//Khởi tạo
	public Circle(){
		super();
		radius=1.0;
	}
	//Khởi tạo
	public Circle(double radius){
		super();
		this.radius=radius;
	}
	//Khởi tạo
	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	//Lấy giá trị bán kính
	public double getRadius(){
		return radius;
	}
	//Đặt giá trị bán kính
	public void setRadius(double radius){
		this.radius=radius;
	}
	//Lấy giá trị diện tích hình tròn
	public double getArea(){
		double s=pi*radius*radius;
		return s;
	}
	//Lấy giá trị chu vi hình tròn
	public double getPerimeter(){
		double cv=2*pi*radius;
		return cv;
	}
	//Thông tin
	public String toString(){
		return super.toString()+" "+radius;
	}
}
