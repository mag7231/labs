package ru.mirea.laba11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//Сравнение введенной и текущей даты

public class DateComparison {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Date currentDate = new Date();

        // Получаем дату и время от пользователя
        Date userDate = getUserDate();

        // Вычисляем разницу во времени
        long timeDifference = userDate.getTime() - currentDate.getTime();

        // Вывод разницы во времени
        System.out.println("Разница во времени: " + formatTimeDifference(timeDifference));
    }

    // Метод для получения даты и времени от пользователя
    private static Date getUserDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss: ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        try {
            return dateFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты и времени. Попробуйте снова.");
            return getUserDate(); // Рекурсивный вызов метода в случае ошибки
        }
    }

    // Метод для форматирования разницы во времени в виде часов, минут и секунд
    private static String formatTimeDifference(long timeDifference) {
        long seconds = Math.abs(timeDifference) / 1000;
        long days = seconds / (24 * 3600);
        long hours = (seconds % (24 * 3600)) / 3600;
        long minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        return String.format("%d дней, %d часов, %d минут, %d секунд", days, hours, minutes, seconds);
    }
}
