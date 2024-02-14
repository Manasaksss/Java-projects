package wipro;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of coustomers:");
		int N=sc.nextInt();
		int numOfCust[]=new int[N];
		System.out.println("Enter bills of"+N+" customers:");
		for(int i=0;i<N;i++) {
			numOfCust[i]=sc.nextInt();
			
		}
		for(int i=0;i<N;i++) {
			 if(Math.sqrt(numOfCust[i])-Math.floor(Math.sqrt(numOfCust[i]))==0) {
	    		 count++;
	    	 }
		}
		System.out.println("Number of customers receiving discount:"+count);

	}

}
