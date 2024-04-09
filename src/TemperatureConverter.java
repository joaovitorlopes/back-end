public class TemperatureConverter {
    public static void main (String[] args) {
        double celsiusTemp = 36;
        double fahrenheitTemp = (celsiusTemp * 1.8) + 32;
        String msg = String.format("%.2fºC is equals %.2fºF", celsiusTemp, fahrenheitTemp);
        System.out.println(msg);
        int fahrenheitCasting;
        fahrenheitCasting = (int) fahrenheitTemp;
        String castingMsg = String.format("This is a casting value: %dºF", fahrenheitCasting);
        System.out.println(castingMsg);
    }
}
