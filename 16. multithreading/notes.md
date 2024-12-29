### Multiprogamming
- Multiprogramming is the technique of running multiple programs simultaneously on a computer. It allows a computer to do several things at the same time.
- Multiprogramming increases CPU utilization by organizing jobs so that the CPU always has one to execute.
- The idea is to divide the CPU time among multiple jobs so that the CPU always has one to execute.

### Multitasking
- Multitasking is the concurrent execution of multiple tasks (also known as processes) over a certain period of time.
- Multitasking can be achieved in two ways: process-based and thread-based.

### Process-based Multitasking
- In process-based multitasking, the operating system divides the CPU time among multiple processes.
- Each process has its own memory space, so the processes do not interfere with each other.
- Process-based multitasking is also known as time-sharing because the CPU time is shared among multiple processes.

### Thread-based Multitasking
- In thread-based multitasking, the operating system divides the CPU time among multiple threads.
- Threads share the same memory space, so they can communicate with each other more easily than processes.
- Thread-based multitasking is also known as multithreading.

### Multithreading
- Multithreading is a technique that allows a single process to execute multiple tasks concurrently.
- Each task is called a thread.
- Multithreading is used to create applications that can perform multiple tasks simultaneously.
- Multithreading is more efficient than creating multiple processes because threads share the same memory space.

### State of a Thread
- A thread can be in one of the following states:
  - New: The thread has been created but has not started yet.
  - Runnable: The thread is ready to run but is waiting for the CPU.
  - Running: The thread is currently running.
  - Blocked: The thread is waiting for a resource to become available.
  - Terminated: The thread has finished executing.
- Flow: New -> Runnable -> Running -> Blocked -> Runnable -> Terminated

### Thread Priority
- Each thread has a priority that determines how much CPU time it gets.
- The priority of a thread is an integer value between 1 and 10.
- The default priority of a thread is 5.
- A thread with a higher priority gets more CPU time than a thread with a lower priority.
Example: A thread that is responsible for updating the user interface should have a higher priority than a thread that is responsible for background tasks.

### Thread Class
- The `Thread` class is a class in the `java.lang` package that represents a thread.
- To create a new thread, you can extend the `Thread` class and override the `run` method.
- The `run` method contains the code that the thread will execute.
- To start a thread, you can call the `start` method.

Constructors
- `Thread()`: Creates a new thread.
- `Thread(Runnable target)`: Creates a new thread with the specified target.
- `Thread(Runnable target, String name)`: Creates a new thread with the specified target
- `Thread(ThreadGroup group, Runnable target)`: Creates a new thread with the specified target and thread group.
- `Thread(string name)`: Creates a new thread with the specified name.

Methods
- long getId(): Returns the ID of the thread.
- String getName(): Returns the name of the thread.
- int getPriority(): Returns the priority of the thread.
- Thread.State getState(): Returns the state of the thread.
- ThreadGroup getThreadGroup(): Returns the thread group to which the thread belongs.

- void setName(String name): Sets the name of the thread.
- void setPriority(int priority): Sets the priority of the thread.
- void setDaemon(boolean on): Marks the thread as a daemon thread.
A daemon thread is a background thread that runs in a program to support user threads and perform tasks like garbage collection

- boolean isAlive(): Returns true if the thread is alive.
- boolean isDaemon(): Returns true if the thread is a daemon thread.
- boolen isIntrrupted(): Returns true if the thread has been interrupted.

Instance Methods
- void start(): Starts the thread.
- void run(): Contains the code that the thread will execute.
- void join(): Waits for the thread to die.
- void join(long millis): Waits at most millis milliseconds for the thread to die.
- void interrupt(): Interrupts the thread.

Static Methods
- int activeCount(): Returns the number of active threads in the current thread's thread group.
- Thread currentThread(): Returns the current thread.
- void sleep(long millis): Causes the current thread to sleep for the specified number of milliseconds.
- void yield(): Causes the currently executing thread object to temporarily pause and allow other threads to execute.
- void dumpStack(): Prints a stack trace of the current thread to the standard error stream.
