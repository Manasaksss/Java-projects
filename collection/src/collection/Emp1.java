package collection;

public  class Emp1 implements Comparable<Emp1> {
	private int emp1Id;
	private String name;
	private String email;
	public Emp1(int emp1Id, String name, String email) {
		super();
		this.emp1Id = emp1Id;
		this.name = name;
		this.email = email;
	}
	public int getEmp1Id() {
		return emp1Id;
	}
	public void setEmp1Id(int emp1Id) {
		this.emp1Id = emp1Id;
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
	@Override
	public String toString() {
		return "Emp1 [emp1Id=" + emp1Id + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Emp1 o) {
		
		return this.getName().compareTo(o.getName());
	}
}
