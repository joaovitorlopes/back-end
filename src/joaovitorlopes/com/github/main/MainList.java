package joaovitorlopes.com.github.main;

import joaovitorlopes.com.github.models.Movie;
import joaovitorlopes.com.github.models.Serie;
import joaovitorlopes.com.github.models.Title;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        Movie m1 = new Movie("Duna 1", 2021);
        m1.evaluate(7);
        Movie myMovie = new Movie("Duna 2", 2024);
        myMovie.evaluate(8);
        Movie otherMovie = new Movie("A Casa de Cera", 2005);
        otherMovie.evaluate(9);
        Serie mySerie = new Serie("Fallout", 2024);

        List<Title> list = new LinkedList<>();
        list.add(m1);
        list.add(myMovie);
        list.add(otherMovie);
        list.add(mySerie);

        for (Title item: list) {
            System.out.printf("Name: %s%n", item.getName());
            if (item instanceof Movie movie && movie.getRating() > 2) {
                System.out.printf("Rating: %d%n",movie.getRating());
            }
        }

        Collections.sort(list);
        System.out.println("Movies and Series after sort:");
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Sorting by release year:");
        System.out.println(list);

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Ella Purnell");
        searchByArtist.add("Austin Butler");
        searchByArtist.add("Zendaya");

        System.out.println("Before sort: " +searchByArtist);
        Collections.sort(searchByArtist);
        System.out.println("After sort: " +searchByArtist);
    }
}
