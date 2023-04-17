package Com.kumalJiban;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame implements ActionListener {

    final private JTextField emailField;
    final private JPasswordField passwordField;
    final private JPasswordField confirmPasswordField;

    public RegistrationForm() {
        // Create labels and text fields for email, password, and confirm password
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(20);

        // Create a submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add the labels, text fields, and submit button to a panel
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5,5,5,5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(emailLabel,constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(emailField,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordField,constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(confirmPasswordLabel,constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(confirmPasswordField,constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        panel.add(submitButton,constraints);

        // Add the panel to the frame
        this.add(panel);

        // Set frame properties
        this.setTitle("Registration Form");
        this.setSize(400, 200);
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the user input from the email, password, and confirm password fields
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (email. isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter email");
            return;
        }
        if (password. isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate the password
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this,
                    "Password must be at least 8 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the password and confirm password fields match
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this,
                    "Password and Confirm Password fields must match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Registration successful
        JOptionPane.showMessageDialog(this,
                "Registration Successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

