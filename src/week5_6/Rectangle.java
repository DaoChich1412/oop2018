package week5_6;


import java.awt.*;


public class Rectangle extends Shape {
	protected Position A=new Position();
	protected int width;
	protected int length;
	public Rectangle(){
		super();
		A.setPosition(10,10);
		width=50;
		length=70;
	}
	public Rectangle(Color color,boolean fill, int xA, int yA, int width, int length){
		super(color,fill);
		A.setPosition(xA,yA);
		this.width=width;
		this.length=length;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public void setLength(int length){
		this.length=length;
	}
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(A.getX(),A.getY(),width,length);
		if(fill==true){
			g.fillRect(A.getX(),A.getY(),width,length);
		}
	}
	public void move(Graphics g,int x,int y){
		A.setPosition(x,y);
		draw(g);
	}
}
