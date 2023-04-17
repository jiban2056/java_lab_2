package Com.kumalJiban;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame
{
    private JLabel imageLabel;

    public ImageDisplay()
    {
        super("Image Display");

        ImageIcon icon = new ImageIcon("D:\\Java_lab_1\\roshan.png");

        imageLabel = new JLabel(icon);

        Container contentPane = getContentPane();
        contentPane.add(imageLabel, BorderLayout.CENTER);

        setSize(350,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageDisplay();
    }

}
