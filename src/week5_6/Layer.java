package week5_6;

import java.util.ArrayList;

public class Layer {
	protected ArrayList<Shape> shape;
	public void deleteTriangle(){
		for(int i=0;i<shape.size();i++){
			if(shape.get(i) instanceof Triangle){
				shape.remove(i);
			}
		}
	}
	public void deleteCircle(){
		for(int i=0;i<shape.size();i++){
			if(shape.get(i) instanceof Circle){
				shape.remove(i);
			}
		}
	}
}
