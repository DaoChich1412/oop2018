package week4.task1;

public class CamThanhPhong extends Cam {
	private int m;//Khối lượng 1 quả
	//Khởi tạo
	public CamThanhPhong(){
		super();
		m=5;
	}
	//Khởi tạo
	public CamThanhPhong(int m,int number,String kind, String name,String origin,String shape ){
		super(number,kind,name,origin,shape);
		this.m=m;
	}
	//Thông tin
	public String toString(){
		String s=super.toString()+" Khối lượng: "+m+"kg";
		return s;
	}
	//Lấy khối lượng
	public int getM(){
		return m;
	}
	//Đặt khối lượng
	public void setM(int m){
		this.m=m;
	}
}
