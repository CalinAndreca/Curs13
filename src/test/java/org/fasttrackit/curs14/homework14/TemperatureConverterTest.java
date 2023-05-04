package org.fasttrackit.curs14.homework14;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;



public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result, 0.01);
    }

    @Test
    public void testFahrenheitToCelsiusFreezingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0.01);
    }
    @Test
    public void testCelsiusToFahrenheitFreezingPoint(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(0.0);
        assertEquals(32.0,result,0.01);
    }
    @Test
    public void testFahrenheitToCelsiusBoilingPoint(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.fahrenheitToCelsius(212.0);
        assertEquals(100.0, result,0.01);
    }

    @Test
    public void testCelsiusToFahrenheitBoilingPoint(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(100.0);
        assertEquals(212.0,result,0.01);
    }

    @Test
    public void testFahrenheitToCelsiusNegative(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.fahrenheitToCelsius(-40.0);
        assertEquals(-40.0,result,0.01);
    }

    @Test
    public void testCelsiusToFahrenheitNegative(){
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(-40.0);
        assertEquals(-40.0,result,0.01);
    }
}
