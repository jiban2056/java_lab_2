package Com.kumalJiban;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonCounterExample extends JFrame implements ActionListener {

    private final JLabel counterLabel;
    private int counter;

    public ButtonCounterExample() {
        // Create a button named "Click me"
        JButton button = new JButton("Click me");
        button.addActionListener(this);

        // Create a label to display the counter value
        counterLabel = new JLabel("Counter: " + counter);

        // Add the button and counter label to a panel
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(counterLabel);

        // Set frame properties
        this.setTitle("Button Counter Example");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Increment the counter value and update the counter label
        counter++;
        counterLabel.setText("Counter: " + counter);
    }

    public static void main(String[] args) {
        new ButtonCounterExample();
    }
}


