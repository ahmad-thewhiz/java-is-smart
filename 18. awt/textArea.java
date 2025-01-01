import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame() {
        super("text area demo");

        l=new Label("no text");
        ta=new TextArea(10, 30); //rows, columns
        tf=new TextField(20); //columns
        b=new Button("click");

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        // ta.append(tf.getText());
        // l.setText(ta.getSelectedText());

        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}

public class textArea {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
