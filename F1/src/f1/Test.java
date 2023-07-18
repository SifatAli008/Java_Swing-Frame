package f1;

import javax.swing.JFrame;


public class Test {

    public static void main(String[] args) {
       
        JFrame frame = new JFrame();
        frame.setVisible(true);// Visible Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close Option
      //  frame.setSize(600, 500);// size
       // frame.setLocationRelativeTo(null);
     //  frame.setLocation(200,50);//RIGHT AND TOP
       frame.setBounds(200,50,400,300);//size and location
       frame.setTitle("Frame Demo");
       frame.setResizable(false);
       
    }
    
}
