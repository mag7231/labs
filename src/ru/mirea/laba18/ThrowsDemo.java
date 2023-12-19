package ru.mirea.laba18;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Exception caught in getKey(): " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Exception caught in printDetails(): " + e.getMessage());
            throw e; // Пробрасываем исключение выше
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}

