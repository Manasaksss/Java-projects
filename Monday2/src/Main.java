import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two strings from the user
	        System.out.print("Enter the first string: ");
	        String s1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String s2 = scanner.nextLine();

	        // Check if the strings are anagrams using the AnagramChecker class
	        if (AnagramChecker.areAnagrams(s1, s2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }

	        scanner.close();
	    }
	}

