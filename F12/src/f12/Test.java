package f12;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Test extends JFrame {//button demo
    private Container c;
    private JButton btn1,btn2;
    private Font f;
    
    Test(){
    component();
    }
    
    public void component(){
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.white);
       
       f=new Font("Arial",Font.BOLD,14);
       
       btn1 = new JButton("submit");
       btn1.setBounds(30, 50, 100, 50);
       btn1.setFont(f);
       c.add(btn1);
       
        btn2 = new JButton("clear");
       btn2.setBounds(140, 50, 100, 50);
       btn2.setFont(f);
       c.add(btn2);
    }
 
   
    public static void main(String[] args) {
      Test frame = new Test();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(800, 400, 450, 300);
      frame.setTitle("Bionic");
    }
    
}
