package ru.mirea.laba7;

class Book implements Printable {
    String name;
    String author;
    int year;

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }

    public static void main(String[] args) {
    Book book = new Book("Война и мир", "Л. Н. Толстой", 1863);
    book.print();
    }
}

