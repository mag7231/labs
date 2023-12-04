package ru.mirea.laba11;

import java.util.Date;

public class TaskAssignment {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerSurname = "Фамилия";

        // Дата и время получения задания
        Date startDate = new Date(); // текущая дата и время

        // Дата и время сдачи задания
        Date endDate = new Date(); // текущая дата и время

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}
