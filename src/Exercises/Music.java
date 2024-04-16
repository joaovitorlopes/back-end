package Exercises;

public class Music {
    String title;
    String artist;
    int releaseYear;
    double rating;
    int ratingTotal;

    void displaysTechnicalSheet() {
        System.out.printf("Music title: %s%n", title);
        System.out.printf("Music artist: %s%n", artist);
        System.out.printf("Release year: %d%n", releaseYear);
        System.out.printf("Music rating: %.2f%n", rating);
        System.out.printf("Music total rating: %d%n", ratingTotal);
    }

    void evaluate(double grade) {
        rating += grade;
        ratingTotal++;
    }

    double getAverageRating() {
        return rating / ratingTotal;
    }
}
