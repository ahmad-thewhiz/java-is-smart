Types:
1. No Parameters - `class Box { ... }`
2. Multiple Parameters - `class Pair<T, U> { ... }`
3. Subtypes - `class Box<T extends Number> { ... }`
4. Bounded Types - `class Box<T extends Number & Comparable> { ... }` 

1. Generic Methods
2. Wild Card
3. Lower Bound - use  super
4. Upper Bound - use extends


### Do's and Don'ts
1. only extends is allowed in generic class definition
2. extends is used for interfaces also
3. extends from only one class and multiple interfaces
4. extends and super are allowed with ? in methods
5. <?> will accept all types but cannot access
6. Base type of an Object should be same or ?