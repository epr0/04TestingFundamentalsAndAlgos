package converter;

public class FarenheitCelciusConverter {

    public static int toCelcius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int toFahrenheit(int celcius) {
        return celcius * 9 / 5 + 32;
    }
}
