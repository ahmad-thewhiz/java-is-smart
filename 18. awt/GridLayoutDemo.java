import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame() {
        super("Grid Layout Example");
        
        // Setting GridLayout with 3 rows and 2 columns
        setLayout(new GridLayout(3, 2, 5, 5));  // Added gaps between buttons

        // Initializing buttons
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        // Adding buttons to grid
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        // Window settings
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
