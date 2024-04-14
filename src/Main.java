public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie(); // Instance of the Object
        myMovie.name = "Duna 2";
        myMovie.releaseYear = 2024;
        myMovie.durationInMinutes = 166;

        System.out.println(myMovie.name);
        System.out.println(myMovie.durationInMinutes);
    }
}
