import joaovitorlopes.com.github.calculations.RecommendationFilter;
import joaovitorlopes.com.github.calculations.TimeCalculator;
import joaovitorlopes.com.github.models.Episode;
import joaovitorlopes.com.github.models.Movie;
import joaovitorlopes.com.github.models.Serie;

import java.util.ArrayList;

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

        System.out.println("------------");

        Movie m1 = new Movie();
        m1.setName("Duna 1");
        m1.setReleaseYear(2021);
        m1.setDurationInMinutes(155);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(m1);
        calculator.include(mySerie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNum(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(300);

        recommendationFilter.filter(episode);

        Movie otherMovie = new Movie();
        otherMovie.setName("A Casa de Cera");
        otherMovie.setReleaseYear(2005);
        otherMovie.setDurationInMinutes(113);
        otherMovie.evaluate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(myMovie);
        movieList.add(otherMovie);

        System.out.printf("List length: %d%n", movieList.size());
        System.out.printf("First movie: %s%n", movieList.get(0).getName());
        System.out.println(movieList);
        System.out.printf("toString of Movie: %s%n", movieList.get(0).toString());
    }
}
