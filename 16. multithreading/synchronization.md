# Synchronization
Understanding or coordination between two or more threads is called synchronization.

### Resource Sharing
When multiple threads try to access the same resource, there is a chance of data inconsistency. To avoid this, we use synchronization. 
- Threads have their separate stack but heap is common.

### Critical Selection
The piece of code which is accessing the shared resource is called a critical section. 
- To allow only one thread to execute the critical section at a time, we use synchronization.
Example: two computers are accessing the same printer at the same time then the printed data will be mixed.

### Mutual Exclusion
When one thread is executing the critical section, then all other threads should wait until the current thread finishes its execution. This is called mutual exclusion.

### Locking / Mutex
Locking is the process of acquiring the lock. If the lock is not available, the thread will wait until the lock is available.

### Semaphore
Semaphore is a variable which is used to control the access of critical section. It is an integer variable which can be accessed by two standard atomic operations, wait and signal.

### Monitor
Monitor is a synchronization construct that allows threads to have both mutual exclusion and the ability to wait (block) for a certain condition to become true.

### Deadlock
Deadlock is a situation where two or more threads are waiting for each other to release the lock.

### Race Condition
A race condition occurs when two or more threads try to access and modify the same shared resource simultaneously, and the final outcome of the execution depends on the unpredictable timing or sequence of thread scheduling. This can lead to inconsistent or incorrect results.

### Inter-thread Communication
Inter-thread communication is the mechanism by which threads share information or signals with one another, enabling coordination and cooperation. This is especially useful for scenarios where one thread needs to wait for another thread's result or signal before proceeding.