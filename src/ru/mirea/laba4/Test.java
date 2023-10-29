package ru.mirea.laba4;

public class Test {
    public static void main(String[] args) {
        // 1) Создаем переменную и распечатываем информацию о ней
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание времени года: " + myFavoriteSeason.getDescription());

        System.out.println("============================================");

        // 6) Распечатываем все времена года, средние температуры и описания
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание времени года: " + season.getDescription());
            System.out.println("--------------------------------------------");
        }

        // 2) Вызываем метод с оператором switch
        Season.printSeasonDescription(myFavoriteSeason);
    }

}