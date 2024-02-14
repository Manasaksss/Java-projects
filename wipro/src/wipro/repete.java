package wipro;

import java.util.Scanner;

public class repete {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("input");
		String string=scanner.next();
		System.out.println("match ");
		String c=scanner.next();
		int count=0;
		for(int i=0;i<string.length()-1;i++) {
			if(string.charAt(i)==c.charAt(0)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	}


