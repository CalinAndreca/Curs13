package org.fasttrackit.curs14.homework14;

public class TemperatureConverter {
    public double fahrenheitToCelsius(double temperature){
        return (temperature - 32)*5/9;
    }
    public double celsiusToFahrenheit(double temperature){
        return temperature * 9 / 5 + 32;
    }
}
