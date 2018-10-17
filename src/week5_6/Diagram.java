package week5_6;

import java.util.ArrayList;

public class Diagram {
	protected ArrayList<Layer> layer;
	public void deleteCircle(){
		for(int i=0;i<layer.size();i++){
			Layer l=layer.get(i);
			l.deleteCircle();
		}
	}
}
