package ru.mirea.laba1;

import java.util.Scanner;

public class Example {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = scanner.nextInt();
            }
           catch(Exception e) {
                System.out.println("Ошибка ввода данных. Попробуйте еще раз");
                    scanner.nextLine();
                i--;
            }
            }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);

    }
}
