import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scanner.nextInt();
		System.out.println("enter the second number");
		int b = scanner.nextInt();
		System.out.println("enter the third number");
		int c= scanner.nextInt();
		int sum = a+b+c;
		System.out.println(sum); 
		System.out.println(sum/3);
	}

}
