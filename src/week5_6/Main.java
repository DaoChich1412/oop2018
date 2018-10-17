package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends Canvas{
	Diagram diagram=new Diagram();
	public static void main(String[] args){
		Main a=new Main();
		a.createList();
		JFrame f=new JFrame("NAQ");
		f.setSize(500,500);
		f.add(a);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
	}
	public void createList(){
		Rectangle rec1=new Rectangle(Color.blue,false,300,300,50,80);
		Rectangle rec2=new Rectangle(Color.cyan,true,10,10,100,120);
		Square sq1=new Square(Color.black,false,10,300,70);
		Square sq2=new Square(Color.YELLOW,true,120,10,90);
		Circle cir1=new Circle(50,250,250,Color.green,false);
		Circle cir2=new Circle(100,120,220,Color.green,true);
		Triangle tri1=new Triangle(Color.black,true,150,150,200,200,200,250);
		Triangle tri2=new Triangle(Color.black,false,150,150,300,200,200,250);
		Layer layer1=new Layer();
		Layer layer2=new Layer();
		layer1.shape=new ArrayList<Shape>();
		layer2.shape=new ArrayList<Shape>();
		layer1.shape.add(rec1);
		layer2.shape.add(rec2);
		layer1.shape.add(sq1);
		layer2.shape.add(sq2);
		layer1.shape.add(cir1);
		layer2.shape.add(cir2);
		layer1.shape.add(tri1);
		layer2.shape.add(tri2);
		layer1.deleteTriangle();
		layer2.deleteTriangle();
		diagram.layer=new ArrayList<Layer>();
		diagram.layer.add(layer1);
		diagram.layer.add(layer2);
		diagram.deleteCircle();
	}
	public void paint(Graphics g){
		int i=0;
		int j=0;
		for(i=0;i<diagram.layer.size();i++){
			Layer l=diagram.layer.get(i);
			for(j=0;j<l.shape.size();j++){
				Shape s=l.shape.get(j);
				if(s instanceof Rectangle){
					Rectangle rec=(Rectangle) s;
					rec.draw(g);
				}
				else{
					if(s instanceof Square){
						Square sq=(Square) s;
						sq.draw(g);
					}
					else{
						if(s instanceof Circle){
							Circle cir=(Circle) s;
							cir.draw(g);
						}
						else{
							if(s instanceof Triangle){
								Triangle tri=(Triangle) s;
								tri.draw(g);
							}
						}
					}
				}
			}
		}
	}
}
