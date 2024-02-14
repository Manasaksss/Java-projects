package sunday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * NESTED CLASS
 * NESTED LOOP
 * NESTED ARRAY
 * NESTED IF-ELSE
 * NESTED TRY-CATCH
 * NO NESTED METHODES IN JAVA
 */


public class ExceptionDemo7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader= 
				new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		int age = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Age:"+age);
	}
}


     

	
