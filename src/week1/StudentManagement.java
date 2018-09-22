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
		else System.out.println("Two Students 1, 2 have the different group");
		if (sv.sameGroup(sv2, sv3)) System.out.println("Two Students 2, 3 have the same group " + sv2.getGroup());
		else System.out.println("Two Students 2, 3 have the different group");
		System.out.println(" ");
		sv.max=10;
		sv.students=new Student[sv.max];
		int i=0;
		System.out.println("A list of Students: ");
		for(i=0;i<sv.max;i++){
			String n,I,g,e;
			sv.students[i]=new Student();
			System.out.println("***Student "+(i+1)+":");
			System.out.print("Name: ");
			n=input.nextLine();
			sv.students[i].setName(n);
			System.out.print("ID: ");
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
		System.out.println("Delete Student whose ID is: ");
		String s=input.nextLine();
		System.out.println("A list of Students after: ");
		sv.removeStudent(s);
	}
	public boolean sameGroup(Student s1, Student s2) {
		String a,b;
		a=s1.getGroup();
		b=s2.getGroup();
		if(a.equals(b)) return true;
		else return false;
	}
	public void removeStudent(String id){
		int i=0;
		int j=0;
		for(i=0;i<max;i++){
			if(students[i].getId().equals(id)){
				for(j=i;j<max-1;j++){
					students[j]=students[j+1];
				}
				max=max-1;
				break;
			}
		}
		for(i=0;i<max;i++) students[i].getInfo();
	}
	public void studentsByGroup(){
		int i=0;
		int j=0;
		int k=1;
		int s=0;
		int t=1;
		Student temp;
		for(i=0;i<max-1;){
			for(j=i+1;j<max;j++){
				if(sameGroup(students[i],students[j])){
					temp=students[i+t];
					students[i+t]=students[j];
					students[j]=temp;
					t=t+1;
					k=k+1;
					s=s+1;
				}
			}
			if(s==0){
				k=k+1;
				i=k-1;
			}
			else i=k-1;
			t=1;
			s=0;
			i++;
		}
		for(i=0;i<max;i++){
			students[i].getInfo();
		}
	}
}
	
	