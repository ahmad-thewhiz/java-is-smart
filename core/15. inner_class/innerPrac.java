class Outer {
    int x=10;

    class Inner {
        int y=20;
        void innerDisplay() {
            System.out.println("x: "+x);
            System.out.println("y: "+y);
        }
    }

    void outerDisplay() {
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println("y: "+i.y);
    }
}


public class innerPrac {
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.outerDisplay();

        Outer.Inner i=new Outer().new Inner();
        System.out.println("The value of y from inner class is: "+i.y);
    }    
}
