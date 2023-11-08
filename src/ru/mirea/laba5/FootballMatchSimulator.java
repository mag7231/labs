package ru.mirea.laba5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public FootballMatchSimulator() {
        setTitle("Football Match Simulator");
        setLayout(new FlowLayout());
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        setLayout(new BorderLayout()); // Используем BorderLayout для размещения компонентов

        JPanel buttonPanel = new JPanel(); // Создаем панель для кнопок
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Используем FlowLayout с выравниванием по центру
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);
        add(buttonPanel, BorderLayout.NORTH); // Размещаем панель с кнопками в верхней части окна

        milanButton.setPreferredSize(new Dimension(150, 50)); // Устанавливаем размер кнопки Милана
        madridButton.setPreferredSize(new Dimension(150, 50)); // Устанавливаем размер кнопки Мадрида

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }

        });

        JButton redistributeButton = new JButton("Redistribute Goals");
        buttonPanel.add(redistributeButton);
        redistributeButton.setPreferredSize(new Dimension(200, 50));
        redistributeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Перераспределение забитых мячей
                int totalGoals = milanScore + madridScore;
                if (totalGoals > 0) {
                    int newMilanScore = (int) (Math.random() * totalGoals);
                    int newMadridScore = totalGoals - newMilanScore;
                    milanScore = newMilanScore;
                    madridScore = newMadridScore;
                    updateLabels("Redistributed");
                }
            }
        });



        JPanel labelPanel = new JPanel(); // Создаем панель для надписей
        labelPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Используем FlowLayout с выравниванием по центру
        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);
        add(labelPanel);

    }

    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FootballMatchSimulator().setVisible(true);
            }
        });
    }
}
