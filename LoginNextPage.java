import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginNextPage {

    public LoginNextPage() {
        JFrame frame = new JFrame();
        frame.setSize(500, 300);

        JLabel success = new JLabel();
        success.setFont(new Font("Verdana", Font.PLAIN, 15));
        success.setText("Success!");
        success.setBounds(230, 100, 120, 20);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(success);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.setVisible(true);
    }

}
