Program to demonstrate a simple addition operation using Java Swing components. 
The program:
#Creates a GUI-based calculator for adding two numbers
#Uses JLabels, JTextFields, and JButtons for user interaction
#Implements ActionListener to handle button events
#Demonstrates FlowLayout, Font styling, and Color customization
#Useful for understanding event-driven programming and basic Swing GUI design in Java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddApplication extends JFrame implements ActionListener {
    JLabel firstLabel, secondLabel,resultLabel;
    JTextField firstText, secondText, sumText;
    JButton add, clear;

    AddApplication() {
        firstLabel = new JLabel("First Number");
        firstLabel.setFont(new Font("Arial", Font.BOLD,14));
        firstLabel.setForeground(Color.pink);
        firstLabel.setBackground(Color.gray);
        secondLabel = new JLabel("Second Number");
        secondLabel.setFont(new Font("Arial", Font.BOLD,14));
        secondLabel.setForeground(Color.blue);
        secondLabel.setBackground(Color.white);
        resultLabel=new JLabel("Sum");
        resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Arial", Font.BOLD,14));
        resultLabel.setForeground(Color.blue);
        firstText = new JTextField(10);
        secondText = new JTextField(10);
        sumText=new JTextField(10);
        add = new JButton("Add");
        clear = new JButton("Clear");
        add(firstLabel);
        add(firstText);
        add(secondLabel);
        add(secondText);
        add(resultLabel);
        add(sumText);
        add(add);
        add(clear);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==add)
        {
            String A=firstText.getText().trim();
            String B=secondText.getText().trim();
            int sum=Integer.parseInt(A)+Integer.parseInt(B);
            sumText.setText(String.valueOf(sum));
        }
        if(e.getSource()==clear)
        {
            firstText.setText(" ");
            secondText.setText(" ");
            sumText.setText(" ");
        }

    }

    public static void main(String[] args) {
        new AddApplication();
    }

}
