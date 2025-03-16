### Difference between void and static
- void: is a return type, it means the method does not return a value.
- static: is a keyword that means the method belongs to the class and not any object of the class.
    * method: It is a function defined inside a class that performs an action.

### @ symbol
- The @ symbol is used for annotations in Java.

### Java Naming Conventions
- Class names should start with an uppercase letter. (CamelCase)
- Method names should start with a lowercase letter. (camelCase)
- Variable names should start with a lowercase letter. (camelCase)
- Constants should be in uppercase letters. (SNAKE_CASE)


### Features of Java
1. Secure - HVM has a securer / verifier
2. Platform Independent - Write once, run anywhere
3. Object-Oriented - Everything is an object
4. Supports Multithreading
5. Architecture Neutral - Independent of the hardware architectures like Van Neumann, ARM, etc.
6. Supports Distributed Computing - RMI, EJB, etc.

### Merging and Masking
- Merging: Combining two numbers by using the bitwise OR operator.
- Masking: Using a mask to select a specific set of bits from a number.
- Swapping: Exchange the values of two variables without using a third variable.XOR operator is used to swap two numbers. compute a=a^b, b=a^b, a=a^b 

### Widening and Narrowing
- Widening: Converting a smaller data type to a larger data type.
- Narrowing: Converting a larger data type to a smaller data type.

### Properties of Class
- Encapsulation: Wrapping up of data and methods into a single unit.
- Types of properties:
1. read & write: getter and setter methods
2. read only: getter method
3. write only: setter method

### Constructors
- A constructor is a special type of method that is used to initialize an object.
- It is called when an object is created.
- It has the same name as the class.
Types:
1. Default constructor: No-argument constructor
2. Parameterized constructor: Constructor with arguments

### Static
The static keyword in Java is a powerful modifier used for memory management and defining members that belong to the class rather than any specific instance of the class. Here's an explanation of its usage:

Static Variables
- Definition: A static variable is shared among all instances of the class. It is also called a class variable.
Usage: To define properties that should be the same for all objects.
- Behavior:
Memory for static variables is allocated only once when the class is loaded.
Shared across all instances of the class.
- Example:
```java
Copy code
class Example {
    static int counter = 0; // Shared among all instances
    Example() {
        counter++;
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        System.out.println(Example.counter); // Output: 2
    }
}
```

Java AWT
- AWT (Abstract Window Toolkit) is a package in Java that provides classes for creating GUI applications.
- It includes components like buttons, labels, text fields, etc., to build graphical user interfaces.
- AWT components are heavyweight, meaning they are rendered by the operating system's windowing system.

Url: [AWT Docs](https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/package-summary.html)

- instead of destructors, java has 'finalize' method which is called by the garbage collector before reclaiming the memory.

- hashcode is a unique identifier for an object. It is used in hashing-based collections like HashMap, HashSet, etc.

string vs string buffer vs string builder:
- string: immutable, thread-safe
- string buffer: mutable, thread-safe
- string builder: mutable, not thread-safe