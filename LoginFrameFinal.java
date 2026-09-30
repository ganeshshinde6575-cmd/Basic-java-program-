import java.awt.event.*;
import javax.swing.*;

public class LoginFrameFinal extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    LoginFrameFinal() {
        setTitle("Login Form");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Password:");
        l2.setBounds(50, 90, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 180, 30);

        t2 = new JPasswordField();
        t2.setBounds(150, 90, 180, 30);

        b1 = new JButton("Login");
        b1.setBounds(100, 140, 90, 30);

        b2 = new JButton("Clear");
        b2.setBounds(210, 140, 90, 30);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String username = t1.getText();
            String password = new String(t2.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginFrameFinal();
    }
}