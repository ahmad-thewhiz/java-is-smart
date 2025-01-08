### Types of error:
1. Syntax error - error in the syntax of the code
2. Runtime error - error that occurs during the execution of the code. example: division by zero
3. Logical error - error in the logic of the code. example: wrong formula


### examples of exception:
1. ArithmeticError - error in arithmetic operation. example: division by zero
2. AssertionError - error in assert statement. example: assert False
3. AttributeError - error in attribute reference or assignment. example: object has no attribute
4. EOFError - error when input() function hits end-of-file condition
5. FloatingPointError - error when floating point calculation fails
6. GeneratorExit - error when generator is closed
7. ImportError - error when import statement fails
8. IndexError - error when index is out of range
9. KeyError - error when key is not found in dictionary
10. KeyboardInterrupt - error when user hits interrupt key
11. MemoryError - error when operation runs out of memory
12. NameError - error when variable is not found in local or global scope
13. NotImplementedError - error when abstract method is not implemented
14. OSError - error when system operation fails
15. OverflowError - error when result of arithmetic operation is too large to be represented
16. RecursionError - error when maximum recursion depth is exceeded
17. ReferenceError - error when weak reference proxy is used to access a garbage collected referent
18. RuntimeError - error when generated error does not fall into any category
19. StopIteration - error when next() method of an iterator does not point to any object
20. SyntaxError - error when syntax of code is incorrect
21. ArrayIndexOutOfBoundsException - error when array index is out of range


Object -> Throwable -> (Error, Exception)
Exception (checked): 
1. ClassNotFoundException
2. IOException
3. InterruptedException
4. NumberFormatException
5. RuntimeException (unchecked)
    a. ArithmeticException
    b. IndexOutOfBoundsException
    c. NullPointerException

### Types of exception:
1. checked exception - exception that is checked at compile time. example: IOException

2. unchecked exception - exception that is not checked at compile time. example: ArithmeticException

Note: since Exception class is the parent class of ArithmeticException, we should write ArithmeticException before Exception in the catch block. If we write Exception before ArithmeticException, then ArithmeticException will never be executed because Exception will catch all the exceptions.


e.printStackTrace() - prints the exception information in the console. it is used to trace the exception.
e.getMessage() - returns the exception message. it is used to get the exception message.
e.toString() - returns the exception name and message. it is used to get the exception name and message.


class MinBalanceException extends Exception {
    public String toString() {
        return "Minimum balance should be 5000.";
    }
}


### Throw vs Throws:
1. throw - used to throw an exception explicitly. it is used to throw a user-defined exception. example: throw new MinBalanceException();
2. throws - used to declare an exception. written for checked exceptions. example: IOException

int area(int l, int b) throws ArithmeticException {
    if (l < 0 || b < 0) {
        throw new ArithmeticException("length and breadth should be greater than zero");
    }
    return l * b;
}

int calculateArea() {
    try {
        return area(-10, 5);
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }
    return 0;
}

Note: 
- if finally is written after catch block, then finally block will be executed after catch block. 
- if finally is written without catch block, then finally block will be executed first incase of exception in try block.
- if finally is written after return statement, then finally block will be executed before the return statement.


## Resources:
1. stack is an internal resource
2. heap is an external resource and that is why we have pointers to access the heap memory

### Try with resources:
1. try with resources is used to automatically close the resources.

try (FileReader fr = new FileReader("file.txt")) {
    // code
} catch (IOException e) {
    // code
}