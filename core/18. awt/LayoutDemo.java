import java.awt.*;

class MyFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame() {
        super("FlowLayoutDemo");

        // Initializing buttons
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        // Setting layout for the frame
        setLayout(new BorderLayout());

        // Adding buttons to specific regions of BorderLayout
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.CENTER);
        add(b4, BorderLayout.WEST);

        // Creating a panel with GridLayout and adding buttons
        Panel p = new Panel();
        p.setLayout(new GridLayout(3, 1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));
        add(p, BorderLayout.EAST);

        // Setting frame properties
        setSize(400, 400); // Frame dimensions
        setVisible(true); // Make the frame visible
    }
}

public class LayoutDemo {
    public static void main(String[] args) {
        // Creating an instance of MyFrame
        new MyFrame();
    }
}
