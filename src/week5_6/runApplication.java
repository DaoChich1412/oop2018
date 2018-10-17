package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class runApplication extends Canvas{
	static JFrame f=new JFrame("NAQ");
	ArrayList<Shape> shape=new ArrayList<Shape>();
	boolean t=true;
	public static void main(String[] args){
		runApplication a=new runApplication();
		a.createShape();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(a);
		f.setSize(500,500);
		f.setResizable(false);
		f.setVisible(true);
		Scanner input=new Scanner(System.in);
		String s=new String("");
		s=input.nextLine();
		if(s.equals("Y")) System.exit(0);
	}
	public void createShape(){
		Rectangle rec1=new Rectangle(Color.blue,true,10,300,70,100);
		Square sq1=new Square(Color.cyan,true,10,10,60);
		Circle cir1=new Circle(50,250,250,Color.green,true);
		Triangle tri1=new Triangle(Color.black,true,150,150,200,200,200,250);
		//shape.add(rec1);
		shape.add(sq1);
		//shape.add(cir1);
		//shape.add(tri1);
	}
	public void paint(Graphics g){
		int i;
		for(i=0;i<shape.size();i++){
			Shape s=shape.get(i);
			if(s instanceof Rectangle){
				Rectangle r=(Rectangle) s;
				r.draw(g);
				int dx1 = 2;
				int dy1 = 3;
				int x1 = r.A.x;
				int y1 = r.A.y;
				while (t){
					if (x1 <= 0) dx1 = 3;
					if (x1 >= 430) dx1 = -3;
					if (y1 <=0) dy1 = 2;
					if (y1 >= 380) dy1 = -2;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					x1 += dx1;
					y1+= dy1;
					super.paint(g);
					r.move(g, x1, y1);
				}
			}
			else{
				if(s instanceof Circle) {
					Circle c = (Circle) s;
					c.draw(g);
					int dx = 2;
					int dy = 3;
					int x = c.O.getX() - c.getR();
					int y = c.O.getY() - c.getR();
					while (t){
						if (x <= 35) dx = 3;
						if (x >= 465) dx = -3;
						if (y <= 35) dy = 2;
						if (y >= 465) dy = -2;
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						x += dx;
						y += dy;
						super.paint(g);
						c.move(g, x, y);
					}
				}
				else{
					if(s instanceof Square){
						Square sq=(Square) s;
						sq.draw(g);
						int dx2 = 2;
						int dy2 = 3;
						int x2 = sq.A.getX();
						int y2 = sq.A.getY();
						while (t){
							if (x2 <= 0) dx2 = 3;
							if (x2 >= 420) dx2 = -3;
							if (y2 <= 0) dy2 = 2;
							if (y2 >= 420) dy2 = -2;
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							x2 += dx2;
							y2 += dy2;
							super.paint(g);
							sq.move(g, x2, y2);
						}
					}
					else{
						if(s instanceof Triangle){
							Triangle tr=(Triangle)s;
							tr.draw(g);
						}
					}
				}
			}
		}
	}
}
