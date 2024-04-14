package Learning;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("What your favorite movie?");
        String movie = reading.nextLine();
        System.out.printf("%s is a nice movie!%n", movie);
        System.out.printf("What the release year for %s?%n", movie);
        int releaseDate = reading.nextInt();
        System.out.printf("Wow, very cool, I didn't know %s was released in %d!%n", movie, releaseDate);
        System.out.printf("What is your rating (0 to 10) for  %s?%n", movie);
        double rating = reading.nextDouble();
        System.out.printf("Cool, your give %.2f rating for %s%n", rating, movie);
    }
}
