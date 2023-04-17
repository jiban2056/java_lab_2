package Com.kumalJiban;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonLayoutExample extends JFrame {

    public ButtonLayoutExample() {
        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        // Add buttons to a panel using FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(button1);
        flowPanel.add(button2);
        flowPanel.add(button3);

        // Add buttons to a panel using BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(button4, BorderLayout.WEST);
        borderPanel.add(button5, BorderLayout.CENTER);
        borderPanel.add(button6, BorderLayout.EAST);

        // Add buttons to a panel using GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 3));
        gridPanel.add(button1);
        gridPanel.add(button2);
        gridPanel.add(button3);
        gridPanel.add(button4);
        gridPanel.add(button5);
        gridPanel.add(button6);

        // Add panels to the frame
        this.setLayout(new GridLayout(3, 1));
        this.add(flowPanel);
        this.add(borderPanel);
        this.add(gridPanel);

        // Set frame properties
        this.setTitle("Button Layout Example");
        this.setSize(400, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonLayoutExample();
    }
}

