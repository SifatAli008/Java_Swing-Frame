package f5;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test extends JFrame {

      private ImageIcon icon;
      private Container c;

    Test() {
        initContent();
    }

    public void initContent() {
        c = this.getContentPane();
        c.setBackground(Color.green);
        
        icon = new ImageIcon(getClass().getResource("creativity.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {

        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Test.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("SAFRI");
    }

}
