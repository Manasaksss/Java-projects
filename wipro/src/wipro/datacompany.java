package wipro;

import java.util.Scanner;

public class datacompany {

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("enter the number elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=a[i];
			int Id=0,rem;
			while(x>0)
				
			{
		rem=x%10;
		Id=Id+rem;
		x=x/10;
			}
		System.out.println(Id);
	}
}
}


		