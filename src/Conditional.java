public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2023;
        boolean isIncluded = true;
        double evaluation = 8.2;
        String planLevel = "Plus";

        if (releaseYear >= 2022) {
            System.out.println("Release movie!");
        } else {
            System.out.println("Retro movie!");
        }

        if (isIncluded && planLevel.equals("Plus")) {
            System.out.println("Ready for watching");
        } else {
            System.out.println("This movie is not included in your plan, please subscribe some plan");
        }
    }
}
