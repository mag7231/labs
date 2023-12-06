package ru.mirea.laba11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInputDateCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате ГГГГММДД (например, 20231231):");
        String dateInput = scanner.nextLine();

        System.out.println("Введите время в формате ЧЧмм (например, 1530):");
        String timeInput = scanner.nextLine();

        try {
            // Форматтер для преобразования введенных данных в объект Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

            // Преобразование строки введенной даты и времени в объект Date
            Date date = dateFormat.parse(dateInput + timeInput);

            // Вывод объекта Date
            System.out.println("Объект Date: " + date);

            // Создание объекта Calendar и установка даты и времени
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Вывод объекта Calendar
            System.out.println("Объект Calendar: " + calendar.getTime());

        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге введенных данных.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

