package joaovitorlopes.com.github.models;

import joaovitorlopes.com.github.calculations.Sortable;

public class Movie extends Title implements Sortable {
    private String director;

    public Movie(String name) {
        this.setName(name);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return  (int) getAverageRating()  / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
