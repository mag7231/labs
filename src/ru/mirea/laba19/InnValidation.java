package ru.mirea.laba19;

import java.util.Scanner;

public class InnValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            validateInn(inn);
            System.out.println("ИНН действителен. Заказ успешно оформлен для " + fullName);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка при вводе ИНН: " + e.getMessage());
        }
    }

    private static void validateInn(String inn) throws InvalidInnException {
        // Проверяем формат ИНН
        if (!inn.matches("\\d{12}")) {
            throw new InvalidInnException("ИНН должен состоять из 12 цифр");
        }

        // Дополнительная логика проверки ИНН (например, контрольная сумма)
        // Может потребоваться обратиться к соответствующим стандартам или справочникам

        // Пример: Проверка контрольной суммы для 12-значного ИНН
        int[] coefficients = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
        int sum = 0;

        for (int i = 0; i < 11; i++) {
            sum += (inn.charAt(i) - '0') * coefficients[i];
        }

        int remainder = sum % 11;
        int controlNumber = remainder < 10 ? remainder : 0;

        if (controlNumber != Character.getNumericValue(inn.charAt(11))) {
            throw new InvalidInnException("Недействительный ИНН. Не соответствует контрольная сумма.");
        }
    }
}

class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}
