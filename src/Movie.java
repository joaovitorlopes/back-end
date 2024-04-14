public class Movie {
    String name;
    String synopsis;
    int durationInMinutes;
    int releaseYear;
    int totalRating;
    boolean isIncluded;
    double sumOfRatings;

    // method without return (void)
    void displaysTechnicalSheet() {
        System.out.printf("Name of movie: %s%n",name);
        System.out.printf("Release year: %d%n",releaseYear);
        System.out.printf("Duration in minutes: %d min%n", durationInMinutes);
    }
    // method without return (void)
    void evaluate(double grade) {
        sumOfRatings += grade;
        totalRating++;
    }
    // method with return (double)
    double getAverageRating() {
        return sumOfRatings / totalRating;
    }
}
