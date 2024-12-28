abstract class Super {
    Super() {
        System.out.println("Super class constructor");
    }

    public static void method1() {
        System.out.println("Super class method1");
    }

    abstract void method2();
}


class Sub extends Super {
    @Override
    public void method2() {
        System.out.println("Sub class method2");
    }
}


public class absClass {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.method1();
        obj.method2();
    }
}
