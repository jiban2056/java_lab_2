package Com.kumalJiban;
import javax.swing.*;
import java.awt.*;

public class ShapesExample extends JFrame
{
    public ShapesExample()
    {
        super("Shapes Example");

        // Create a JPanel with a BoxLayout that arranges components vertically
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create a custom component to draw the shapes
        JComponent shapesComponent = new JComponent()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw a circle
                g.setColor(Color.BLUE);
                g.fillOval(50, 50, 100, 100);

                // Draw a rectangle
                g.setColor(Color.RED);
                g.fillRect(50, 200, 100, 50);

                // Draw an ellipse
                g.setColor(Color.GREEN);
                g.fillOval(50, 300, 100, 50);
            }
        };

        // Add the custom component to the panel
        panel.add(shapesComponent);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Set the frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(300,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapesExample();
    }
}


