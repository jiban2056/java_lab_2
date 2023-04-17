package Com.kumalJiban;

import javax.swing.*;
import java.awt.*;

public class HelloWorldIn3Fonts  extends JFrame
{
    private  JLabel label1,label2, label3;

    public HelloWorldIn3Fonts()
    {
        label1 = new JLabel("Hello World!");
        label2 = new JLabel("Hello World!!");
        label3 = new JLabel("Hello World!!!");

        label1.setFont(new Font("Arial", Font.BOLD,18));
        label2.setFont(new Font("serif", Font.BOLD,24));
        label3.setFont(new Font("Verdana", Font.BOLD,31));


        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        panel.add(label1, BorderLayout.CENTER);
        panel.add(label2, BorderLayout.NORTH);
        panel.add(label3, BorderLayout.SOUTH);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args)
    {
     new HelloWorldIn3Fonts();
    }
}
