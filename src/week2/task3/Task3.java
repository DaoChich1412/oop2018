package week2.task3;
import java.util.Scanner;
public class Task3 {
}
//Lop con meo
class Cat{
	private String name;//ten
	private String color;//mau long
	private String sex;//gioi tinh
	//dat ten
	public void setName(String name){
		this.name=name;
	}
	//lay ten
	public String getName(){
		return name;
	}
	//dat mau long 
	public void setColor(String color){
		this.color=color;
	}
	//lay mau long 
	public String getColor(){
		return color;
	}
	//dat gioi tinh
	public void setSex(String sex){
		this.sex=sex;
	}
	//lay gioi tinh
	public String getSex(){
		return sex;
	}
	//tieng meo keu
	public void Meo(){
		System.out.println("Con meo "+name+" keu meo...meo...meooooo!!!");
	}
	//khoi tao
	public Cat(){
		name="cho";
		color="den";
		sex="duc";
	}
	//thong tin con meo
	public void getInfo(){
		System.out.println("Con meo ten la: "+name);
		System.out.println("Mau long cua no la: "+color);
		System.out.println("No la meo: "+sex);
	}
}
//lop ve sach
class Book{
	private String name;//ten sach
	private String author;//tac gia
	private String kind;//the loai
	private long  money;//gia tien
	private int score;//diem danh gia sach tren thang diem 10
	//dat ten sach
	public void setName(String name){
		this.name=name;
	}
	//lay ten sach
	public String getName(){
		return name;
	}
	//dat ten tac gia
	public void setAuthor(String author){
		this.author=author;
	}
	//lay ten tac gia
	public String getAuthor(){
		return author;
	}
	//dat the loai sach
	public void setKind(String kind){
		this.kind=kind;
	}
	//lay ten the loai sach
	public String getKind(){
		return kind;
	}
	//dat gia tien cua sach
	public void setMoney(long  money){
		this.money=money;
	}
	//lay gia tien cua sach
	public long getMoney(){
		return money;
	}
	//dat diem cua sach
	public void setScore(int score){
		this.score=score;
	}
	//lay diem cua sach
	public int getScore(){
		return score;
	}
	//khoi tao
	public Book(){
		name="Conan Detective";
		author="Aoyamagosho";
		kind="Detective";
		money=18000;
	}
	//sach nay dat hay re
	public void Cost(){
		if(money>=500000) System.out.println("This book is expensive");
		else System.out.println("This book is cheap");
	}
	//danh gia sach
	public void Rate(){
		if(score>=9) System.out.println("Great");
		else{
			if(score>=8) System.out.println("Very good");
			else{
				if(score>=7) System.out.println("Good");
				else{
					if(score>=5) System.out.println("So so");
					else System.out.println("Bad");
				}
			}
		}
	}
}
	//lop may tinh xach tay
	class Laptop{
		private String make;//hang san xuat
		private String ram;//bo nho 
		private long  money;//gia ca
		private String os;//he dieu hanh duoc cai san
		//dat hang san xuat
		public void setMake(String n){
			make=n;
		}
		//lay ten hang
		public String getMake(){
			return make;
		}
		//dat dung luong bo nho
		public void setRam(String n){
			ram=n;
		}
		//lay so lieu bo nho
		public String getRam(){
			return ram;
		}
		//dat gia tien
		public void setMoney(long  n){
			money=n;
		}
		//lay gia tien
		public long getMoney(){
			return money;
		}
		//dat he dieu hanh co san
		public void setOs(String n){
			os=n;
		}
		//lay ten he dieu hanh
		public String getOs(){
			return os;
		}
		//Constructor
		public Laptop(){
			make="DELL";
			ram="4.00 GB";
			money=12000000;
			os="Windows 7";
		}
		//doi he dieu hanh
		public void ChangeOs(String o){
			os=o;
			System.out.println("You want to change OS: "+os);
		}
		//thong tin may
		public void Info(){
			System.out.println("May hang: "+make);
			System.out.println("RAM: "+ram);
			System.out.println("Gia ca: "+money);
			System.out.println("OS: "+os);
		}
	}
			
		
			
		
		
	
	
