package Exercises;

public class MoneyConversion implements FinancialConversion{

    @Override
    public void convertDollarToReal(double value) {
        double dollarExchangeRate = 5.20;
        double real = value * dollarExchangeRate;
        System.out.printf("$%.2f is equals R$%.2f%n", value, real);
    }
}
