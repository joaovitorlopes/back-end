import java.util.Scanner;

public class RatingLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double avarageRating = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("What is your rating for the movie (0 to 10)?");
            rating = reading.nextDouble();
            avarageRating += rating;
        }

        System.out.printf("Avarage rating: %.2f%n",avarageRating/3);

    }
}
