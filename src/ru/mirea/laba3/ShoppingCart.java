package ru.mirea.laba3;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeProductByName(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                products.remove(product);
                break;
            }
        }
    }

    public void displayContents() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public double getTotalPrice(String currency, CurrencyConverter converter) {
        double total = 0;
        //System.out.println(products);
        for (Product product : products) {
            total += product.getPrice();
        }
        if (currency.equals("USD")) {
            return total;
        } else {
            return converter.convertFromUSD(total);
        }
    }
}
