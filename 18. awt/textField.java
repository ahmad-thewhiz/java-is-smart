import java.awt.*;
import java.awt.event.*;

import org.w3c.dom.Text;

class MyFrame extends Frame {
    Label l1, l2;
    TextField tf;

    MyFrame() {
        super("text field");

        l1=new Label("no text is entered yet");
        l2=new Label("hit enter");
        tf=new TextField(20);

        tf.setEchoChar('*');

        Handler h=new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(l2);    
    }

    
    class Handler implements TextListener, ActionListener {
        public void textValueChanged(TextEvent te) {
            l1.setText(tf.getText());
        }
    
        public void actionPerformed(ActionEvent ae) {
            l2.setText((tf.getText()));
        }
    }
}

public class textField {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();

        f.setSize(400, 400);
        f.setVisible(true);
    }
}
