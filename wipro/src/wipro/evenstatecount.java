package wipro;

import java.util.Scanner;

public class evenstatecount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a set of numbers separated by spaces
        System.out.print("Enter a set of numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Split the input string into an array of numbers
        String[] numbersArray = input.split(" ");

        int sum = 0;

        // Iterate through the array and calculate the sum of numbers at even positions
        for (int i = 0; i < numbersArray.length; i++) {
            // Check if the current position is even (0-based index)
            if (i % 2 == 0) {
                try {
                    // Convert the string to an integer and add it to the sum
                    int num = Integer.parseInt(numbersArray[i]);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input at position " + i + ". Skipping...");
                }
            }
        }

        // Display the sum of numbers at even positions
        System.out.println("Sum of numbers at even positions: " + sum);

        // Close the scanner
        scanner.close();
    }
}