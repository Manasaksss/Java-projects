package wipro;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter limits");
       int s=scanner.nextInt();
       int e=scanner.nextInt();
       int sum=0,j,i;
       for( i=s;i<=e;i++) {
    	   int flag=0;
    		   for(j=2;j<i;j++) {
    			   if(i%j==0) {
    				  flag=1;
    			   }
    		   }
    		   if(flag==0) {
    			   System.out.println("\n"+i);
    			   sum=sum+i;
    		   }
    	   }
       //sum of all prime integer in range
       System.out.println("Sum of all prime numbers in range "+sum);
       }
       
	   
	}

