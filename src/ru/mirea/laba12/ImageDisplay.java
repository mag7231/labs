package ru.mirea.laba12;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageDisplay extends JFrame {

    public ImageDisplay(String imagePath) {
        setTitle("Image Display");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            // Загружаем изображение по указанному пути
            ImageIcon imageIcon = new ImageIcon(new File(imagePath).getCanonicalPath());
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(800, 600, Image.SCALE_SMOOTH);

            // Создаем компонент для отображения изображения
            JLabel label = new JLabel(new ImageIcon(scaledImage));
            add(label);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, укажите путь к картинке в аргументах командной строки.");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            ImageDisplay imageDisplay = new ImageDisplay(args[0]);
            imageDisplay.setVisible(true);
        });
    }
}
