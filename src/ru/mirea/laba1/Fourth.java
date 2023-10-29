package ru.mirea.laba1;

import java.util.Scanner;

public class Fourth {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

        int sum = 0;
        int i = 0;
        do{
            sum += array[i];
            i++;
        }while(i < size);

        int max = array[0];
        int min = array[0];
        i = 1;
        while (i < size){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            i++;
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("MIN элемент массива: " + min);
        System.out.println("MAX элемент массива: " + max);

    }
}