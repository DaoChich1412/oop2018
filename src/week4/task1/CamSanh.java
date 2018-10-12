package week4.task1;

public class CamSanh extends Cam {
	private int cost;//Giá tiền 1 cân
	//Khởi tạo
	public CamSanh(){
		super();
		cost=10000;
	}
	//Khởi tạo
	public CamSanh(int cost,int number,String kind,String name,String origin,String shape){
		super(number,kind,name,origin,shape);
		this.cost=cost;
	}
	//Thông tin
	public String toString(){
		String s=super.toString()+" Giá tiền: "+cost;
		return s;
	}
	//Đặt giá
	public void setCost(int cost){
		this.cost=cost;
	}
	//Lấy giá
	public int getCost(){
		return cost;
	}
}
