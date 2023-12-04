package ru.mirea.laba9;

import java.util.Comparator;

class Studentt {
    private String name;
    private double gpa;

    public Studentt(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class SortingStudentsByGPA implements Comparator<Studentt> {

    @Override
    public int compare(Studentt student1, Studentt student2) {
        // Сравниваем студентов по итоговым баллам в порядке убывания
        // Если баллы равны, то считаем студентов равными
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    // Алгоритм быстрой сортировки
    public void quickSort(Studentt[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(Studentt[] students, int low, int high) {
        double pivot = students[high].getGpa();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students[j], new Studentt("", pivot)) > 0) {
                i++;
                // Поменять элементы местами
                Studentt temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // Поменять опорный элемент с элементом, стоящим после всех меньших элементов
        Studentt temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Studentt[] students = {
                new Studentt("John", 3.8),
                new Studentt("Alice", 3.5),
                new Studentt("Bob", 4.0),
                // Добавьте еще студентов по желанию
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        // Вывести отсортированный список студентов
        for (Studentt student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}

