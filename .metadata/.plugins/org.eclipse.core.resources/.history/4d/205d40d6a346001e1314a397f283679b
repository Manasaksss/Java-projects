package ss;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 5 || n > 20) {
            System.out.println("INVALID INPUT");
            return;
        }

        int a = 1, b = 1, c;
        int evenCount = 0, oddCount = 0;

        System.out.print("Output:\n");

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(a);
            } else {
                System.out.print(a + " ");
            }

            if (a % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            c = a + b;
            a = b;
            b = c;
        }

        System.out.print("\n" + evenCount + " ");
        System.out.print(oddCount - 1); // Exclude the 0 from odd count
    }
}
