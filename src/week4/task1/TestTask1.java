package week4.task1;

public class TestTask1 {
	public static void main(String[] args){
		//Test lớp hoa quả
		HoaQua hq1=new HoaQua();
		System.out.println(hq1.toString());
		HoaQua hq2=new HoaQua("Ổi","Việt Nam","Hình cầu");
		System.out.println(hq2.toString());
		//Test lớp táo
		Tao t1=new Tao();
		System.out.println(t1.toString());
		Tao t2=new Tao(true,"Táo","Việt Nam","Hình cầu");
		System.out.println(t2.toString());
		//Test lớp cam
		Cam c1=new Cam();
		System.out.println(c1.toString());
		Cam c2=new Cam(12,"mọng nước","Cam","Việt Nam","Hình cầu");
		System.out.println(c2.toString());
		//Test lớp cam sanh;
		CamSanh cs1=new CamSanh();
		System.out.println(cs1.toString());
		CamSanh cs2=new CamSanh(12000,12,"Sanh","Cam","Việt Nam","Hình cầu");
		System.out.println(cs2.toString());
		//Test lớp cam Thanh Phong;
		CamThanhPhong ctp1=new CamThanhPhong();
		System.out.println(ctp1.toString());
		CamThanhPhong ctp2=new CamThanhPhong(5,12,"Thanh phong","Cam","Việt Nam","Hình cầu");
		System.out.println(ctp2.toString());
	}
}
