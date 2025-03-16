// Superclass
class Animal {
    String name;

    // Constructor of the superclass
    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("This is an animal named: " + name);
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    // Constructor of the subclass
    public Dog(String name, String breed) {
        super(name); // Call the superclass constructor
        this.breed = breed;
    }

    public void displayDetails() {
        super.display(); // Call the superclass method
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class inheritance1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayDetails();
    }
}
