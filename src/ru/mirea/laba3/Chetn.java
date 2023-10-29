package ru.mirea.laba3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chetn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите размер массива: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array1 = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(n + 1);
        }
        System.out.println("Первый массив: " + Arrays.toString(array1));

        int[] array2 = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                array2[count] = array1[i];
                count++;
            }
        }
        array2 = Arrays.copyOf(array2, count);
        System.out.println("Второй массив: " + Arrays.toString(array2));
    }
}
