package sunday;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) throws IOException  {
	try(Scanner scanner = new Scanner(System.in)){//this program called as try with resources
	System.out.println("Enter your name");
	String name = scanner.nextLine();
	System.out.println("My name is"+name);
	scanner.close();
	
}
	try(FileOutputStream fos = new FileOutputStream("abc.txt")){
		fos.write("Learning java is Very Easy!".getBytes());
	}
}
}