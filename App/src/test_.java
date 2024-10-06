import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class test_ extends JFrame {
    private JLabel userLabel, passLabel, CLabel, logoLabel, nameLabel, NLabel, PLabel, MLabel;
    private JTextField emailField, nameField, messageField;
    private JButton submitButton;
    private Container c;
    private Font f, y;

    test_() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 350);
        this.setTitle("Contact Us Form");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        f = new Font("Arial", Font.BOLD, 16);
        y = new Font("Arial", Font.BOLD, 19);

        // Adding the logo
        ImageIcon logoIcon = new ImageIcon("pic.PNG");
        logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(10, 10, 50, 50);
        c.add(logoLabel);

        nameLabel = new JLabel("SAM");
        nameLabel.setBounds(10, 10, 50, 20);
        nameLabel.setFont(y);
        nameLabel.setForeground(Color.RED);
        c.add(nameLabel);

       
        CLabel = new JLabel("Contact us");
        CLabel.setBounds(190, 10, 200, 20);
        CLabel.setFont(y);
        CLabel.setForeground(Color.RED);
        c.add(CLabel);

        userLabel = new JLabel("Email address:");
        userLabel.setBounds(50, 40, 300, 40);
        userLabel.setFont(f);
        c.add(userLabel);

        emailField = new JTextField();
        emailField.setFont(f);
        emailField.setBounds(170, 40, 200, 40);
        c.add(emailField);

        passLabel = new JLabel("Your Name:");
        passLabel.setBounds(50, 70, 300, 40);
        passLabel.setFont(f);
        c.add(passLabel);

        nameField = new JTextField();
        nameField.setFont(f);
        nameField.setBounds(170, 70, 200, 40);
        c.add(nameField);

        MLabel = new JLabel("Write Your Message:");
        MLabel.setBounds(0, 100, 300, 40);
        MLabel.setFont(f);
        c.add(MLabel);

        messageField = new JTextField();
        messageField.setFont(f);
        messageField.setBounds(170, 100, 200, 100);
        c.add(messageField);

        submitButton = new JButton("Submit ");
        submitButton.setBounds(170, 210, 200, 40);
        submitButton.setFont(f);
        c.add(submitButton);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        test_ frame = new test_();
    }
}
