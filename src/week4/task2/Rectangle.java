package week4.task2;
//Lớp hình chữ nhật
public class Rectangle extends Shape{
	protected double width;//chiều rộng
	protected double length;//chiều dài
	//Khởi tạo
	public Rectangle(){
		super();
		width=1.0;
		length=1.0;
	}
	//Khởi tạo
	public Rectangle(double width, double length){
		super();
		this.width=width;
		this.length=length;
	}
	//Khởi tạo
	public Rectangle(double width,double length, String color, boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	//Lấy giá trị chiều rộng
	public double getWidth(){
		return width;
	}
	//Đặt giá trị chiều rộng
	public void setWidth(double width){
		this.width=width;
	}
	//Lấy giá trị chiều dài
	public double getLength(){
		return length;
	}
	//Đặt giá trị chiều dài
	public void setLength(double length){
		this.length=length;
	}
	//Lấy giá trị diện tích
	public double getArea(){
		return width*length;
	}
	//Lấy giá trị chu vi
	public double getPerineter(){
		double cv=(width+length)*2;
		return cv;
	}
	//Thông tin
	public String toString(){
		String s=super.toString()+" "+width+" "+length;
		return s;
	}
}
