package week4.task2;
//Lớp hình
public class Shape {
	protected String color;//màu sắc
	protected boolean filled;//lấp đầy
	//Khởi tạo
	public Shape(){
		color="red";
		filled=true;
	}
	//Khởi tạo
	public Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	//Lấy màu
	public String getColor(){
		return color;
	}
	//Đặt màu
	public void setColor(String color){
		this.color=color;
	}
	//Xem hình có được lấp đầy không
	public boolean isFilled(){
		return filled;
	}
	//Đặt cho đây là hình đầy hay không
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	//Thông tin
	public String toString(){
		String s=color+" "+filled;
		return s;
	}
}
