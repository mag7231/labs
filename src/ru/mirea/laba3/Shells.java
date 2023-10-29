package ru.mirea.laba3;

public class Shells {
    public static void main(String[] args) {
        // Создание объектов класса Double с использованием метода valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // Преобразование строки к типу double с использованием метода parseDouble()
        String strValue = "1.618";
        double parsedDouble = Double.parseDouble(strValue);

        // Преобразование объекта Double ко всем примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        // Вывод значения объекта Double на консоль
        System.out.println("Значение doubleObj1: " + doubleObj1);
        System.out.println("Значение doubleObj2: " + doubleObj2);

        // Преобразование литерала типа double к строке
        String d = Double.toString(3.14);

        System.out.println("Преобразованное из строки значение double: " + parsedDouble);
        System.out.println("Примитивный double: " + primitiveDouble);
        System.out.println("Примитивный float: " + primitiveFloat);
        System.out.println("Примитивный int: " + primitiveInt);
        System.out.println("Примитивный long: " + primitiveLong);
        System.out.println("Примитивный short: " + primitiveShort);
        System.out.println("Примитивный byte: " + primitiveByte);
        System.out.println("Строковое представление double: " + d);
    }
}