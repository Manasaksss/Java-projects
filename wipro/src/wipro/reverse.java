package wipro;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a message: ");
	        String message = scanner.nextLine();

	        int specialCharacterCount = countSpecialCharacters(message);

	        System.out.println("Number of special characters: " + specialCharacterCount);

	        scanner.close();
	    }

	    public static int countSpecialCharacters(String message) {
	        int specialCharacterCount = 0;

	        for (int i = 0; i < message.length(); i++) {
	            char c = message.charAt(i);
	            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
	                specialCharacterCount++;
	            }
	        }

	        return specialCharacterCount;
	        }
	}


