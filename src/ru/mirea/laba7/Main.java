package ru.mirea.laba7;

interface StringProcessor {
    String process(String input);
}

// Класс, реализующий интерфейс StringProcessor
class ProcessStrings implements StringProcessor {
    @Override
    public String process(String input) {
        // Пример обработки: преобразование строки в верхний регистр
        return input.toUpperCase();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса ProcessStrings
        StringProcessor stringProcessor = new ProcessStrings();

        // Тестируем обработку строк
        String input1 = "Hello, world!";
        String result1 = stringProcessor.process(input1);
        System.out.println("Input: " + input1);
        System.out.println("Result: " + result1);

        String input2 = "Java Programming";
        String result2 = stringProcessor.process(input2);
        System.out.println("Input: " + input2);
        System.out.println("Result: " + result2);
    }
}