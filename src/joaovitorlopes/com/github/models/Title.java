package joaovitorlopes.com.github.models;

public class Title {
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private  boolean includedInPlan;
    private int totalRating;
    private double sumOfRatings;

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
}
