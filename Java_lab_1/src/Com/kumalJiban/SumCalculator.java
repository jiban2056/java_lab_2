package Com.kumalJiban;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumCalculator extends JFrame implements ActionListener {
    private JLabel label1, label2, resultLabel;
    private JTextField inputField1, inputField2;
    private JButton calculateButton;

    public SumCalculator() {
        setTitle("Sum Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel.add(new JLabel("Enter first number: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(inputField1 = new JTextField(10), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Enter second number: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(5, 5, 10, 5);
        panel.add(inputField2 = new JTextField(10), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 5, 5, 5);
        panel.add(calculateButton = new JButton("Calculate"), gbc);
        calculateButton.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 5, 5, 5);
        panel.add(resultLabel = new JLabel(), gbc);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == calculateButton) {
          double num1 = Double.parseDouble(inputField1.getText());
           double num2 = Double.parseDouble(inputField2.getText());
            double sum = num1 + num2;
            resultLabel.setText("Sum is " + sum);
        }
    }

    public static void main(String[] args) {
        new SumCalculator();
    }
}
