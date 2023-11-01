package ru.mirea.laba6;

// Интерфейс Printable
interface Printable {
    void print();
}

// Класс Book, реализующий интерфейс Printable
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing a book: " + title);
    }
}

// Класс Magazine, реализующий интерфейс Printable
class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing a magazine: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем массив типа Printable
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new Book("Война и мир");
        printableItems[1] = new Magazine("Forbes");
        printableItems[2] = new Magazine("KP");

        // Проходим по массиву и вызываем метод print() для каждого объекта
        for (Printable item : printableItems) {
            item.print();
        }
    }
}