import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scanner.nextInt();
		int reversednumber=0;
		while(num!=0) {
	    reversednumber = reversednumber*10+num%10;
		num/=10;
		}
		System.out.println("reversednumber:"+reversednumber);
		}

}