### Types of Classes
- **Concrete Class**: A class that has implementation for all of its methods.
- **Abstract Class**: 
    - A class that has at least one abstract method. 
    - It starts with abstract keyword.
    - Object of abstract class cannot be created.
    - Reference of abstract class is allowed.

Note: After inheriting a abstract class, we must implement all the abstract methods of the abstract class in the subclass to make it a concrete class.

### Abstract Method
- A method that is declared but not implemented.
- It starts with abstract keyword.
- Abstract method can only be declared in abstract class.
- Abstract method must be implemented in the subclass.
Example: abstract void method2();

### Example of Abstract Class
```java
abstract class Hospital {
    abstract void emergency();
    abstract void treatment();
    abstract void billing();
    abstract void admit();
}

class Apollo extends Hospital {
    void emergency() {
        System.out.println("Apollo: Emergency");
    }
    void treatment() {
        System.out.println("Apollo: Treatment");
    }
    void billing() {
        System.out.println("Apollo: Billing");
    }
    void admit() {
        System.out.println("Apollo: Admit");
    }
}
```
this shows that abstract class is a blueprint for the granting authority to ensure that each hospital being made must have these methods to gain the license.


### Important Points
- Abstract classes cannot be final. final means no one can inherit the class.
- they cannot have static methods.