package ru.mirea.laba2;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        String[] arr = {"Hello", "world", "!"};
        int n = arr.length;
        int nn = words.length;

        for (int i = 0; i < n/2; i++) {
            String temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        for (int i = 0; i < nn/2; i++) {
            String temp = words[i];
            words[i] = words[n - i - 1];
            words[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < nn; i++) {
            System.out.print(words[i] + " ");
        }
    }
}

