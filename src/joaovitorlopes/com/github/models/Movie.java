package joaovitorlopes.com.github.models;

import joaovitorlopes.com.github.calculations.Sortable;

public class Movie extends Title implements Sortable {
    private String director;

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
}
