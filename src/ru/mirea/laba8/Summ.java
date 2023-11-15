package ru.mirea.laba8;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = scanner.nextInt();
        int sum = 0;
        int a ;
        if (n>9) {
            while (n > 0) {
                a = n % 10;
                sum = sum + a;
                n = n / 10;
            }
            System.out.println("Сумма цифр числа " + sum);
        }
        else {
            System.out.println("Сумма цифр числа " + n);
        }
    }
}