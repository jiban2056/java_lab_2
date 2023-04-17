package Com.kumalJiban;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;

public class HelloWorldIn3Buttons
{
    private JLabel label;
    private  JButton redButton, blueButton, blackButton;

    public HelloWorldIn3Buttons()
    {
        // set JFrame properties
        JFrame frame = new JFrame("# Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        label = new JLabel("HELLO WORLD!");
        label.setFont(new Font("Arial", BOLD,24));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);
        frame.add(label,constraints);


        redButton = new JButton("RED");
        redButton.setFont(new Font("Arial",BOLD,18));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.insets = new Insets(5, 5, 5, 5);
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });
        frame.add(redButton,constraints);

        blueButton = new JButton("BLUE");
        blueButton.setFont(new Font("Arial",BOLD,18));
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.insets = new Insets(5, 5, 5, 5);

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLUE);
            }
        });
        frame.add(blueButton,constraints);

        blackButton = new JButton("BLACK");
        blackButton.setFont(new Font("Arial",BOLD,18));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.insets = new Insets(5, 5, 5, 5);

        blackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLACK);
            }
        });
        frame.add(blackButton,constraints);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
      new HelloWorldIn3Buttons();
    }
}
