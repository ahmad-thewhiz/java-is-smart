// Superclass
class Vehicle {
    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass
class Car extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }

    public void showDetails() {
        super.displayType(); // Call the superclass method
        System.out.println("Cars are a type of vehicle.");
    }
}

// Main class
public class inheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showDetails();
    }
}
