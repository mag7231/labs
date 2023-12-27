package ru.mirea.laba21;
/*
import java.util.Scanner;

public class UniversalArray {
    private Object[] array;

    public UniversalArray(int size) {
        array = new Object[size];
    }

    public void set(int index, Object value) {
        array[index] = value;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void printArray() {
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public void printTypes() {
        for (Object obj : array) {
            System.out.println("Тип: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Считываем лишний символ новой строки

        UniversalArray ua = new UniversalArray(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            String input = scanner.nextLine();
            ua.set(i, input);
        }

        ua.printArray();
        ua.printTypes();

        System.out.print("Введите индекс элемента для получения значения: ");
        int indexToGet = scanner.nextInt();
        System.out.println("Значение элемента по индексу " + indexToGet + ": " + ua.get(indexToGet));

        scanner.close();
    }
}
*/
public class UniversalArray {
    private Object[] array; // Используем массив объектов для хранения любых типов

    public UniversalArray(int size) {
        array = new Object[size]; // Инициализация массива заданного размера
    }

    public void set(int index, Object value) {
        array[index] = value; // Задать значение для элемента массива
    }

    public Object get(int index) {
        return array[index]; // Получить значение элемента массива
    }

    public int size() {
        return array.length; // Вернуть размер массива
    }

    // Дополнительно: метод для вывода всего массива
    public void printArray() {
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public void printTypes() {
        for (Object obj : array) {
            System.out.println("Тип: " + obj.getClass().getSimpleName());
        }
    }
    // Тестирование класса
    public static void main(String[] args) {
        UniversalArray ua = new UniversalArray(5);
        ua.set(0, 1); // int
        ua.set(1, 1.5); // double
        ua.set(2, "Hello"); // String
        ua.set(3, new Object()); // Object
        ua.set(4, true); // boolean

        ua.printArray();
        ua.printTypes();
        //System.out.println(ua.get(0));
    }
}
