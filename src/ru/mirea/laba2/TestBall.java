package ru.mirea.laba2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 1.0);
        ball.setX(7.0);
        System.out.println("Координаты мяча ball: " + ball.toString());
        ball.move(-2.0, 2.0);
        System.out.println(("Новые координаты мяча: " + ball));
        ball.setXY(5, 15);
        System.out.println("Новые координаты мяча: " + ball);
    }
}
