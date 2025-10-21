Program to demonstrate a Google account creation form using Java Swing components. The program:

#Creates a GUI form to input user details like name, username, password, phone, recovery email, DOB, and gender
#Uses JLabels, JTextFields, JPasswordFields, JComboBox, and JButtons for interaction
#Implements ActionListener to handle create, reset, and cancel button events
#Validates all fields are filled, email format, password strength, and password match
#Displays success message or error messages in a label
#Demonstrates GridLayout, panel usage, and component arrangement
#Useful for understanding form validation, event-driven programming, and Swing GUI design in Java


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
public class AccountForm extends JFrame implements ActionListener {
    JLabel lfn, lln, lun, lpwd, lcpwd, lphone, lrecovery, ldob, lgender, lresult;
    JTextField tfn, tln, tun, tphone, trecovery, tmonth, tday, tyear;
    JPasswordField tpwd, tcpwd;
    JComboBox<String> cbgender;
    JButton bcreate, breset, bcancel;
    public AccountForm() {
        super("Create Google Account");
        lfn = new JLabel("First Name:");
        lln = new JLabel("Last Name:");
        lun = new JLabel("Username:");
        lpwd = new JLabel("Password:");
        lcpwd = new JLabel("Confirm Password:");
        lphone = new JLabel("Phone Number:");
        lrecovery = new JLabel("Recovery Email:");
        ldob = new JLabel("DOB (MM/DD/YYYY):");
        lgender = new JLabel("Gender:");
        lresult = new JLabel("", JLabel.CENTER);
        tfn = new JTextField(10); tln = new JTextField(10); tun = new JTextField(15);
        tpwd = new JPasswordField(15); tcpwd = new JPasswordField(15);
        tphone = new JTextField(10); trecovery = new JTextField(15);
        tmonth = new JTextField(2); tday = new JTextField(2); tyear = new JTextField(4);
        String[] genders = {"Select", "Male", "Female", "Other"};
        cbgender = new JComboBox<>(genders);
        bcreate = new JButton("Create Account");
        breset = new JButton("Reset");
        bcancel = new JButton("Cancel");
        bcreate.addActionListener(this);
        breset.addActionListener(this);
        bcancel.addActionListener(this);
        setLayout(new GridLayout(12, 2, 5, 5));
        add(lfn); add(tfn);
        add(lln); add(tln);
        add(lun); add(tun);
        add(lpwd); add(tpwd);
        add(lcpwd); add(tcpwd);
        add(lphone); add(tphone);
        add(lrecovery); add(trecovery);
        add(ldob);
        JPanel dobPanel = new JPanel();
        dobPanel.add(tmonth); dobPanel.add(tday); dobPanel.add(tyear);
        add(dobPanel);
        add(lgender); add(cbgender);
        add(bcreate); add(breset);
        add(bcancel); add(lresult);
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    boolean isEmailValid(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w+$";
        return Pattern.matches(regex, email);
    }
    boolean isPasswordStrong(String pwd) {
        return pwd.length() >= 8;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bcreate) {
            try {
                if (tfn.getText().trim().isEmpty() ||
                    tln.getText().trim().isEmpty() ||
                    tun.getText().trim().isEmpty() ||
                    new String(tpwd.getPassword()).trim().isEmpty() ||
                    new String(tcpwd.getPassword()).trim().isEmpty() ||
                    tphone.getText().trim().isEmpty() ||
                    trecovery.getText().trim().isEmpty() ||
                    tmonth.getText().trim().isEmpty() ||
                    tday.getText().trim().isEmpty() ||
                    tyear.getText().trim().isEmpty() ||
                    cbgender.getSelectedIndex() == 0) {
                    throw new Exception("All fields must be filled.");
                }
                if (!isEmailValid(tun.getText().trim())) {
                    throw new Exception("Invalid email ID.");
                }
                String pwd = new String(tpwd.getPassword());
                String cpwd = new String(tcpwd.getPassword());
                if (!pwd.equals(cpwd)) throw new Exception("Passwords do not match.");
                if (!isPasswordStrong(pwd)) throw new Exception("Password must be at least 8 characters.");

                lresult.setText("Account created successfully!");
            } catch (Exception ex) {
                lresult.setText(ex.getMessage());
            }
        } else if (e.getSource() == breset) {
            tfn.setText(""); tln.setText(""); tun.setText("");
            tpwd.setText(""); tcpwd.setText(""); tphone.setText("");
            trecovery.setText(""); tmonth.setText(""); tday.setText(""); tyear.setText("");
            cbgender.setSelectedIndex(0);
            lresult.setText("");
        } else if (e.getSource() == bcancel) {
            dispose();
        }
    }
    public static void main(String[] args) {
        new AccountForm();
    }
}
