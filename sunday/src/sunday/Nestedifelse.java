package sunday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nestedifelse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader= 
				new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		int age = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Age:"+age);
    if(age>18) {
    	System.out.println("Input your Address");
    	String address = bufferedReader.readLine();
    	if(address.equals("hassan")) 
    		System.out.println("welcome!");
    	else 
    			System.out.println("'Only Locals Allowed");
    			
    		}else 
    			System.out.println("Minors Not Allowed");
    	}
    		
    }

	


