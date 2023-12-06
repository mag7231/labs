package ru.mirea.laba14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        while (true) {
            if (flag) { String e = scan.nextLine(); }

            System.out.print("Input string: ");
            String string = scan.nextLine();
            System.out.print(
                    """
                            1 Delete digits
                            2 Delete letters
                            3 Delete spaces
                            0 Exit
                            Your choice:\s"""
            );

            int d = scan.nextInt();

            switch (d) {
                case 1: {
                    Pattern p = Pattern.compile("\\d+");
                    String word = String.join("", p.split(string));
                    System.out.println("Output string: " + word + "\n");
                } break;

                case 2: {
                    Pattern p = Pattern.compile("[a-zA-Z]+");
                    String word = String.join("", p.split(string));
                    System.out.println("Output string: " + word + "\n");
                } break;

                case 3: {
                    Pattern p = Pattern.compile("\\s+");
                    String word = String.join("", p.split(string));
                    System.out.println("Output string: " + word + "\n");
                } break;


                case 0: System.exit(0);

                default: throw new RuntimeException("Input incorrect number: " + d);

            }
            flag = true;
        }
    }
}