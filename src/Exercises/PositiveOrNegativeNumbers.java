package Exercises;

import java.util.Scanner;

public class PositiveOrNegativeNumbers {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = reading.nextInt();
        if (number > 0) {
            System.out.printf("%d is a positive number", number);
        } else {
            System.out.printf("%d is a negative number", number);
        }
    }
}
