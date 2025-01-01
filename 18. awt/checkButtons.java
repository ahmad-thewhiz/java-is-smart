import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

class MyFrame extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;

    public MyFrame() {
        super("nothing is selected.");

        l=new Label("                                           ");

        // c1=new Checkbox("java");
        // c2=new Checkbox("python");
        // c3=new Checkbox("cpp");

        // checkboxgroup converts checkboxes into radio buttons

        cbg=new CheckboxGroup();
        c1=new Checkbox("java", false, cbg);
        c2=new Checkbox("python", false, cbg);
        c3=new Checkbox("cpp", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";

        if(c1.getState())
            str+=" "+c1.getLabel();
        if(c2.getState())
            str+=" "+c2.getLabel();
        if(c3.getState())
            str+=" "+c3.getLabel();

        if(str.isEmpty())
            str="nothing is selected.";
        
        l.setText(str);
    }

}

public class checkButtons {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();

        f.setSize(400,400);
        f.setVisible(true);
    }
}
