package Exercises;

public class Car {
    String model;
    int year;
    String color;

    void displaysTechnicalSheet() {
        System.out.printf("Car model: %s%n", model);
        System.out.printf("Car year: %d%n", year);
        System.out.printf("Car color: %s%n", color);
    }

    int getCarAge(int currentYear) {
        return currentYear - year;
    }
}
