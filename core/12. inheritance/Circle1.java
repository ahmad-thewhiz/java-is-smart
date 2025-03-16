class Circle {
    public double radius;

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }    
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return getArea() * height;
    }
}

public class Circle1 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();

        c.radius=5;
        c.height=10;

        System.out.println("Volume of cylinder is: "+c.volume());
        System.out.println("Area of circle is: "+c.getArea());
    }
}
