package ru.mirea.laba13;

public class StringManipulation {

    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        printLastChar(inputString);
        checkEndsWith(inputString, "!!!");
        checkStartsWith(inputString, "I like");
        checkContains(inputString, "Java");
        findSubstringPosition(inputString, "Java");
        replaceChars(inputString, 'a', 'o');
        toUpperCase(inputString);
        toLowerCase(inputString);
        cutSubstring(inputString, "Java");
    }

    // Распечатать последний символ строки
    private static void printLastChar(String str) {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
    }

    // Проверить, заканчивается ли строка подстрокой
    private static void checkEndsWith(String str, String suffix) {
        boolean endsWith = str.endsWith(suffix);
        System.out.println("Строка заканчивается на \"" + suffix + "\": " + endsWith);
    }

    // Проверить, начинается ли строка подстрокой
    private static void checkStartsWith(String str, String prefix) {
        boolean startsWith = str.startsWith(prefix);
        System.out.println("Строка начинается с \"" + prefix + "\": " + startsWith);
    }

    // Проверить, содержит ли строка подстроку
    private static void checkContains(String str, String substring) {
        boolean contains = str.contains(substring);
        System.out.println("Строка содержит \"" + substring + "\": " + contains);
    }

    // Найти позицию подстроки в строке
    private static void findSubstringPosition(String str, String substring) {
        int position = str.indexOf(substring);
        System.out.println("Позиция подстроки \"" + substring + "\": " + position);
    }

    // Заменить все символы "а" на "о"
    private static void replaceChars(String str, char oldChar, char newChar) {
        String replacedString = str.replace(oldChar, newChar);
        System.out.println("Замена символов: " + replacedString);
    }

    // Преобразовать строку к верхнему регистру
    private static void toUpperCase(String str) {
        String upperCaseString = str.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + upperCaseString);
    }

    // Преобразовать строку к нижнему регистру
    private static void toLowerCase(String str) {
        String lowerCaseString = str.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowerCaseString);
    }

    // Вырезать подстроку
    private static void cutSubstring(String str, String substring) {
        String result = str.substring(0, str.indexOf(substring)) + str.substring(str.indexOf(substring) + substring.length());
        System.out.println("Вырезана подстрока: " + result);
    }
}
