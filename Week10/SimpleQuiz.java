Program to demonstrate an interactive quiz form using Java Swing components. The program:

Creates a GUI quiz with multiple choice, checkbox, and text input questions
#Uses JRadioButton, JCheckBox, JTextField, and JTextArea for user responses
#Implements ActionListener to handle quiz submission
#Evaluates answers and calculates the total score
#Displays correct answers and score using a dialog box
#Demonstrates GridLayout, component arrangement, and basic event handling
#Useful for understanding GUI-based interactive forms and Java Swing event-driven programming


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleQuiz extends JFrame implements ActionListener {
    JRadioButton q1a, q1b, q1c, q1d;
    JCheckBox q2a, q2b, q2c, q2d;
    JTextField q3;
    JTextArea q4;
    JButton submit;
    ButtonGroup group1;
    public SimpleQuiz() {
        setTitle("Interactive Quiz Form");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 1, 5, 5));
        add(new JLabel("1. Which language is used for Android development?"));
        q1a = new JRadioButton("Python");
        q1b = new JRadioButton("Kotlin");
        q1c = new JRadioButton("Swift");
        q1d = new JRadioButton("C#");
        group1 = new ButtonGroup();
        group1.add(q1a); group1.add(q1b); group1.add(q1c); group1.add(q1d);
        add(q1a); add(q1b); add(q1c); add(q1d);
        add(new JLabel("2. Which of the following are programming languages? (Select all that apply)"));
        q2a = new JCheckBox("HTML");
        q2b = new JCheckBox("Java");
        q2c = new JCheckBox("Python");
        q2d = new JCheckBox("CSS");
        add(q2a); add(q2b); add(q2c); add(q2d);
        add(new JLabel("3. What keyword is used to create an object in Java?"));
        q3 = new JTextField();
        add(q3);
        add(new JLabel("4. Mention one advantage of Object-Oriented Programming:"));
        q4 = new JTextArea(3, 20);
        add(q4);
        submit = new JButton("Submit Quiz");
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int score = 0;
        StringBuilder answers = new StringBuilder("Correct Answers:\n");
        if (q1b.isSelected()) score++;
        answers.append("1. Kotlin\n");
        if (q2b.isSelected() && q2c.isSelected() && !q2a.isSelected() && !q2d.isSelected())
            score++;
        answers.append("2. Java, Python\n"); 
        if (q3.getText().trim().equalsIgnoreCase("new")) score++;
        answers.append("3. new\n"); 
        String ans4 = q4.getText().toLowerCase();
        if (ans4.contains("reusability") || ans4.contains("modularity")) score++;
        answers.append("4. Example: Reusability / Modularity\n");
        JOptionPane.showMessageDialog(this,
                "Your Total Score: " + score + "/4\n\n" + answers,
                "Quiz Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        new SimpleQuiz();
    }
}
