package ru.mirea.laba7;

public class StringManipulationImpl implements StringManipulation {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        StringManipulation manipulator = new StringManipulationImpl();
        String inputString = "Hello, World!";

        System.out.println("Number of characters: " + manipulator.countCharacters(inputString));
        System.out.println("Characters at odd positions: " + manipulator.oddPositionCharacters(inputString));
        System.out.println("Reversed string: " + manipulator.reverseString(inputString));
    }
}
