package Com.kumalJiban;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonExample {

    private JFrame frame;
    private JRadioButton option1, option2, option3, option4, option5;
    private JLabel resultLabel;

    public static void main(String[] args) {
        new RadioButtonExample();
    }

    public RadioButtonExample(){
        // Create the frame
        frame = new JFrame("Radio Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the content pane
        JPanel contentPane = new JPanel();
        contentPane.setPreferredSize(new Dimension(400, 200));

        // Create the radio buttons
         option1 = new JRadioButton("Nepal");
         option2 = new JRadioButton("Nigeria");
         option3 = new JRadioButton("New Zealand");
         option4 = new JRadioButton("Norway");
         option5 = new JRadioButton("Netherlands");

        // Create a button group and add the radio buttons to it
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        group.add(option5);

        // Create the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectOption = "";
                if (option1.isSelected()) {
                    selectOption = "Nepal";
                } else if (option2.isSelected()) {
                    selectOption = "Nigeria";
                } else if (option3.isSelected()) {
                    selectOption = "New Zealand";
                } else if (option4.isSelected()) {
                    selectOption = "Norway";
                } else if (option5.isSelected()) {
                    selectOption = "Netherlands";
                } else {
                    resultLabel.setText("Please select an option");
                    return;
                }
                resultLabel.setText("You Select : " + selectOption);
            }
        });

        // Add the radio buttons and submit button to the content pane
        contentPane.add(option1);
        contentPane.add(option2);
        contentPane.add(option3);
        contentPane.add(option4);
        contentPane.add(option5);
        contentPane.add(submitButton);

        // Create the result label
        resultLabel = new JLabel("");

        // Add the result label to the content pane
        contentPane.add(resultLabel);

        // Set the content pane and show the frame
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

