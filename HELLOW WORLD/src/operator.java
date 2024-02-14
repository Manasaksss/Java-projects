import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scanner.nextInt();
		System.out.println("enter the second number");
		int b = scanner.nextInt();
		char op = scanner.next().charAt(0);
		int res = 0;
		switch(op) {
		case'+':
		res=a+b;
		System.out.println("res:"+res);
		break;
		case'-':
		res=a-b;
		System.out.println("res:"+res);
		break;
		case'*':
		res=a*b;
		System.out.println("res:"+res);
		break;
		case'/':
		res=a/b;
		System.out.println("res:"+res);
		break;	
		default:
			System.out.println("Invalid operator");
	}

}
}
