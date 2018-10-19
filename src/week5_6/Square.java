package week5_6;

import java.awt.*;


public class Square extends Shape {
	protected Position A=new Position();
	protected Position D=new Position();
	protected int side;
	public Square(){
		super();
		A.setPosition(10,10);
		side=1;
		D.setPosition(10+side,10+side);
	}
	public Square(Color color,boolean fill, int xA, int yA, int side){
		super(color,fill);
		A.setPosition(xA,yA);
		this.side=side;
		D.setPosition(xA+side,yA+side);
	}
	public void setSide(int side){
		this.side=side;
		D.setPosition(A.getX()+side,A.getY()+side);
	}
	public int getSide(){
		return side;
	}
	public void setPosition(int xA,int yA){
		A.setPosition(xA,yA);
		D.setPosition(xA+side,yA+side);
	}
	public String toString(){
		String s="Xa= "+A.getX()+" Ya= "+A.getY()+"\nXd= "+D.getX()+" Yd= "+D.getY()+"\n";
		return s;
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(A.getX(),A.getY(),getSide(),getSide());
		if(fill==true){
			g.fillRect(A.getX(),A.getY(),getSide(),getSide());
		}
	}
	public void move(Graphics g,int x,int y){
		A.setPosition(x,y);
		draw(g);
	}
}
