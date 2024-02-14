package exception;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number a");
		int a = scanner.nextInt();
		System.out.println("enter the number b");
		int b = scanner.nextInt();
		System.out.println("enter Operator");
		int Op = scanner.next().charAt(0);
	    int res = 0;
	switch(Op) {
	case '+':
	res=a+b;
	break;
	case '-':
		res=a-b;
		break;
	case '*':
		res=a*b;
		break;
	case '/':
		res=a/b;
		break;
	default:
		System.out.println( "Invalid");
		break;
	}
	System.out.println( "Result:"+res);
}
}