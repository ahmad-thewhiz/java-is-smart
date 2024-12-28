class Outer {
    static int x=10;
    int y=20;

    static class Inner {
        void display() {
            System.out.println(x);
            // System.out.println(y); - this will not work because a static inner class cannot access a non-static variable from the outer class
        }
    }
}

public class staticInner {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner(); // new is used only once because an object for outer class was also being created
        obj.display();
    }
}
