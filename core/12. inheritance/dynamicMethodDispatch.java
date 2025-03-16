class Super {
    void meth1() {
        System.out.println("Super class meth1");
    }
    void meth2() {
        System.out.println("Super class meth2");
    }
}

class Sub extends Super {
    void meth2() {
        System.out.println("Sub class meth2");
    }
    void meth3() {
        System.out.println("Sub class meth3");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Super sub = new Sub();
        sub.meth1();
        sub.meth2();
        // sub.meth3(); // This will give an error as meth3 is not present in Super class and reference is of the super class
    
        // output
        // Super class meth1
        // Sub class meth2
    }
}
