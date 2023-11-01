package ru.mirea.laba6;
// Интерфейс для объектов с ценой
interface Priceable {
    double getPrice();
}

// Пример класса, реализующего интерфейс Priceable
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name ;
    }
}

// Другой пример класса с ценой
class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return serviceName;
    }
}

public class PriceableExample {
    public static void main(String[] args) {
        // Создаем объекты с ценами
        Product product = new Product("Phone case", 7.2);
        Service service = new Service("Haircut", 5.4);

        // Вызываем метод getPrice() для каждого объекта
        double productPrice = product.getPrice();
        double servicePrice = service.getPrice();

        // Выводим цены на экран
        System.out.println("Product: " + product + " - Price: $" + productPrice);
        System.out.println("Service: " + service + " - Price: $" + servicePrice);
    }
}
