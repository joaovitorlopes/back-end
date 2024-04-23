package joaovitorlopes.com.github.models;

import joaovitorlopes.com.github.calculations.Sortable;

public class Episode implements Sortable {
    private int num;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getRating() {
        if ( totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
