package Exercises;

public class DollarConversion {
    public static void main(String[] args) {
        double dolar = 50.0;
        double real = 4.95;
        double conversion = dolar * real;
        System.out.println(String.format("$%.2f is equals R$%.2f", dolar, conversion));
    }
}
