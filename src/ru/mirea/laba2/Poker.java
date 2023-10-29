package ru.mirea.laba2;

import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        scanner.close();

        String[] suits = {"Пик", "Треф", "Бубен", "Червей"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        String[] deck = new String[52];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = ranks[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < deck.length; i++)
            System.out.print(deck[i] + ", ");

        System.out.println();

        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = random.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i+1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[5*i+j]);
            }
            System.out.println();
        }
    }
}