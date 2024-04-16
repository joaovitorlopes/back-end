package Exercises;

public class Product {
    private String name;
    private double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void applyDiscount(double discount) {
        double finalPrice = getValue() - (getValue() * (discount/100));
        System.out.printf("Full Price: %.2f%n", getValue());
        System.out.printf("Discount: %.2f%%%n", discount);
        System.out.printf("Final Price: %.2f%n", finalPrice);
    }
}
