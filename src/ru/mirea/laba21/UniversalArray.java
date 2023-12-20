package ru.mirea.laba21;

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

    // Тестирование класса
    public static void main(String[] args) {
        UniversalArray ua = new UniversalArray(5);
        ua.set(0, 1); // int
        ua.set(1, 1.5); // double
        ua.set(2, "Hello"); // String
        ua.set(3, new Object()); // Object
        ua.set(4, true); // boolean

        ua.printArray();
        System.out.println(ua.get(2));
    }
}