package wipro;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        long encodedLock = scanner.nextLong();
        scanner.close();
        
        int decodingNumber = decodeDigitalLock(encodedLock);
        System.out.println(decodingNumber);
    }

    public static int decodeDigitalLock(long encodedLock) {
        // Convert the encodedLock to a string to work with individual digits
        String encodedLockStr = Long.toString(encodedLock);
        int numDigits = encodedLockStr.length();
        int sum = 0;

        if (isArmstrongNumber(encodedLock)) {
            // Decode as an Armstrong number (sum of even digits)
            for (int i = 0; i < numDigits; i++) {
                int digit = Character.getNumericValue(encodedLockStr.charAt(i));
                if (i % 2 == 1) { // Odd position (0-based index)
                    sum += digit;
                }
            }
        } else {
            // Decode as a non-Armstrong number (sum of odd digits)
            for (int i = 0; i < numDigits; i++) {
                int digit = Character.getNumericValue(encodedLockStr.charAt(i));
                if (i % 2 == 0) { // Even position (0-based index)
                    sum += digit;
                }
            }
        }

        return sum;
    }

    public static boolean isArmstrongNumber(long number) {
        String numStr = Long.toString(number);
        int numDigits = numStr.length();
        long sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        return sum == number;
    }

	}

