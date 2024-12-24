# Object-Oriented Programming (OOP) Comprehensive Guide

## Table of Contents
1. [Introduction](#introduction)
2. [Classes and Objects](#classes-and-objects)
3. [Constructors](#constructors)
4. [Inheritance](#inheritance)
5. [Polymorphism](#polymorphism)
6. [Abstraction](#abstraction)
7. [Encapsulation](#encapsulation)
8. [Interfaces](#interfaces)
9. [Abstract Classes](#abstract-classes)

---

## Introduction

**Object-Oriented Programming (OOP)** is a programming paradigm centered around the concept of "objects." These objects are instances of **classes** and encapsulate both **data** (attributes or properties) and **behavior** (methods or functions). OOP promotes concepts such as **modularity**, **reusability**, and **scalability**, making it easier to manage complex software systems.

**Key Principles of OOP:**
- **Encapsulation:** Bundling data and methods that operate on the data within one unit, e.g., a class.
- **Abstraction:** Hiding complex implementation details and exposing only the necessary parts.
- **Inheritance:** Creating new classes from existing ones, inheriting attributes and behaviors.
- **Polymorphism:** Allowing objects to be treated as instances of their parent class rather than their actual class.

---

## Classes and Objects

### **Classes**

A **class** serves as a blueprint for creating objects. It defines a set of attributes and methods that the created objects (instances) will have.

**Terminologies:**
- **Attribute (Property):** A variable that holds data specific to the class or object.
- **Method (Function):** A block of code that performs a specific task, defined within a class.

### **Objects**

An **object** is an instance of a class. It represents a specific entity with its own set of attributes and can perform actions defined by its methods.

### **Example: `Laptop` Class**

```java
class Laptop {
    // Attributes (Properties)
    private String brand;
    private String model;
    private int ramSize; // in GB

    // Constructor
    public Laptop(String brand, String model, int ramSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
    }

    // Method
    public void displaySpecifications() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", RAM: " + ramSize + "GB");
    }

    // Main method to create and use Laptop objects
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "XPS 15", 16);
        Laptop workLaptop = new Laptop("Apple", "MacBook Pro", 32);

        myLaptop.displaySpecifications();
        workLaptop.displaySpecifications();
    }
}
```

**Output:**
```
Brand: Dell, Model: XPS 15, RAM: 16GB
Brand: Apple, Model: MacBook Pro, RAM: 32GB
```

---

## Constructors

A **constructor** is a special method used to initialize new objects. It has the same name as the class and does not return any type, not even `void`. Constructors can be **parameterized** (accepting arguments) or **default** (no parameters).

### **Types of Constructors:**

1. **Default Constructor:** Automatically provided by Java if no constructors are explicitly defined.
2. **Parameterized Constructor:** Allows setting initial values for object attributes.

### **Example: `Book` Class with Constructors**

```java
class Book {
    private String title;
    private String author;
    private double price;

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    // Main method
    public static void main(String[] args) {
        Book specificBook = new Book("1984", "George Orwell", 15.99);
        Book defaultBook = new Book();

        specificBook.displayInfo();
        defaultBook.displayInfo();
    }
}
```

**Output:**
```
Title: 1984, Author: George Orwell, Price: $15.99
Title: Unknown, Author: Unknown, Price: $0.0
```

---

## Inheritance

**Inheritance** allows a new class to acquire properties and behaviors (methods) from an existing class. The existing class is called the **superclass** (or **base class**), and the new class is known as the **subclass** (or **derived class**).

### **Benefits of Inheritance:**
- **Reusability:** Reuse existing code without rewriting it.
- **Hierarchical Classification:** Organize classes in a hierarchical manner.
- **Method Overriding:** Subclasses can modify or extend behaviors of the superclass.

### **Terminologies:**
- **`extends` Keyword:** Used in Java to indicate that a class inherits from another class.
- **`super` Keyword:** Refers to the superclass and can be used to access its methods and constructors.

### **Example: `Vehicle` and `Car` Classes**

```java
// Superclass
class Vehicle {
    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Vehicle horn: Beep Beep!");
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass
class Car extends Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    // Overriding the displayBrand method
    @Override
    public void displayBrand() {
        super.displayBrand(); // Calling superclass method
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Sedan");
        myCar.honk();
        myCar.displayBrand();
    }
}
```

**Output:**
```
Vehicle horn: Beep Beep!
Brand: Generic Vehicle
Model: Sedan
```

---

## Polymorphism

**Polymorphism** allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different underlying forms (data types).

### **Types of Polymorphism:**
1. **Compile-Time Polymorphism (Method Overloading):** Multiple methods with the same name but different parameters within the same class.
2. **Runtime Polymorphism (Method Overriding):** Subclass provides a specific implementation of a method already defined in its superclass.

### **Advantages of Polymorphism:**
- **Flexibility:** Code can work with objects of different types.
- **Maintainability:** Easier to add new classes without changing existing code.

### **Example: `Employee` Hierarchy**

```java
// Superclass
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }
}

// Subclass 1
class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing code.");
    }
}

// Subclass 2
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }
}

// Main class to demonstrate polymorphism
class Main {
    public static void main(String[] args) {
        Employee emp1 = new Developer();
        Employee emp2 = new Manager();

        emp1.work(); // Outputs: Developer is writing code.
        emp2.work(); // Outputs: Manager is managing the team.
    }
}
```

**Output:**
```
Developer is writing code.
Manager is managing the team.
```

---

## Abstraction

**Abstraction** is the concept of hiding complex implementation details and exposing only the necessary parts of an object. It allows developers to focus on **what** an object does instead of **how** it does it.

### **Achieving Abstraction:**
- **Abstract Classes:** Classes that cannot be instantiated and may contain abstract methods (methods without implementation).
- **Interfaces:** Completely abstract classes that define methods without any implementation.

### **Example: `Appliance` Abstract Class**

```java
// Abstract class
abstract class Appliance {
    // Abstract method (does not have a body)
    public abstract void operate();

    // Regular method
    public void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}

// Subclass
class WashingMachine extends Appliance {
    @Override
    public void operate() {
        System.out.println("Washing Machine is running a wash cycle.");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.plugIn();
        wm.operate();
    }
}
```

**Output:**
```
Appliance is plugged in.
Washing Machine is running a wash cycle.
```

---

## Encapsulation

**Encapsulation** is the practice of restricting direct access to some of an object's components, which means that the internal representation of an object is hidden from the outside. Access to the data is provided through **public methods**, often referred to as **getters** and **setters**.

### **Benefits of Encapsulation:**
- **Data Protection:** Prevents unauthorized or accidental modification of data.
- **Improved Maintainability:** Changes to the internal implementation do not affect external code.
- **Enhanced Flexibility:** Control over how data is accessed or modified.

### **Example: `BankAccount` Class**

```java
class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 500.0);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        myAccount.deposit(150.0);
        myAccount.withdraw(100.0);
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
```

**Output:**
```
Account Number: 123456789
Initial Balance: $500.0
Deposited: $150.0
Withdrew: $100.0
Final Balance: $550.0
```

---

## Interfaces

An **interface** in Java is a reference type that can contain only **abstract methods** (until Java 8, which allows default and static methods) and **constants**. Interfaces provide a way to achieve **multiple inheritance** and define a contract that implementing classes must follow.

### **Key Characteristics:**
- **Abstract Methods:** Methods without a body that must be implemented by the implementing class.
- **Implementation:** A class uses the `implements` keyword to implement an interface.
- **Multiple Interfaces:** A class can implement multiple interfaces, overcoming the single inheritance limitation.

### **Example: `Rechargeable` Interface**

```java
// Interface
interface Rechargeable {
    void recharge();
}

// Another Interface
interface Portable {
    void carry();
}

// Implementing both interfaces
class Smartphone implements Rechargeable, Portable {
    @Override
    public void recharge() {
        System.out.println("Smartphone is recharging.");
    }

    @Override
    public void carry() {
        System.out.println("Smartphone is being carried in a pocket.");
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.recharge();
        phone.carry();
    }
}
```

**Output:**
```
Smartphone is recharging.
Smartphone is being carried in a pocket.
```

---

## Abstract Classes

An **abstract class** is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain both **abstract methods** (without implementation) and **concrete methods** (with implementation). Abstract classes are used to represent generic concepts and enforce a contract for subclasses.

### **Differences Between Abstract Classes and Interfaces:**
- **Abstract Classes:**
  - Can have both abstract and concrete methods.
  - Can have member variables.
  - Support constructors.
  - Allow defining access modifiers for methods.
- **Interfaces:**
  - Can only have abstract methods (until Java 8).
  - Cannot have member variables (except constants).
  - Do not support constructors.
  - All methods are implicitly `public`.

### **Example: `Employee` Abstract Class**

```java
// Abstract class
abstract class Employee {
    protected String name;
    protected int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }
}

// Subclass 1
class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, int employeeId, double annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary / 12; // Monthly salary
    }
}

// Subclass 2
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Employee ftEmployee = new FullTimeEmployee("Alice", 101, 72000);
        Employee ptEmployee = new PartTimeEmployee("Bob", 102, 30, 120);

        ftEmployee.displayInfo();
        System.out.println("Monthly Salary: $" + ftEmployee.calculateSalary());

        ptEmployee.displayInfo();
        System.out.println("Monthly Salary: $" + ptEmployee.calculateSalary());
    }
}
```

**Output:**
```
Name: Alice, Employee ID: 101
Monthly Salary: $6000.0
Name: Bob, Employee ID: 102
Monthly Salary: $3600.0
```

---

# Summary

This guide provided an in-depth exploration of Object-Oriented Programming (OOP) concepts using Java examples. Here's a quick recap of the key topics covered:

- **Classes and Objects:** Understanding the blueprint (class) and instances (objects) in OOP.
- **Constructors:** Initializing objects with default or specific values.
- **Inheritance:** Creating hierarchical relationships between classes to promote code reuse.
- **Polymorphism:** Enabling objects to be treated as instances of their superclass, allowing for flexible and dynamic method invocation.
- **Abstraction:** Simplifying complex systems by exposing only essential components.
- **Encapsulation:** Protecting data by restricting direct access and providing controlled interfaces.
- **Interfaces:** Defining contracts that classes must adhere to, facilitating multiple inheritances.
- **Abstract Classes:** Combining abstract methods and concrete methods to create partially implemented classes for inheritance.

Mastering these OOP principles is fundamental to building robust, maintainable, and scalable software applications.