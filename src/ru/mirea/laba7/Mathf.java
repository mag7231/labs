package ru.mirea.laba7;

import java.util.Scanner;

interface MathCalculable {
    // Метод для возведения числа в степень
    double power(double base, double exponent);

    // Метод для вычисления модуля комплексного числа
    double abs(double real, double imaginary);

    double length(double r);
    // Константа для числа PI
    double PI = 3.14159265359;
}

// Класс MathFunc, реализующий интерфейс MathCalculable
class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double abs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double length(double r) {
        return (2*PI*r);
    }
}

public class Mathf {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(); // Создаем объект класса MathFunc, реализующего интерфейс
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х и степень в которую его хотите возвести");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("Введите мнимую и действительную часть комплексного числа");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите радиус окружности");
        double z = scanner.nextDouble();
        double result1 = mc1.power(x, y); // Вычисляем x^y
        double result2 = mc1.abs(a,b); // Вычисляем модуль комплексного числа (a + bi)
        double result3 = mc1.length(z);

        System.out.println(x+"^"+ y + " = " + result1);
        System.out.println("Abs("+a+"+"+b+"i) = " + result2);
        System.out.println("Length = " + result3);
    }
}