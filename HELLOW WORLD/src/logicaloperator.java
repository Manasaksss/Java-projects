import java.util.Scanner;

public class logicaloperator {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the age");
	 int age = sc.nextInt();
	 if(age<17) {
		 System.out.println("welcome");
		}else {
			System.out.println("invalid");
		}
	 System.out.println("Enter the location");
	 Scanner sc1 = new Scanner(System.in);
	 String loc=sc1.nextLine();
	 if(loc.equalsIgnoreCase("hassan") ) {
		 System.out.println("most Welcome!");
		 
	 }else  {
		 System.out.println("only locals allowed");
	 }
	 
		
	}

}
