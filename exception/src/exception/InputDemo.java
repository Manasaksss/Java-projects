package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = 
				new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter your Name:");
		String name = reader.readLine();
		System.out.println("Name:"+name);
	}

}
