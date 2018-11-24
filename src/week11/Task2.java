package week11;

import java.util.ArrayList;

public class Task2 {
	public static <T extends Comparable> T Max(ArrayList<T> a){
		T max=a.get(0);
		for(int i=1;i<a.size();i++){
			if(a.get(i).compareTo(max)>0){
				max=a.get(i);
			}
		}
		return max;
	}
	public static void main(String[]args){
		ArrayList<Integer> integers=new ArrayList<>();
		integers.add(12);
		integers.add(22);
		integers.add(11);
		integers.add(3);
		integers.add(20);
		System.out.println(Max(integers));
		ArrayList<Character> characters=new ArrayList<>();
		characters.add('s');
		characters.add('d');
		characters.add('f');
		characters.add('r');
		characters.add('t');
		System.out.println(Max(characters));
	}
}
