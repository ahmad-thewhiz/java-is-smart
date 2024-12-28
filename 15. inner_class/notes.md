### Local Class
- A class declared within a method which is not accessible from outside the method is called local class.

### Anonymous Class
- A abstract class which is overridden by a method in a class is called anonymous class.
```java
interface My {
    void display() {

    }
}

class Outer {
    public void method() {
        My m = new My() {
            public void display() {
                System.out.println("Anonymous class");
            }
        };
        m.display();
    }
}
```

### Static Inner Classes
- A class declared within a class with static modifier is called static inner class.
- An object of static inner class can be created without creating an object of outer class.
- Static inner class can access only static members of outer class.

### Key Differences Between Abstract Classes and Interfaces in Java

1. **Inheritance**:
   - **Abstract Classes**: A class can extend only one abstract class (single inheritance).
   - **Interfaces**: A class can implement multiple interfaces (multiple inheritance).

2. **Method Implementation**:
   - **Abstract Classes**: Can have both abstract (unimplemented) and concrete (implemented) methods.
   - **Interfaces**: Prior to Java 8, all methods were abstract. From Java 8 onwards, interfaces can have default and static methods, but they primarily define behavior contracts.

3. **Usage**:
   - **Abstract Classes**: Used when classes share common state or behavior (fields and methods) and a "is-a" relationship exists.
   - **Interfaces**: Used to define a contract for classes to implement without sharing a common state.

---

### Real-Life Scenario
**Abstract Class Example**:
In a vehicle hierarchy, an abstract class `Vehicle` could define shared properties like `engineType` and common methods like `start()` and `stop()`. Specific types of vehicles like `Car` and `Bike` inherit from `Vehicle`.

**Interface Example**:
An interface `ElectricPowered` might define behavior like `chargeBattery()` or `batteryStatus()`. Both `ElectricCar` and `ElectricBike` can implement this interface alongside inheriting from `Vehicle`, as it specifies behavior rather than shared structure.