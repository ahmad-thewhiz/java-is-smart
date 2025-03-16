# Generalization and Specialization

- **Generalization** is the process of extracting shared characteristics from two or more classes, and combining them into a generalized superclass. Generalization is the process of forming a general class from a number of classes. Generalization is used to represent the "is a" relationship between two classes. Generalization is also known as Inheritance.
Bottom-Up.
Example- Car, Bike, Bus, Truck are all vehicles. So, Vehicle is a generalized class.
Achievend using Interfaces


- **Specialization** is the process of defining a new class from an existing class. Specialization is the process of forming a specialized class from a general class. Specialization is used to represent the "is a" relationship between two classes. Specialization is also known as Inheritance.
Top-Down.
Example- Car is a specialized class of Vehicle.
Achieved using Inheritance

## Method Overriding
- Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already provided by one of its superclasses. When a method in a subclass has the same name, same parameters or signature and same return type as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
- The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class


## Dynamic Method Dispatch
- Dynamic Method Dispatch is a mechanism by which a call to an overridden method is resolved at runtime, rather than compile-time. In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.
- It is used to achieve run time polymorphism.


## Allowed and Not Allowed Method Overriding Rules
- The method must have the same name as in the parent class
- The method must have the same parameter as in the parent class.
- same type of access modifiers

## PolyMorphism
- Polymorphism is the ability of a single function or method to operate on multiple data types.
- Polymorphism is a feature of OOP that allows objects to be treated as instances of their parent class.
- It is achieved using method overriding and method overloading.

- hasA relationship is achieved when an object of one class is declared in another class. It is also known as composition.
-  isA relationship is achieved using inheritance. It is also known as generalization or specialization.