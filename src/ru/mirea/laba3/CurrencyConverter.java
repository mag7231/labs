package ru.mirea.laba3;

public class CurrencyConverter {
    private double rate;

    public CurrencyConverter(double rate) {
        this.rate = rate;
    }

    public double convertToUSD(double amount) {
        return amount / rate;
    }

    public double convertFromUSD(double amount) {
        return amount * rate;
    }
}
