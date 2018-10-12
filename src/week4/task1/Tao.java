package week4.task1;
//Lớp quả táo
public class Tao extends HoaQua {
	private boolean eat;//Ăn được hay không
	//Khởi tạo
	public Tao(){
		super();
		eat=true;
	}
	//Khởi tạo
	public Tao(boolean eat,String name,String origin,String shape){
		super(name,origin,shape);
		this.eat=eat;
	}
	//Thông tin
	public String toString(){
		String s=super.toString()+" Ăn được: "+eat;
		return s;
	}
	//Đặt cho nó ăn được hay không
	public void setEat(boolean eat){
		this.eat=eat;
	}
	//Xem nó ăn được hay không
	public boolean getEat(){
		return eat;
	}
}
