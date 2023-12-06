package ru.mirea.laba14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Scanner sc = new Scanner(System.in);
        Matcher m = p.matcher(sc.nextLine());
        boolean b = m.matches();
        System.out.println(b);
    }
}
