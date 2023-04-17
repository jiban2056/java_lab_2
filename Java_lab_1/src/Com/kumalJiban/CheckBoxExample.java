package Com.kumalJiban;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxExample extends JFrame implements ActionListener {

    private final ArrayList<JCheckBox> checkBoxList;
    private final JLabel resultLabel;

    public CheckBoxExample() {
        // Create checkboxes
        JCheckBox option1 = new JCheckBox("Option 1");
        JCheckBox option2 = new JCheckBox("Option 2");
        JCheckBox option3 = new JCheckBox("Option 3");
        JCheckBox option4 = new JCheckBox("Option 4");
        JCheckBox option5 = new JCheckBox("Option 5");

        // Create a submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create a label to show the selected options
        resultLabel = new JLabel();

        // Add the checkboxes, submit button, and result label to a panel
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(option4);
        panel.add(option5);
        panel.add(submitButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        this.add(panel);

        // Set frame properties
        this.setTitle("Checkbox Example");
        this.setSize(300, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add checkboxes to the checkbox list
        checkBoxList = new ArrayList<>();
        checkBoxList.add(option1);
        checkBoxList.add(option2);
        checkBoxList.add(option3);
        checkBoxList.add(option4);
        checkBoxList.add(option5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get selected checkboxes
        ArrayList<String> selectedOptions = new ArrayList<>();
        for (JCheckBox checkBox : checkBoxList) {
            if (checkBox.isSelected()) {
                selectedOptions.add(checkBox.getText());
            }
        }

        // Display selected options
        StringBuilder resultText = new StringBuilder("Selected options: ");
        if (selectedOptions.isEmpty()) {
            resultText.append("None");
        } else {
            for (String option : selectedOptions) {
                resultText.append(option).append(" ");
            }
        }
        resultLabel.setText(resultText.toString());
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}


