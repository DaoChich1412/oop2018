package week1;
import java.util.Scanner;
public class StudentManagement {
	Student[] students;
	int max;
	public static void main(String[] args) {
		Student sv1 = new Student();
		sv1.setName("Nguyen Anh Quan");
		sv1.setId("17020986");
		sv1.setGroup("INT22042");
		sv1.setEmail("nguyenanhquan715@gmail.com");
		Scanner input = new Scanner(System.in);
		System.out.println("Student 1's name: " + sv1.getName());
		System.out.println("Information of Student 1: ");
		sv1.getInfo();
		Student sv2 = new Student();
		System.out.println("Information of Student 2: ");
		sv2.getInfo();
		Student sv3 = new Student("Nguyen Cong Phuong", "17020785", "nguyencongphuong@gmail.com");
		System.out.println("Information of Student 3: ");
		sv3.getInfo();
		Student sv4 = new Student(sv3);
		System.out.println("Information of Student 4: ");
		sv4.getInfo();
		StudentManagement sv=new StudentManagement();
		if (sv.sameGroup(sv1,sv2)) System.out.println("Two Students 1, 2 have the same group " + sv1.getGroup());
		else System.out.println("Two Students have the different group");
		if (sv.sameGroup(sv2, sv3)) System.out.println("Two Students 2, 3 have the same group " + sv2.getGroup());
		else System.out.println("Two Students have the different group");
		System.out.println(" ");
		sv.max=5;
		sv.students=new Student[sv.max];
		int i=0;
		System.out.println("Moi ban nhap danh sach sinh vien: ");
		for(i=0;i<sv.max;i++){
			String n,I,g,e;
			sv.students[i]=new Student();
			System.out.println("***Sinh vien thu "+(i+1)+":");
			System.out.print("Ho va ten: ");
			n=input.nextLine();
			sv.students[i].setName(n);
			System.out.print("MSSV: ");
			I=input.nextLine();
			sv.students[i].setId(I);
			System.out.print("Group: ");
			g=input.nextLine();
			sv.students[i].setGroup(g);
			System.out.print("Email: ");
			e=input.nextLine();
			sv.students[i].setEmail(e);
		}
		sv.studentsByGroup();
		sv.removeStudent("17020986");
	}
	public boolean sameGroup(Student s1, Student s2) {
		String a,b;
		a=s1.getGroup();
		b=s2.getGroup();
		if(a==b) return true;
		else return false;
	}
	public void removeStudent(String id){
		int i=0;
		int j=0;
		for(i=0;i<max;i++){
			if(students[i].getId()==id){
				System.out.println("NAQ");
				for(j=i;j<max-1;j++){
					students[j]=students[j+1];
				}
				max=max-1;
			}
		}
	}
	public void studentsByGroup(){
		int i=0;
		int j=0;
		for(i=0;i<max;i++){
			for(j=i+1;j<max;j++){
				students[i].getInfo();
				if(sameGroup(students[i],students[j])){
					students[j].getInfo();
				}
			}
		}
	}
}
	