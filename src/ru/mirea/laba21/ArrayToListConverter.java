package ru.mirea.laba21;

import java.util.Arrays;
import java.util.List;
public class ArrayToListConverter {
    public static void main(String[] args) {
        // Пример с массивом строк
        String[] stringArray = {"Hello", "World", "Java"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Пример с массивом чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }

    // Обобщённый метод для конвертации массива в список
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
