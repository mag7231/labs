package ru.mirea.laba17;

class Node {
    CardNode data;
    Node next;

    public Node(CardNode data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Функция добавления элемента в конец списка
    public void addNode(CardNode data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Функция удаления элемента из списка
    public void removeNode(CardNode data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Функция вывода элементов списка на экран
    public void displayList() {
        Node current = head;
        while (current != null) {
            current.data.displayAttributes();
            current = current.next;
        }
        System.out.println();
    }

    // Функция очистки списка
    public void clearList() {
        head = null;
    }

    // Функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        CardNode card1 = new CardNode();
        CardNode card2 = new CardNode();
        CardNode card3 = new CardNode();

        card1.readAttributesFromConsole();
        card2.readAttributesFromConsole();
        card3.readAttributesFromConsole();

        linkedList.addNode(card1);
        linkedList.addNode(card2);
        linkedList.addNode(card3);

        System.out.println("Initial list:");
        linkedList.displayList();

        linkedList.removeNode(card2);

        System.out.println("List after removing Person 2:");
        linkedList.displayList();

        System.out.println("Is the list empty? " + linkedList.isEmpty());

        linkedList.clearList();
        System.out.println("Is the list empty after clearing? " + linkedList.isEmpty());
    }
}
