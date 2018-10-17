package week5_6;

public class Position {
	protected int x,y;
	public Position(){
		x=1;
		y=1;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setPosition(int x,int y){
		this.x=x;
		this.y=y;
	}
}
