package ru.mirea.laba10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeAndSortStudents {

    public static void main(String[] args) {
        // Создаем два списка данных о студентах
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Иванов", "Иван", "Информатика", 3, "Группа 1"));
        list1.add(new Student("Петрова", "Мария", "Математика", 2, "Группа 2"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Смирнов", "Александр", "Физика", 4, "Группа 3"));
        list2.add(new Student("Козлова", "Екатерина", "Химия", 1, "Группа 4"));

        // Объединяем два списка
        List<Student> mergedList = mergeAndSort(list1, list2);

        // Выводим объединенный и отсортированный список студентов
        for (Student student : mergedList) {
            System.out.println(student.getLastName() + " " + student.getFirstName() +
                    " - " + student.getSpecialty() + ", Course: " + student.getCourse() +
                    ", Group: " + student.getGroup());
        }
    }

    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        // Создаем новый список и добавляем в него все элементы из обоих списков
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Сортируем объединенный список с использованием компаратора
        Collections.sort(mergedList, Comparator.comparing(Student::getLastName)
                .thenComparing(Student::getFirstName));

        return mergedList;
    }
}
