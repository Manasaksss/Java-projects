package wipro;

import java.util.Scanner;

public class employeeration {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
        int eAP = scanner.nextInt();
        char ERG;

        if (eAP >= 30 && eAP <= 50) {
            ERG = 'D';
        } else if (eAP >= 51 && eAP <= 60) {
            ERG = 'C';
        } else if (eAP >= 61 && eAP <= 80) {
            ERG = 'B';
        } else if (eAP >= 81 && eAP <= 100) {
            ERG = 'A';
        } else {
            // Handle cases where eAP is out of range
            ERG = 'X'; // You can choose any character to represent an invalid ERP
        }

        System.out.println(ERG);
    }

	}


