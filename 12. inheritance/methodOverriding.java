class Super {
    public void display() {
        System.out.println("Super class");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub class");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        // carefully note that in this case Super is the reference and Sub is the object
        // so the method in the Sub class will be called
        Super su = new Sub();
        su.display();
    }
}