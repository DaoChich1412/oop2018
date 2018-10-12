package week4.task1;

public class Cam extends HoaQua {
	protected int number;//số múi
	protected String kind;//loại cam;
	//khởi tạo
	public Cam(){
		super();
		number=10;
		kind="Sành";
	}
	//Khởi tạo
	public Cam(int number,String kind,String name,String origin,String shape){
		super(name,origin,shape);
		this.number=number;
		this.kind=kind;
	}
	//Thông tin
	public String toString(){
		String s=super.toString()+" Số múi: "+number+" Loại: "+kind;
		return s;
	}
	//Đặt giá trị số múi
	public void setNumber(int number){
		this.number=number;
	}
	//Lấy giá trị số múi
	public int getNumber(){
		return number;
	}
	//Đặt loại cam
	public void setKind(String kind){
		this.kind=kind;
	}
	//Lấy tên loại cam
	public String getKind(){
		return kind;
	}
}
