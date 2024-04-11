package Exercises;

public class DiscountValue {
    public static void main(String[] args) {
        double originalPrice = 10;
        double discount = 10;
        double finalPrice = originalPrice - (originalPrice * discount/100);
        System.out.println(finalPrice);

    }
}
