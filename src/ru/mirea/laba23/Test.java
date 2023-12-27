package ru.mirea.laba23;

public class Test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enter_element("Element 1");
        queue.enter_element(2.5);
        queue.enter_element(5);

        System.out.println("First element: " + queue.first_element());
        System.out.println("Queue size: " + queue.size());

        queue.delete_element();
        System.out.println("First element after one delete: " + queue.first_element());
        System.out.println("Queue size after one delete: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
        System.out.println("Is queue empty: " + queue.isEmpty());
    }
}
