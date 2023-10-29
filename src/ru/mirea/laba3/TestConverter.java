package ru.mirea.laba3;

public class TestConverter {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.94);
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("iPhone", 1000));
        cart.addProduct(new Product("Macbook", 2000));
        cart.addProduct(new Product("iPad", 500));
        cart.removeProductByName("Macbook");
        cart.displayContents();
        double totalPrice = cart.getTotalPrice("EUR", converter);
        System.out.println("Total price in EUR: " + totalPrice);
    }
}
