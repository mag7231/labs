package ru.mirea.laba11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Создаем объект Student с датой рождения
        Student student = new Student("Иванов", "Иван", "Информатика", 3, "Группа 1", new Date());

        // Форматируем дату рождения
        String formattedBirthDate = student.formatBirthDate("dd.MM.yyyy");
        System.out.println("Форматированная дата рождения: " + formattedBirthDate);

        // Выводим информацию о студенте с использованием toString()
        System.out.println(student);
    }
}