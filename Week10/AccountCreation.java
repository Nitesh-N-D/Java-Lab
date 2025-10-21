Program to demonstrate a user account creation form using Java Swing components. The program:

Creates a GUI form to enter username and password
#Uses JLabels, JTextFields, JTextArea, and JButtons for interaction
#Implements ActionListener to handle submit and clear button events
#Validates username length and password rules (uppercase & digit)
#Displays success message or error messages in a text area
#Demonstrates FlowLayout, Font styling, and Color customization
#Useful for understanding event-driven programming and basic Swing GUI design in Java

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AccountCreation extends JFrame implements ActionListener {
    JLabel firstLabel, secondLabel, resultLabel;
    JTextField firstText, secondText;
    JTextArea result;
    JButton submitButton, clearButton;

    AccountCreation() {
        firstLabel = new JLabel("Enter User Name");
        firstLabel.setFont(new Font("Arial", Font.BOLD, 14));
        firstLabel.setForeground(Color.pink);

        secondLabel = new JLabel("Enter the Password");
        secondLabel.setFont(new Font("Arial", Font.BOLD, 14));
        secondLabel.setForeground(Color.blue);

        resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(Color.blue);

        firstText = new JTextField(10);
        secondText = new JTextField(10);

        result = new JTextArea(5, 20);
        result.setEditable(false);
        result.setLineWrap(true);
        result.setWrapStyleWord(true);

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        setLayout(new FlowLayout());
        add(firstLabel);
        add(firstText);
        add(secondLabel);
        add(secondText);
        add(resultLabel);
        add(new JScrollPane(result));
        add(submitButton);
        add(clearButton);

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            StringBuilder error = new StringBuilder();

            String name = firstText.getText().trim();
            if (name==null||name.isEmpty() || name.length() < 3) {
                error.append("Error: Username length should be at least 3 characters");
            }

            String password = secondText.getText();
            boolean hasDigit = false;
            boolean hasUpper = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                }
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpper = true;
                }
            }

            if (!hasDigit) {
                error.append("Error: Password must contain at least one digit");
            }
            if (!hasUpper) {
                error.append("Error: Password must contain at least one uppercase letter");
            }

            if (error.length() == 0) {
                result.setText("Account created successfully");
            } else {
                result.setText(error.toString());
            }
        } else if (e.getSource() == clearButton) {
            firstText.setText("");
            secondText.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new AccountCreation();
    }
}
