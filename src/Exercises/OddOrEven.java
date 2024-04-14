package Exercises;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = reading.nextInt();
        if (number %2 == 0) {
            System.out.printf("%d is a Even%n",number);
        } else {
            System.out.printf("%d is a Odd%n",number);
        }
    }
}
