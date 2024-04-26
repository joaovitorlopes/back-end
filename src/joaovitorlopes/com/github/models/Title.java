package joaovitorlopes.com.github.models;

import joaovitorlopes.com.github.exceptions.ErrorYearConversionException;

public class Title implements Comparable<Title>{
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private  boolean includedInPlan;
    private int totalRating;
    private double sumOfRatings;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        if (myTitleOmdb.year().length() > 4) {
            throw new ErrorYearConversionException("Failed to convert the Year");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,3));
    }

    public int getTotalRating() {
        return totalRating;
    }

    public double getAverageRating() {
        return sumOfRatings / totalRating;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    // method without return (void)
    public void getInfoAbout() {
        System.out.printf("Name: %s%n",getName());
        System.out.printf("Release year: %d%n",getReleaseYear());
        System.out.printf("Duration in minutes: %d min%n", getDurationInMinutes());
    }
    // method without return (void)
    public void evaluate(double grade) {
        sumOfRatings += grade;
        totalRating++;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", durationInMinutes=" + durationInMinutes;
    }
}
