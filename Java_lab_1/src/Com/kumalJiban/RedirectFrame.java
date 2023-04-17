package Com.kumalJiban;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedirectFrame extends JFrame implements ActionListener {
    private JButton redirectButton;

    public RedirectFrame() {
        // Create a button to trigger the redirection
        redirectButton = new JButton("Redirect");
        redirectButton.addActionListener(this);

        // Add the button to the frame's content pane
        Container contentPane = getContentPane();
        contentPane.add(redirectButton, BorderLayout.CENTER);

        // Set the frame properties
        setTitle("Redirect Frame");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Create a new frame to redirect to
        JFrame newFrame = new JFrame("New Frame");
        newFrame.setSize(300, 200);
        newFrame.setLocationRelativeTo(null); // Center the frame on the screen
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new frame
        newFrame.setVisible(true);

        // Dispose the current frame to complete the redirection
        dispose();
    }

    public static void main(String[] args) {
        // Create the initial frame and display it
        RedirectFrame frame = new RedirectFrame();
        frame.setVisible(true);
    }
}

