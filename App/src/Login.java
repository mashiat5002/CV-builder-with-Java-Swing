
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame {
    private JLabel userLabel, passLabel,  CLabel , logoLabel, nameLabel, NLabel, PLabel ;
    private JTextField tf;
    private JPasswordField pf;
    private JButton submitButton,b1;
    private Container c;
    private Font f,y;

    Login() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 350); 
        this.setTitle("Login Demo ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        setLocationRelativeTo(null);
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

        NLabel = new JLabel("Resume CV");
        NLabel .setBounds(190, 10, 200, 20); 
        NLabel .setFont(y);
        NLabel .setForeground(Color.RED);
        c.add( NLabel );

        b1 = new JButton("Contact us");
        b1.setBounds(340, 10, 130, 20);
        b1.setFont(f);
        b1.setForeground(Color.RED);
        c.add(b1);

        userLabel = new JLabel("Email address:");
        userLabel.setBounds(50, 40, 300, 40);
        c.add(userLabel);
        userLabel.setFont(f);
        userLabel.setBackground(Color.white);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(170, 40, 200, 40); 
        c.add(tf);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(70, 100, 300, 40); 
        passLabel.setFont(f);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setBounds(170, 100, 200, 40); 
        pf.setEchoChar('*');
        pf.setFont(f);
        c.add(pf);
        PLabel = new JLabel("Build a new CV in minutes or" +
        "\n improve your existing one.");
        PLabel .setBounds(30, 160, 700, 20); 
        PLabel .setFont(f);
        PLabel .setForeground(Color.BLUE);
        c.add( PLabel );
        submitButton = new JButton("Make Your CV ");
        submitButton.setBounds(170, 190, 200, 40); 
        submitButton.setFont(f);
        c.add(submitButton);
        trigger trg= new trigger();
        submitButton.addActionListener(trg);
        setVisible(true);
        trigger2 trg2= new trigger2();
        b1.addActionListener(trg2);
        
        
    }
    class trigger2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            new test_ ();
            
        }
    }
    class trigger implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            new Log2();
            dispose();
            
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}