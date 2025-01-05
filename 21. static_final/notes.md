- static variable belongs to a class and not to any object. It is shared among all the objects of the class. it can be accessed directly by the class name and doesn't need any object.
- static method belongs to the class and not to the object. It can be accessed directly by the class name and doesn't need any object.
- we cannot use this and super keyword in static context.
- non static variables cannot be accessed in static methods.
- inner classes can be static whereas outer classes cannot be static.

- final variable is a constant. Once assigned, its value cannot be changed.
- final method cannot be overridden.
- final class cannot be inherited.
- they can be assigned in three ways - at the time of declaration, in a constructor, in a block.
- there are three ways to initialize a final variable - at the time of declaration, in a constructor, in a block.

- singleton class
- singleton class is a class that can have only one object (an instance of the class) at a time.