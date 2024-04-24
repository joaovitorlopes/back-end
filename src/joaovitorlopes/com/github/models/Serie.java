package joaovitorlopes.com.github.models;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeasons;
    private int minutesPerEpisode;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    // Overriding the original method
    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeasons * minutesPerEpisode;
    }

    @Override
    public void getInfoAbout() {
        System.out.printf("Name: %s%n",getName());
        System.out.printf("Release year: %d%n",getReleaseYear());
        System.out.printf("Seasons: %d%n", getSeasons());
        System.out.printf("Episode per season: %d%n", getEpisodesPerSeasons());
        System.out.printf("Minutes per episode: %d%n", getMinutesPerEpisode());
        System.out.printf("Duration in minutes: %d min%n", getDurationInMinutes());
    }
}
