package string;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		String string = "hello there, It's an awesome day!";
		Scanner scanner = new Scanner(string);
		while(scanner.hasNext())
			System.out.println(scanner.next());

	}

}
