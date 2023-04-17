package Com.kumalJiban;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample extends JFrame implements KeyListener {
    public TextAreaExample() {
        // Create a text area
        JTextArea textArea = new JTextArea();
        textArea.addKeyListener(this);

        // Add the text area to the frame
        this.add(textArea, BorderLayout.CENTER);

        // Set frame properties
        this.setTitle("Text Area Example");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Get the ASCII value of the character typed by the user
        int asciiValue = e.getKeyChar();

        // Print the ASCII value in the console
        System.out.println("ASCII Value: " + asciiValue);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("you pressed : " +e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("you released :" +e.getKeyChar());
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}

