package p8;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame{
    
  private Container c;
  private ImageIcon img;
  
  Test(){
    init();
  }
  
  public void init(){
  c=this.getContentPane();
  c.setLayout(null);
  c.setBackground(Color.getHSBColor(209, 34, 59));
  
  img = new ImageIcon(getClass().getResource("image.jpg"));
  
      JLabel imageLabel = new JLabel(img);
      imageLabel.setBounds(50,20,img.getIconWidth(),img.getIconHeight());
      c.add(imageLabel);
  
  }
    public static void main(String[] args) {
       Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 900, 700);
        frame.setTitle("Safari");
    }
    
}
