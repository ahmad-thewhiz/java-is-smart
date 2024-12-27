

class Circle {
    public double radius;
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class Circle1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println("Area of circle: " + c1.area());
        System.out.println("Circumference of circle: " + c1.circumference());
    
        Circle c2 = new Circle();
        c2.radius = 14;
        System.out.println("Area of circle: " + c2.area());
        System.out.println("Circumference of circle: " + c2.circumference());
    }
}
