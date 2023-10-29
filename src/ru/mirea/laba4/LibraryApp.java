package ru.mirea.laba4;

public class LibraryApp {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В. В.", 12345, "Информатика", "01.01.2001", "+123456789");

        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader.takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader.returnBook(3);
    }
}