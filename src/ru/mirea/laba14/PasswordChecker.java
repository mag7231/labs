package ru.mirea.laba14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Пароль надежен.");
        } else {
            System.out.println("Пароль ненадежен.");
        }
    }

    private static boolean isStrongPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z0-9_]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}