package Exercises;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = reading.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("%d! is: %d%n", number, factorial);
    }
}
