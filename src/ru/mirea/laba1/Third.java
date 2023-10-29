package ru.mirea.laba1;

import java.util.Scanner;

public class Third {
    public static class Factorial{
        public static int schetFactorial(int n){
            int factorial = 1;
            for (int i = 1; i<=n; i++){
                factorial*=i;
            }
            return factorial;
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            int result = schetFactorial(number);
            System.out.println(result);
        }
    }
}
