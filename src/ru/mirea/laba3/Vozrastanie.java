package ru.mirea.laba3;


import java.util.Arrays;
import java.util.Random;

public class Vozrastanie {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(90) + 10;
        }
        System.out.println("Массив: " + Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 1; i < 4; i++) {
            if (array[i] <= array[i-1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
