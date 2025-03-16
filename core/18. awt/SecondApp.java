import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    public MyFrame() {
        super("custom app");

        setLayout(new FlowLayout());

        l=new Label("hii");
        tf=new TextField(20);
        b=new Button("hit");

        add(l);
        add(tf);
        add(b);
    }
}

public class SecondApp {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400, 500);
        f.setVisible(true);
    }
}
