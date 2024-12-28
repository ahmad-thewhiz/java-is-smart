class Outer {
    int x=10;
    Inner i=new Inner(); // instead of declaring in every function, you can directly declare in the outer class for all methods to have access

    class Inner {
        int y=20;
        public void innerDisplay() {
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay() {
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class nestedInner {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.innerDisplay();
    }
}
