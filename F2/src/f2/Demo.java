package f2;

import javax.swing.JFrame;

public class Demo extends JFrame {

    Demo() {// useing constructor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("This is a Title");
    }

    public static void main(String[] args) {
        Demo frame = new Demo();
        frame.setVisible(true);
    }

}
