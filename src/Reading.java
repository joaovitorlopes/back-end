import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("What your favorite movie?");
        String movie = reading.nextLine();
        System.out.println(String.format("%s is a nice movie!", movie));
        System.out.println(String.format("What the release year for %s?", movie));
        int releaseDate = reading.nextInt();
        System.out.println(String.format("Wow, very cool, I didn't know %s was released in %d!", movie, releaseDate));
        System.out.println(String.format("What is your rating (0 to 10) for  %s?", movie));
        double rating = reading.nextDouble();
        System.out.println(String.format("Cool, your give %.2f rating for %s", rating, movie));
    }
}
