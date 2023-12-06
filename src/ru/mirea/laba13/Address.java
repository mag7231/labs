package ru.mirea.laba13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Конструктор для разбора строки адреса с разделителем ","
    public Address(String addressString) {
        String[] parts = addressString.split(",");
        if (parts.length == 7) {
            setFields(parts);
        } else {
            System.out.println("Некорректный формат строки адреса.");
        }
    }

    // Конструктор для разбора строки адреса с разделителями ",.;" с использованием StringTokenizer
    public Address(String addressString, String delimiters) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, delimiters);
        String[] parts = new String[7];

        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            parts[i++] = tokenizer.nextToken().trim();
        }

        if (i == 7) {
            setFields(parts);
        } else {
            System.out.println("Некорректный формат строки адреса.");
        }
    }

    private void setFields(String[] parts) {
        country = parts[0];
        region = parts[1];
        city = parts[2];
        street = parts[3];
        house = parts[4];
        building = parts[5];
        apartment = parts[6];
    }

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Пример использования с разделителем ","
        Address address1 = new Address("Russia, Moscow, Moscow City, Tverskaya, 1, 2, 3");
        System.out.println("Address 1: " + address1);

        // Пример использования с разделителями ",.;"
        Address address2 = new Address("USA. California; Los Angeles; Hollywood Blvd, 123; 456; 789", ",.;");
        System.out.println("Address 2: " + address2);
    }
}
