package ru.mirea.laba7;

public interface StringManipulation {
    // Функция подсчета символов в строке
    int countCharacters(String s);

    // Функция возвращает строку, состоящую из символов исходной строки s, на нечетных позициях
    String oddPositionCharacters(String s);

    // Функция инвертирования строки
    String reverseString(String s);
}