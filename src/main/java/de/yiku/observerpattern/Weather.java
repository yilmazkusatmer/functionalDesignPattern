package de.yiku.observerpattern;

public class Weather {
    private final double temperature;
    private final double humidity;
    private final double pressure;

    public Weather(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
