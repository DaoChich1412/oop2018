package week5_6;

import java.awt.*;

public class Circle extends Shape {
	private int r;
	protected Position O=new Position();
	public Circle(){
		super();
		r=1;
		O.setPosition(1,1);
	}
	public Circle(int r, int x, int y, Color color,boolean fill){
		super(color,fill);
		this.r=r;
		O.setPosition(x,y);
	}
	public void setR(int r){
		this.r=r;
	}
	public int getR() {
		return r;
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.drawOval(O.getX()-r,O.getY()-r,getR(),getR());
		if(fill==true){
			g.fillOval(O.getX()-r,O.getY()-r,getR(),getR());
		}
	}
	public void move(Graphics g,int x,int y){
		O.setPosition(x,y);
		draw(g);
	}
}
