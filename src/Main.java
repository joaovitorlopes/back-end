import joaovitorlopes.com.github.models.Movie;
import joaovitorlopes.com.github.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie(); // Instance of the Object
        myMovie.setName("Duna 2");
        myMovie.setReleaseYear(2024);
        myMovie.setDurationInMinutes(166);

        myMovie.getInfoAbout();

        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);
        System.out.printf("Rating average: %.2f%n", myMovie.getAverageRating());
        System.out.printf("Total rating: %d%n",myMovie.getTotalRating());

        System.out.println("------------");

        Serie mySerie = new Serie();
        mySerie.setName("Fallout");
        mySerie.setReleaseYear(2024);
        mySerie.setSeasons(1);
        mySerie.setEpisodesPerSeasons(8);
        mySerie.setMinutesPerEpisode(59);
        mySerie.getInfoAbout();
    }
}
