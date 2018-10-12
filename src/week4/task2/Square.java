package week4.task2;
//Lớp hình vuông
public class Square extends Rectangle {
	//Khởi tạo
	public Square(){
		super();
	}
	//Khởi tạo
	public Square(double side){
		super(side,side);
	}
	//Khởi tạo
	public Square(double side,String color,boolean filled){
		super(side,side,color,filled);
	}
	//Lấy giá trị cạnh hình vuông
	public double getSide(){
		return super.getWidth();
	}
	//Đặt giá trị cạnh hình vuông
	public void setSide(double side){
		super.setLength(side);
		super.setWidth(side);
	}
	//Định nghĩa lại phương thức
	public void setWidth(double side){
		setSide(side);
	}
	//Định nghĩa lại phương thức
	public void setLength(double side){
		setSide(side);
	}
	//Thông tin
	public String toString(){
		String s=super.toString();
		return s;
	}
}
