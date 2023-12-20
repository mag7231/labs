package ru.mirea.laba22;

import java.util.Stack;
import java.util.Scanner;

public class RPNCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();
        System.out.println("Результат: " + evaluateRPN(ex));
        /*String[] expression = {"3", "4", "+", "2", "*", "7", "/"};
        System.out.println("Результат: " + evaluateRPN(expression));
        String[] expression2 = {"2", "3", "4", "5", "6", "*", "+", "-", "/"};
        System.out.println("Результат: " + evaluateRPN(expression2));*/
    }

    public static double evaluateRPN(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }
}