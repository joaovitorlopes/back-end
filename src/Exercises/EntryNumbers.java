package Exercises;

import java.util.Scanner;

public class EntryNumbers {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("---Entry 02 numbers---");
        System.out.println("Number 01:");
        int number1 = reading.nextInt();
        System.out.println("Number 02:");
        int number2 = reading.nextInt();

        if (number1 == number2) {
            System.out.printf("%d and %d are equals!%n", number1, number2);
        } else {
            System.out.printf("%d and %d are different%n", number1, number2);
            if (number1 > number2) {
                System.out.printf("%d is greater than %d%n", number1, number2);
            } else {
                System.out.printf("%d is greater than %d%n", number2, number1);
            }
        }
    }
}
