# Type Conversion

## Implicit Type Conversion
- When the data type of the destination variable is larger than the source variable, then the implicit type conversion is done by the compiler.
- Example:
```java
int a = 10;
long b = a; // implicit type conversion
```

## Explicit Type Conversion
- When the data type of the destination variable is smaller than the source variable, then the explicit type conversion is done by the programmer.
- Example:
```java
long a = 10;
int b = (int) a; // explicit type conversion
```

# Type Casting
- Type casting is when you assign a value of one primitive data type to another type.
- In Java, there are two types of casting:
    - Widening Casting (automatically) - converting a smaller type to a larger type size
    - Narrowing Casting (manually) - converting a larger type to a smaller size type

## Widening Casting
- Widening casting is done automatically when passing a smaller size type to a larger size type.
byte -> short -> char -> int -> long -> float -> double

## Narrowing Casting
- Narrowing casting must be done manually by placing the type in parentheses in front of the value.
double -> float -> long -> int -> char -> short -> byte

# Identifiers
- Identifiers are the names given to the variables, methods, classes, etc.
- Rules for defining identifiers:
    - Names can contain letters, digits, underscores, and dollar signs
    - Names must begin with a letter
    - Names should start with a lowercase letter, and cannot contain whitespace
    - Names can also begin with $ and _
    - Names are case-sensitive ("myVar" and "myvar" are different variables)
    - Reserved words (like Java keywords, such as int or boolean) cannot be used as names

# Data Types
- Data types specify the different sizes and values that can be stored in the variable.
- There are two types of data types in Java:
    - Primitive data types
    - Non-primitive data types

## Primitive Data Types
- Primitive data types are the most basic data types available within the Java language.
Example: byte, short, int, long, float, double, char, boolean.

## Non-primitive Data Types
- Non-primitive data types are called reference types because they refer to objects.
- They start with a capital letter.
- They can be null.
Example: Strings, Arrays, Classes, Interface, etc.
