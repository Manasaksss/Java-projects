package encapsulation;

public class Main {

	public static void main(String[] args) {
		employee e = new employee();
		e.setId(6);
		e.setName("abc");
		e.setSalary(10000);
		System.out.println("Id:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Salary:"+e.getSalary());
		
	}

}
