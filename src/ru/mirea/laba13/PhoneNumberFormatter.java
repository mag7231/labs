package ru.mirea.laba13;

public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String input) {
        // Удаление лишних символов (например, пробелов)
        String cleanedInput = input.replaceAll("\\D", "");

        // Проверка, является ли номер российским
        boolean isRussianNumber = cleanedInput.startsWith("8") && cleanedInput.length() == 11;

        // Извлечение кода страны и номера
        String countryCode;
        String phoneNumber;
        if (isRussianNumber) {
            countryCode = "+7";
            phoneNumber = cleanedInput.substring(1);
        } else {
            countryCode = cleanedInput.substring(0, cleanedInput.length() - 10);
            phoneNumber = cleanedInput.substring(cleanedInput.length() - 10);
        }

        // Форматирование номера
        String formattedNumber = String.format(
                "%s%s-%s-%s",
                countryCode,
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6)
        );

        return formattedNumber;
    }

    public static void main(String[] args) {
        // Пример использования
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println(formatPhoneNumber(phoneNumber1));
        System.out.println(formatPhoneNumber(phoneNumber2));
        System.out.println(formatPhoneNumber(phoneNumber3));
    }
}

