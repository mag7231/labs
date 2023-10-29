package ru.mirea.laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        // Используя класс 'Random'
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int sizeArray = scanner.nextInt();
        double[] array = new double[sizeArray];

        for (int i = 0; i < sizeArray; i++){
            array[i] = random.nextDouble();
        }
        System.out.println("1)Массив с рандомными числами: ");

        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ array[i]);
        }

        Arrays.sort(array);
        System.out.println(" ");
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ array[i]);
        }

        System.out.println(" ");

        // Используя метод "Random" класса "Math"
        double[] arraySecond = new double[sizeArray];

        for (int i = 0; i < sizeArray; i++){
            arraySecond[i] = Math.random();
        }
        System.out.println("2) Массив с рандомными числами: ");
        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ arraySecond[i]);
        }

        System.out.println(" ");

        Arrays.sort(arraySecond);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < sizeArray; i++){
            System.out.println("array["+i+"]"+ " = "+ arraySecond[i]);
        }
    }
}
