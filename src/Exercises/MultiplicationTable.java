package Exercises;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("---Choose a number to see its multiplication table---");
        System.out.println("Number:");
        int number = reading.nextInt();
        int multiplication = 0;
        for (int i = 0; i <= 10 ; i++) {
            multiplication = number * i;
            System.out.printf("%d X %d = %d%n",number, i, multiplication);
        }
    }
}
