package Exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        //int randomNum = new Random().nextInt(100);
        int randomNum = 5;
        int attempts = 0;
        int number = 0;

        while (attempts < 5) {
            System.out.println("Guess a number between 0 to 100:");
            number = reading.nextInt();
            attempts++;

            if(number == randomNum) {
                System.out.printf("Congrats, you got the right number, in %d attempts %n",attempts);
                break;
            } else if(number < randomNum){
                System.out.println("The entry number is lower than the random number");
            } else {
                System.out.println("The entry number is higher than the random number");
            }

            if (attempts == 5 && number != randomNum) {
                System.out.printf("You didn't guess the right number in %d attempts. The number is: %d%n", attempts, randomNum);
            }
        }
    }
}
