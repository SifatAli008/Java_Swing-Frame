package f7;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel userLable, passLable;
    private Font f;

    Test() {
        initcomponent();
    }

    public void initcomponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        icon = new ImageIcon(getClass().getResource("profile.png"));
        this.setIconImage(icon.getImage());
        
        f = new Font("Arial",Font.BOLD,15);//FONT NAME,COLOR,SIZE

        userLable = new JLabel();
        userLable.setText("Enter your user Name: ");
        userLable.setBounds(50, 20, 250, 50);
        userLable.setFont(f);
        userLable.setForeground(Color.yellow);//Font Color
        userLable.setToolTipText("Enter your Full Name: ");//Hover the line
        c.add(userLable);

        passLable = new JLabel("Enter your user Password: ");
        passLable.setBounds(50, 100, 300, 50);
        passLable.setFont(f);
         passLable.setOpaque(true);//change default
         passLable.setBackground(Color.yellow);
        c.add(passLable);
    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Safari");
    }

}
