class Parent {
    Parent() {
        System.out.println("Parent Non-Param Constructor");
    }
    Parent(int a) {
        System.out.println("Parent Param Constructor with value: " + a);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Non-Param Constructor");
    }
    Child(int x) {
        System.out.println("Child Param Constructor with value: " + x);
    }
    Child(int x, int y) {
        super(x);
        System.out.println("Child Param Constructor with value: " + y);
    }
}


public class SuperConst {
    public static void main(String[] args) {
        Child c = new Child();
        Child c1 = new Child(10);
        Child c2 = new Child(10, 20);
    }
}
