package Exercises;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("---Enter 1 for Calculate Square Area or 2 for Calculate Circle Area---");
        int operation = reading.nextInt();
        switch (operation) {
            case 1:
                System.out.println("What is the side size of the square?");
                double side = reading.nextDouble();
                double squareArea = Math.pow(side, 2);
                System.out.printf("The Square Area with side %.2f is %.2f%n",side, squareArea);
                break;
            case 2:
                System.out.println("What is the radius of the circle?");
                double radius = reading.nextDouble();
                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.printf("The Circle Area with radius %.2f is %.2f%n", radius, circleArea);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
