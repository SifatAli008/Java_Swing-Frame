package f11;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test extends JFrame {

    private Container c;
    private ImageIcon icon, img;
    private JLabel imgLabel;
    private JTextField tf1;
    private JPasswordField tf2;
    private Font f;

    Test() {
        Components();
    }

    public void Components() {

        // container 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        //titel icon
        icon = new ImageIcon(getClass().getResource("home.png"));
        this.setIconImage(icon.getImage());

        //image
        img = new ImageIcon(getClass().getResource("image.jpg"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, 400, 700);
        c.add(imgLabel);

        //font
        f = new Font("Arial", Font.BOLD, 17);

        //username, and password   text field
        tf1 = new JTextField("Enter your name.");
        tf1.setBounds(450, 200, 400, 30);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setFont(f);
        c.add(tf1);

        tf2 = new JPasswordField();
        tf2.setBounds(450, 250, 400, 30);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setFont(f);
        c.add(tf2);

        Handelar handeler = new Handelar();
        tf1.addActionListener(handeler);
        tf2.addActionListener(handeler);
    }

    class Handelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "not submited");
                } else {
                    JOptionPane.showMessageDialog(null, "Tf1 = " + s);
                }
            } else {
                String s = tf2.getText();
                 if (s.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Your name ");
            } 
            
           else if(s.equals("1234")) {
                JOptionPane.showMessageDialog(null, "Correct Password");
            }
            
            else{
                  JOptionPane.showMessageDialog(null, "Wrong PassWord" );
            }
            }

        }
    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 20, 900, 700);
        frame.setTitle("Bionic");
    }

}
