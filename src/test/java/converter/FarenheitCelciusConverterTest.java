package converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FarenheitCelciusConverterTest {

    @org.junit.Test
    public void shouldConvertCelciusToFahrenheit() {

        assertEquals(32, FarenheitCelciusConverter.toFahrenheit(0));
        assertEquals(98, FarenheitCelciusConverter.toFahrenheit(37));
        assertEquals(212, FarenheitCelciusConverter.toFahrenheit(100));
    }

    @Test
    public void shouldConvertFahrenheitToCelcius() {
        assertEquals(0, FarenheitCelciusConverter.toCelcius(32));
        assertEquals(37, FarenheitCelciusConverter.toCelcius(100));
        assertEquals(100, FarenheitCelciusConverter.toCelcius(212));
    }
}