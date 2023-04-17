package Com.kumalJiban;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarExample
{
    private JLabel messageLabel;
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MenuBarExample().createAndShowGUI());
    }

    public void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the file menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> showMessage("New file created."));
        fileMenu.add(newMenuItem);

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(e -> showMessage("Opening file..."));
        fileMenu.add(openMenuItem);

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(e -> showMessage("Saving file..."));
        fileMenu.add(saveMenuItem);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitMenuItem);

        // Add the file menu to the menu bar
        menuBar.add(fileMenu);

        // Create the edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.addActionListener(e -> showMessage("Cutting selected text..."));
        editMenu.add(cutMenuItem);

        JMenuItem copyMenuItem = new JMenuItem( "Copy");
        copyMenuItem.addActionListener(e -> showMessage("Copying selected text..."));
        editMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.addActionListener(e -> showMessage("Pasting text..."));
        editMenu.add(pasteMenuItem);

        // Add the edit menu to the menu bar
        menuBar.add(editMenu);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Set up the content pane
        messageLabel = new JLabel("Message...");
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(messageLabel, BorderLayout.CENTER);

        // Show the frame
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void showMessage(String message) {
        messageLabel.setText(message);
    }
}


