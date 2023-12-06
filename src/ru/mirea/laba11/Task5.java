package ru.mirea.laba11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        final int SIZE = 10000;

        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> b = new LinkedList<>();


        System.out.println("\nTest ADDING");

        long start1 = System.currentTimeMillis();
        for(int i = 0; i <= 1000000; i++) a.add((int) (Math.random() * 10));
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start1));

        long start2 = System.currentTimeMillis();
        for(int i = 0; i <= 1000000; i++) b.add((int) (Math.random() * 10));
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start2));


        System.out.println("\nTest GETTING");

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) System.out.print(a.get(i));
        long endTime = System.currentTimeMillis();
        System.out.println("\nArrayList: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) System.out.print(b.get(i));
        endTime = System.currentTimeMillis();
        System.out.println("\nLinkedList: " + (endTime - startTime));


        System.out.println("\nTest INSERTING");

        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) a.add(SIZE/2, ((int) (Math.random() * 10)));
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (endTime - startTime) * 10);

        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) b.add(SIZE/2, ((int) (Math.random() * 10)));
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: " + (endTime - startTime));


        System.out.println("\nTest REMOVING");

        long start3 = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++) a.remove(i);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start3));

        long start4 = System.currentTimeMillis();
        for(int i = 0; i <= 10000; i++) b.remove(i);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start4));
    }
}
