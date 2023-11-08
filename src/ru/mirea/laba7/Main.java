package ru.mirea.laba7;
// Интерфейс Movable определяет методы для перемещения объекта
interface Movable1 {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// Класс MovablePoint реализует интерфейс Movable и представляет движущуюся точку
class MovablePoint1 implements Movable1 {
    private int x, y;

    public MovablePoint1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Класс MovableRectangle реализует интерфейс Movable и представляет движущийся прямоугольник
class MovableRectangle1 implements Movable {
    private MovablePoint1 topLeft;
    private MovablePoint1 bottomRight;

    public MovableRectangle1(int x1, int y1, int x2, int y2) {
        topLeft = new MovablePoint1(x1, y1);
        bottomRight = new MovablePoint1(x2, y2);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

// Пример использования классов и интерфейса
public class Main {
    public static void main(String[] args) {
        MovableRectangle1 rectangle = new MovableRectangle1(0, 0, 2, 2);
        System.out.println("Original Rectangle: " + rectangle);

        // Перемещаем прямоугольник и выводим его новое положение
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println("Rectangle after moving up and right: " + rectangle);
    }
}
