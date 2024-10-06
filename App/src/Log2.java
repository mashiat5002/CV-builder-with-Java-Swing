
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

public class Log2 extends JFrame {
    private JLabel uLabel, TLabel, ELabel, nameLabel, NLabel, CLabel;
    private JTextField tf;
    private JButton submitButton,b1;
    private Container c;
    private Font f, x,y;


    Log2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 350);
        this.setTitle("Login Demo ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        setLocationRelativeTo(null);
        f = new Font("Arial", Font.BOLD, 16);
        x = new Font("Arial", Font.BOLD, 22);
        y = new Font("Arial", Font.BOLD, 19);

        nameLabel = new JLabel("SAM");
        nameLabel.setBounds(10, 10, 50, 20);
        nameLabel.setFont(y);
        nameLabel.setForeground(Color.RED);
        c.add(nameLabel);

        NLabel = new JLabel("Resume CV");
        NLabel.setBounds(190, 10, 200, 20);
        NLabel.setFont(y);
        NLabel.setForeground(Color.RED);
        c.add(NLabel);

        b1 = new JButton("Contact us");
        b1.setBounds(340, 10, 130, 20);
        b1.setFont(f);
        b1.setForeground(Color.RED);
        c.add(b1);

        ELabel = new JLabel("Where are you focusing your job search?");
        ELabel.setBounds(40, 80, 500, 20);
        ELabel.setFont(x);
        ELabel.setForeground(Color.BLUE);
        c.add(ELabel);

        uLabel = new JLabel("Country Name");
        uLabel.setBounds(180, 110, 200, 20);
        uLabel.setFont(f);
        uLabel.setForeground(Color.ORANGE);
        c.add(uLabel);

        tf = new JTextField("Bangladesh");
        tf.setFont(f);
        tf.setBounds(180, 140, 200, 30);
        c.add(tf);

        

        TLabel = new JLabel("Great! We'll recommend templates for your target destination.");
        TLabel.setBounds(10, 190, 600, 20);
        TLabel.setFont(f);
        TLabel.setForeground(Color.YELLOW);
        c.add(TLabel);

        submitButton = new JButton("SEE TEMPLATE");
        submitButton.setBounds(170, 230, 200, 40);
        submitButton.setFont(f);
        c.add(submitButton);
        setVisible(true);
        trigger trg= new trigger();
        submitButton.addActionListener(trg);
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
            
            new App();
            dispose();
            
        }
    }
    public static void main(String[] args) {
        new Log2();
    }
}