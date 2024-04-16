public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie(); // Instance of the Object
        myMovie.name = "Duna 2";
        myMovie.releaseYear = 2024;
        myMovie.durationInMinutes = 166;

        myMovie.displaysTechnicalSheet();

        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.printf("Rating average: %.2f%n", myMovie.getAverageRating());
        System.out.printf("Total rating: %d%n",myMovie.getTotalRating());
    }
}
