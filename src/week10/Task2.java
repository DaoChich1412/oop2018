package week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Mời bạn nhập số phần tử cần sắp xếp: ");
		int n=input.nextInt();
		int temp;
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++){
			Random random=new Random();
			temp=random.nextInt(100);
			a.add(temp);
		}
		//bubbleSort(a);
		ArrayList<Integer> b;
		b=quickSort(a);
		Iterator k=a.iterator();
		while(k.hasNext()){
			System.out.print(k.next()+" ");
		}
		System.out.println(" ");
		for(int i=0;i<b.size();i++){
			System.out.print(b.get(i)+" ");
		}
	}
	//Sắp xếp nổi bọt là sau mỗi bước lặp ta được một dãy mới với phần tử cuối cùng là lớn nhất.
	public static void bubbleSort(ArrayList<Integer> a){
		int n=a.size();
		int i;
		while(n>1) {
			for (i = 0; i < n - 1; i++) {
				if (a.get(i) > a.get(i + 1)) {
					int temp1 = a.get(i);
					int temp2 = a.get(i + 1);
					//temp1>temp2
					a.remove(i);//Xóa phần tử thứ i trong danh sách ban đầu
					a.remove(i);//Xóa phần tử thứ i+1 trong danh sách ban đầu
					a.add(i, temp1);//Phần tử thứ i có giá trị là temp1
					a.add(i, temp2);//Phần tử thứ i có giá trị là temp2 và đẩy phần tử có giá trị temp1 xuống vị trí i+1
				}
			}
			n=n-1;
		}
	}
	//Quick sort
	public static ArrayList<Integer> quickSort(ArrayList<Integer> a){
		Random random=new Random();
		int n=a.size();
		int k=random.nextInt(n);
		ArrayList<Integer> s1=new ArrayList<>();
		ArrayList<Integer> s2=new ArrayList<>();
		ArrayList<Integer> s3=new ArrayList<>();
		for(int i=0;i<n;i++){
			if(a.get(i)<a.get(k)) s1.add(a.get(i));
			if(a.get(i)==a.get(k)) s2.add(a.get(i));
			if(a.get(i)>a.get(k)) s3.add(a.get(i));
		}
		if(s1.size()>1) s1=quickSort(s1);
		if(s3.size()>1) s3=quickSort(s3);
		ArrayList<Integer> b=new ArrayList<>();
		for(int i=0;i<s1.size();i++) b.add(s1.get(i));
		for(int i=0;i<s2.size();i++) b.add(s2.get(i));
		for(int i=0;i<s3.size();i++) b.add(s3.get(i));
		return b;
	}
}
