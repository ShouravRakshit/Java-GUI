import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "Ivan";
        String correctPassword = "Ivan";

        JFrame frame = new JFrame();
        frame.setSize(500, 300);

        JLabel user = new JLabel("Username : ");
        user.setFont(new Font("Verdana", Font.PLAIN, 15));
        user.setBounds(10, 10, 120, 20);

        JTextArea userText = new JTextArea();
        userText.setBounds(100, 12, 140, 20);
        userText.getText();

        JLabel password = new JLabel("Password :");
        password.setFont(new Font("Verdana", Font.PLAIN, 15));
        password.setBounds(10, 40, 120, 20);

        JPasswordField hiddenPassword = new JPasswordField();
        hiddenPassword.setBounds(100, 42, 140, 20);

        JButton button = new JButton("Login");
        button.setBounds(10, 70, 70, 20);

        JLabel success = new JLabel("");
        success.setFont(new Font("Verdana", Font.PLAIN, 15));
        success.setBounds(230, 100, 120, 20);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usernameContent = userText.getText();
                String passwordContent = hiddenPassword.getText();

                if ((usernameContent.equals(correctUsername)) && (passwordContent.equals(correctPassword))) {
                    e.getSource();
                    LoginNextPage myWindow = new LoginNextPage();
                } else {
                    success.setText("");
                }
            }
        });

        // Adding all the components to the Panel.

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(user);
        panel.add(userText);
        panel.add(password);
        panel.add(hiddenPassword);
        panel.add(button);
        panel.add(success);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.setVisible(true);
    }
}
