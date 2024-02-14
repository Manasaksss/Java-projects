package exception;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	///use to take i/p from user end
		int sum=0;
		int n=0;
		float average=0;
		System.out.println("enter  array numers ");
	   
		int a[] = new int[n];
		System.out.println("enter  array numers ");
		for(int i=0;i<n;i++) {
			sum =sum+a[i];
			}
		System.out.println(sum);
		average = (float)sum/n;
		System.out.println("average: "+average);	
		}
}

