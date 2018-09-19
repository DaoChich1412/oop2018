package week1;
import java.util.Scanner;
public class Student {
	private String name, id, group, email;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setId(String n) {
		id = n;
	}

	public String getId() {
		return id;
	}

	public void setGroup(String n) {
		group = n;
	}

	public String getGroup() {
		return group;
	}

	public void setEmail(String n) {
		email = n;
	}

	public String getEmail() {
		return email;
	}
	public String getInfo(){
		System.out.println(name+"   "+id+"   "+group+"   "+email);
		return "NAQ";
	}
	public Student() {
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}

	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		email = em;
		group = "INT22041";
	}

	public Student(Student s) {
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
	}
}
	
	