package ru.mirea.laba7;

import javax.swing.*;
import java.awt.*;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x, y;

    public MovablePoint(int x, int y) {
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MovablePoint(x1, y1);
        bottomRight = new MovablePoint(x2, y2);
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

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }
}

public class MovableRectangleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Movable Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        MovableRectangle rectangle = new MovableRectangle(50, 50, 150, 150);
        RectanglePanel rectanglePanel = new RectanglePanel(rectangle);
        frame.add(rectanglePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        upButton.addActionListener(e -> {
            rectangle.moveUp();
            rectanglePanel.repaint();
        });

        downButton.addActionListener(e -> {
            rectangle.moveDown();
            rectanglePanel.repaint();
        });

        leftButton.addActionListener(e -> {
            rectangle.moveLeft();
            rectanglePanel.repaint();
        });

        rightButton.addActionListener(e -> {
            rectangle.moveRight();
            rectanglePanel.repaint();
        });

        buttonPanel.add(upButton);
        buttonPanel.add(downButton);
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class RectanglePanel extends JPanel {
    private MovableRectangle rectangle;

    public RectanglePanel(MovableRectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x1 = rectangle.getTopLeft().getX();
        int y1 = rectangle.getTopLeft().getY();
        int x2 = rectangle.getBottomRight().getX();
        int y2 = rectangle.getBottomRight().getY();

        g.drawRect(x1, y1, x2 - x1, y2 - y1);
    }
}

