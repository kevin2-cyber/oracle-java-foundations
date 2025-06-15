package com.kimikevin;

public class WeatherApp {
    public static void main(String[] args) {
        double temperatureCelsius = 25.5;
        int humidityPercentage = 60;
        double windSpeedKmph = 15.8;
        System.out.printf("Temperature: %.1f°C\n", temperatureCelsius);
        System.out.printf("Humidity: %d%%\n", humidityPercentage);
        System.out.printf("Wind Speed: %.1f km/h\n", windSpeedKmph);
    }
}
