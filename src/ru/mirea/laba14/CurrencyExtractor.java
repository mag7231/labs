package ru.mirea.laba14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "Prices: 25.98 USD, 100.50 RUB, 30.75 EU. Invalid: 44 ERR, 0.004 EU.";

        extractCurrencies(text);
    }

    private static void extractCurrencies(String text) {
        Pattern usdPattern = Pattern.compile("\\b(\\d+\\.\\d{2})\\sUSD\\b");
        Pattern rubPattern = Pattern.compile("\\b(\\d+\\.\\d{2})\\sRUB\\b");
        Pattern euPattern = Pattern.compile("\\b(\\d+\\.\\d{2})\\sEU\\b");

        Matcher usdMatcher = usdPattern.matcher(text);
        Matcher rubMatcher = rubPattern.matcher(text);
        Matcher euMatcher = euPattern.matcher(text);

        System.out.println("USD prices:");
        while (usdMatcher.find()) {
            System.out.println(usdMatcher.group());
        }

        System.out.println("\nRUB prices:");
        while (rubMatcher.find()) {
            System.out.println(rubMatcher.group());
        }

        System.out.println("\nEU prices:");
        while (euMatcher.find()) {
            System.out.println(euMatcher.group());
        }
    }
}
