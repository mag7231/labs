package ru.mirea.laba23;

public class ArrayQueue<T> {
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        array = new Object[capacity];
    }

    public void enter_element(T element) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public T first_element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) array[head];
    }

    public T delete_element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return (T) element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        array = new Object[array.length];
        size = head = tail = 0;
    }
}