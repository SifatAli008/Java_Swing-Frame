package f9;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test extends JFrame { // text filed demo

    private Container c;
    private JTextField tf1,tf2,tf3; 
    private Font f;

    Test() {
        init();
    }

    public void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        f  = new Font("Arial",Font.BOLD+Font.ITALIC,18);
       
        tf1 = new JTextField();
        tf1.setBounds(50, 20, 200, 30);
        tf1.setFont(f);
        c.add(tf1);
        
         tf2 = new JTextField("Sifat Ali");
        tf2.setBounds(50, 60, 200, 30);
        tf2.setForeground(Color.white);//font color
        tf2.setBackground(Color.black);//backgroun
        c.add(tf2);
        
         tf3 = new JTextField();
         tf3.setBounds(50, 100, 200, 30);
         tf3.setHorizontalAlignment(JTextField.CENTER);
         c.add(tf3);
        
        
    }

    public static void main(String[] args) {
        Test Frame = new Test();
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setBounds(50, 50, 900, 700);
        Frame.setTitle("Bionic");
    }

}
