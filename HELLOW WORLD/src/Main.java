import java.util.Scanner;

 class Main {
	static int sum =0,rem;
	static int sumOfDigits(int num) {
		sum = sum+(num%10);
		rem = num/10;
		if(rem>0) {
			sumOfDigits(rem);
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number-");
		int originalNum = scanner.nextInt();
		result = Main.sumOfDigits(originalNum);
			System.out.println("Sum = "+result);
		}
	}

