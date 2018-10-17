package week5_6;

import java.awt.*;

public abstract class Shape {
	protected Color color;//Màu
	protected boolean fill;
	abstract public void draw(Graphics g);
	abstract public void move(Graphics g,int x,int y);
	public Shape(){
		color=Color.BLACK;
		fill=true;
	}
	public Shape(Color color, boolean fill){
		this.color=color;
		this.fill=fill;
	}
	public void setColor(Color color){
		this.color=color;
	}
	public Color getColor(){
		return color;
	}
	public void setFill(boolean fill){
		this.fill=fill;
	}
	public boolean getFill(){
		return fill;
	}
}
