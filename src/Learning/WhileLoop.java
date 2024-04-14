package Learning;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double avarageRating = 0;
        double rating = 0;
        int totalRating = 0;

        while (rating != -1) {
            System.out.println("What is your rating for the movie (0 to 10)? or -1 to exit");
            rating = reading.nextDouble();

            if (rating != -1) {
                avarageRating += rating;
                totalRating++;
            }

        }

        System.out.printf("Avarage rating: %.2f%n",avarageRating/totalRating);

    }
}
