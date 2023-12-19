package ru.mirea.laba17;

import java.util.Scanner;

class CardNode {
    private String name;
    private int age;

    public CardNode() {
        this.name = "";
        this.age = 0;
    }

    public void readAttributesFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        this.name = scanner.nextLine();

        System.out.println("Введите возраст:");
        this.age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
    }
}