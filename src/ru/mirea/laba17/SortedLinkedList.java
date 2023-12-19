package ru.mirea.laba17;
public class SortedLinkedList {
    class Node {
        String data;
        Node next;
        Node prev;

        public Node(String value) {
            this.data = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    public SortedLinkedList() {
        this.head = new Node("tomato");
        this.head.next = this.head;
        this.head.prev = this.head;
    }

    // Метод для вставки строки в список с сохранением упорядоченности
    public void insert(String value) {
        Node newNode = new Node(value);

        if (head == null) {
            // Список пуст, вставляем первый элемент
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node current = head;

        // Находим место для вставки
        while (current.next != head && (value.length() > current.data.length() ||
                (value.length() == current.data.length() && value.compareTo(current.data) > 0))) {
            current = current.next;
        }

        // Вставка нового узла перед текущим
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;

        // Если вставили перед головой, обновляем указатель на голову
        if (current == head) {
            head = newNode;
        }
    }

    // Метод для просмотра списка
    public void display() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        // Пример использования
        list.insert("apple");
        list.display();
        list.insert("orange");
        list.display();
        list.insert("banana");

        System.out.print("Список после вставки: ");
        list.display();

        list.insert("grape");
        list.insert("kiwi");

        System.out.print("Список после дополнительной вставки: ");
        list.display();
    }
}
