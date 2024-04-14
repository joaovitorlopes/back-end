package Learning;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Screen Match");
        String filmName = "John Wick 4";

        int releaseYear = 2023;
        System.out.println("Release year: " + releaseYear);
        boolean isIncluded = true;
        double evaluation = 8.2;
        double media = (9.8 + 6.3 + 8.0) / 3 ;
        System.out.println(Math.round(media));

        String synopsis;
        synopsis = """
            %s
            Former hitman John Wick is wanted around the world and the reward for his capture is increasing.
            Good! (%.2f)
            Release year: %d
            """.formatted(filmName, evaluation, releaseYear);
        System.out.println(synopsis);

        int classification;
        classification = (int) (media / 2); // Casting explicit integer
        System.out.println(classification);
    }
}