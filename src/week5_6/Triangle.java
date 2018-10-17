package week5_6;

import java.awt.*;

public class Triangle extends Shape{
	protected Position A=new Position();
	protected Position B=new Position();
	protected Position C=new Position();
	public Triangle(){
		super();
		A.setPosition(1,1);
		B.setPosition(2,2);
		C.setPosition(1,2);
	}
	public Triangle(Color color,boolean fill, int xA, int yA, int xB, int yB, int xC, int yC){
		super(color,fill);
		A.setPosition(xA,yA);
		B.setPosition(xB,yB);
		C.setPosition(xC,yC);
	}
	public void draw(Graphics g){
		g.setColor(color);
		int[] x={A.getX(),B.getX(),C.getX()};
		int[] y={A.getY(),B.getY(),C.getY()};
		g.drawPolygon(x,y,3);
	}
	public void move(Graphics g,int x,int y){
		int a=A.getX()-x;
		int b=A.getY()-y;
		x=A.getX();
		y=A.getY();
		B.setPosition(B.x+a,B.y+b);
		C.setPosition(C.x+a,C.y+b);
		draw(g);
	}
}
