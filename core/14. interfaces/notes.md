## Interfaces
- An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

- Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.

- Java doesn't support multiple inheritance in case of class because it leads to ambiguity. However, it can be achieved by using interfaces. The reason is, a class can implement multiple interfaces.

- used to achieve polymorphism

- 'implements' keyword is used

- a class becomes abstract when it implements an interface and can be converted into a concrete class by implementing all the methods of the interface.

interfaces are mainly used for callback methods in java

- try keeping identifiers static and upper case in interfaces
- methods in interface cannot have a body except for static and default methods
- default method is used to update the interface without breaking the implementing classes
- abstracts cannot have private methods


it is fortunate that java doesn't have multiple inheritance like cpp because cpp makes a smartphone, a phone, a camera and a music player at the same time using multiple inheritance whereas java defines smartphone as a phone (single inheritance) which can act like a camera and a music player using interfaces
