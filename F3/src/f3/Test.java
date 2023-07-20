package f3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test extends JFrame {
    
    private ImageIcon icon;
    
    Test() {
      initComponents();
        
    }
    
    public void initComponents() {
        icon = new ImageIcon(getClass().getResource("home (1).png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        Test fream = new Test();
        fream.setVisible(true);
        fream.setDefaultCloseOperation(Test.EXIT_ON_CLOSE);
        
        fream.setBounds(100, 50, 400, 500);
        fream.setTitle("Bionic");
    }
    
}
