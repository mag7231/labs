package ru.mirea.laba4;
// 1) Создаем перечисление с временами года и средними температурами
public enum Season {
    SPRING(15),
    SUMMER(25),
    AUTUMN(10),
    WINTER(-15);

    private int averageTemperature;

    // 4) Добавляем конструктор
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // 5) Переопределяем метод getDescription
    public String getDescription() {
        // Для Лета возвращаем "Теплое время года", для остальных "Холодное время года"
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }

    // 3) Добавляем метод для получения средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // 2) Создаем метод, использующий оператор switch
    public static void printSeasonDescription(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}