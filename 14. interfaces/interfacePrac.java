interface Test {
    void meth1();
    void meth2();
}

class My implements Test {
    public void meth1() {
        System.err.println("Meth1 of My");
    }
    public void meth2() {
        System.err.println("Meth2 of My");
    }
    public void meth3() {
        System.err.println("Meth3 of My");
    }
}

public class interfacePrac {
    public static void main(String args[]) {
        Test obj=new My();
        obj.meth1();
        obj.meth2();

        My obj2=new My();
        obj2.meth1();
        obj2.meth2();
        obj2.meth3();

    }
}
