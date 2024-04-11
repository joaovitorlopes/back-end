package Exercises;

public class GradeAvarage {
    public static void main(String[] args) {
        double grade1 = 8.0;
        double grade2 = 6.0;
        double avarage = (grade1 + grade2) / 2;
        System.out.println(String.format("The avarage of %.2f and %.2f is %.2f",grade1, grade2, avarage));
    }
}
