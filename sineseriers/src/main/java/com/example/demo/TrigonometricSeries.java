package com.example.demo;
import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for the series: ");
        int n = scanner.nextInt();
        
        System.out.println("Sine Series:");
        printSinSeries(n);
        
        System.out.println("\nCosine Series:");
        printCosSeries(n);
        
        scanner.close();
    }
    
    public static void printSinSeries(int n) {
        for (int i = 0; i < n; i++) {
            double angle = i * Math.PI / 180.0; // Convert degrees to radians
            double sinValue = Math.sin(angle);
            System.out.println("sin(" + i + " degrees) = " + sinValue);
        }
    }
    
    public static void printCosSeries(int n) {
        for (int i = 0; i < n; i++) {
            double angle = i * Math.PI / 180.0; // Convert degrees to radians
            double cosValue = Math.cos(angle);
            System.out.println("cos(" + i + " degrees) = " + cosValue);
        }
    }
}