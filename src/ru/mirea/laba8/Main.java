package ru.mirea.laba8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите k: ");
        int k = scanner.nextInt();

        System.out.print("Введите s: ");
        int s = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            int sum = 0;
            int number = i;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum == s) {
                numbers.add(i);
            }
        }

        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + numbers.size());
        System.out.println("Найденные числа:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
