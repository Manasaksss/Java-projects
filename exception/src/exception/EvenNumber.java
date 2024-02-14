package exception;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//this line is must to define the user i/p line
		System.out.println("enter the number to test");
		int num = scanner.nextInt();//use to take i/p from user end
		if(num % 2==0) {
			System.out.println("even");	
		}
		else {
			System.out.println("odd");
		}
	}
}
		