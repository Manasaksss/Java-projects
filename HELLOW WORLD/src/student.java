
public class student {
	int id;
	String name;
	void showDetails() {
		System.out.println("ID:"+id);
		System.out.println("name:"+name);
		
	}

	public static void main(String[] args) {
		student s1 = new student();
		s1.id=112;
		s1.name = "abc";
		student s2 = new student();
		s2.id=113;
		s2.name = "abd";
		student s3 = new student();
		s3.id=114;
		s3.name = "abe";
		student s4 = new student();
		s4.id=115;
		s4.name = "abf";
		s4.showDetails();
	}

}
