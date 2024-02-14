package wipro;
import java.util.Scanner;


public class Repeat {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("enter the data and the digit:");
        long data = scanner.nextLong();
        int digit = scanner.nextInt();

        int count = countDigit(data, digit);

        System.out.println("count of the specific digit: " + count);
    }

    public static int countDigit(long data, int digit) {
        int count = 0;
        while (data != 0) {
            if (data % 10 == digit) {
                count++;
            }
            data /= 10;
        }
        return count;
    }

    }

