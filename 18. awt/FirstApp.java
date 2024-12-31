import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        Frame f=new Frame("MyFirstJavaApp");
        f.setLayout(new FlowLayout());

        Button b=new Button("okay");
        
        Label l=new Label("woohoo");
        
        TextField tf=new TextField(20);
        
        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
