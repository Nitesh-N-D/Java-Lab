Program to demonstrate a shopping cart application using Java Swing components. The program:

#Allows users to select items from a combo box
#Uses JComboBox, JTextArea, and JButtons for interaction
#Adds selected items to the cart display
#Calculates and shows the total amount of selected items
#Implements ActionListener to handle add and total button events
#Demonstrates FlowLayout, component arrangement, and basic GUI design
#Useful for understanding interactive GUI applications and event-driven programming in Java

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShoppingCart extends JFrame implements ActionListener {
    JComboBox<String> items;
    JTextArea display;
    JButton add, total;
    double totalAmount = 0;

    String[] itemNames = {"Select Item", "Laptop", "Mobile", "Headphones", "Mouse"};
    double[] itemPrices = {0, 60000, 25000, 2000, 800};

    ShoppingCart() {
        setTitle("Shopping Cart");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Choose Item:"));
        items = new JComboBox<>(itemNames);
        add(items);

        add = new JButton("Add");
        total = new JButton("Total");
        add(add); add(total);

        display = new JTextArea(10, 25);
        add(new JScrollPane(display));

        add.addActionListener(this);
        total.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            int index = items.getSelectedIndex();
            if (index > 0) {
                display.append(itemNames[index] + " - ₹" + itemPrices[index] + "\n");
                totalAmount += itemPrices[index];
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item!");
            }
        } else if (e.getSource() == total) {
            display.append("\nTotal Amount: ₹" + totalAmount + "\n");
        }
    }

    public static void main(String[] args) {
        new ShoppingCart();
    }
}

