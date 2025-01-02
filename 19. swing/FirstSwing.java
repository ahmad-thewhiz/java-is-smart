import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel l;
    JButton b;
    int count=0;

    MyFrame() {
        super("first swing applicaiton");

        setLayout(new FlowLayout());

        l=new JLabel("clicked "+count+" times");
        b=new JButton("click me");
    
        add(l);
        add(b);
        b.addActionListener(this);

        getRootPane().setDefaultButton(b);
        // b.setIcon(new ImageIcon("icon.png")); // set icon for button

        l.setToolTipText("counter"); // yellow colored highlighted box with text seens upon hovering over label
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("clicked "+count+" times");
    }
}

public class FirstSwing {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
