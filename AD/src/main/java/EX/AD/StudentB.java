package EX.AD;
public class StudentB implements Displayable {
	  private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Student B name: "+name);
	}
	  
	}