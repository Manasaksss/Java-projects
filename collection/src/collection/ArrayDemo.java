package collection;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i<5;i++) {
			System.out.println("enter the detalis of emp : "+(i+1)+":");
			System.out.println("empId");
			int empId = scanner.nextInt();
			System.out.println("name");
			String Name = scanner.next();
			System.out.println("email");
			String email = scanner.next();
			
		}
		
	}

}
class Emp{
	private int empId;
	public Emp(int empId, String name, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String name;
	private String email;
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", email=" + email + "]";
	}
}

