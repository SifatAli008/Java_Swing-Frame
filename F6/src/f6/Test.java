package f6;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {//labelDemo

    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;

    Test() {
        init();
    }

    public void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        icon = new ImageIcon(getClass().getResource("profile.png"));
        this.setIconImage(icon.getImage());

        userLabel = new JLabel();
        userLabel.setText("Enter your user name: ");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel);
    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Safari");

    }

}
