package Exercises;

import java.util.Scanner;

public class MultiplicationTable implements MultiplicationTableInterface {

    @Override
    public void showMultiplicationTable(int value) {
        int multiplication = 0;
        for (int i = 0; i <= 10; i++) {
            multiplication = value * i;
            System.out.printf("%d X %d = %d%n", value, i, multiplication);
        }
    }
}
