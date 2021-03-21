package de.yiku.observerpattern;

public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Weather weather = new Weather(10.1, 0.5, 0.2);
        data.addObserver(w ->
                System.out.printf("Current temperature is %.2f Celius and humidity %.2f!%n", w.getTemperature(), w.getHumidity())
        );

        data.addObserver(w ->
                System.out.printf("Current pressure is %.2f!%n", w.getPressure())
        );

        data.addObserver(w ->
                System.out.printf("temperature: %.2f humidity: %.2f pressure: %.2f!%n", w.getTemperature(), w.getHumidity(), w.getPressure())
        );

        data.setMeasurements(weather);
    }
}
