package week4.task1;

public class HoaQua {
	protected String name;//Tên
	protected String origin;//Xuất xứ
	protected String shape;//Hình dạng
	//Khởi tạo
	public HoaQua(){
		name="Trái cây";
		origin="Nhiệt đới";
		shape="Hình cầu";
	}
	public HoaQua(String name,String origin,String shape){
		this.name=name;
		this.origin=origin;
		this.shape=shape;
	}
	//Thông tin loại quả
	public String toString(){
		String s="Tên: "+name+" Xuất xứ: "+origin+" Hình dạng: "+shape;
		return s;
	}
	//Đặt tên
	public void setName(String name) {
		this.name = name;
	}
	//Lấy tên
	public String getName(){
		return name;
	}
	//Đặt xuất xứ
	public void setOrigin(String origin){
		this.origin=origin;
	}
	//Lấy xuất xứ
	public String getOrigin(){
		return origin;
	}
	//Đặt hình dạng
	public void setShape(String shape){
		this.shape=shape;
	}
	//Lấy hình dạng
	public String getShape(){
		return shape;
	}
}
