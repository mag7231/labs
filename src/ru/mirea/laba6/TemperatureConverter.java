package ru.mirea.laba6;

import java.util.Scanner;
import java.lang.Math;
// Интерфейс для конвертации температуры
interface Convertable {
    double convert(double temperature);
}

// Класс для конвертации температуры по Цельсию в Кельвины
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}

// Класс для конвертации температуры по Цельсию в Фаренгейты
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество градусов по Цельсию: ");
        double celsiusTemperature = input.nextDouble();

        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);

        System.out.println("Температура по Цельсию: " + celsiusTemperature + "°C");
        System.out.println("Температура по Кельвину: " + Math.round(kelvinTemperature * 100)/100.0 + " K");
        System.out.println("Температура по Фаренгейту: " + fahrenheitTemperature + "°F");
    }
}