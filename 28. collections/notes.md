### collections examples
1. Integers
2. Floards
3. Students


* ArrayList - List of elements with variable size
* linkedList - List of elements with variable size
* Set - List of unique elements
* Sorted Set - List of unique elements in sorted order
* Map - Key value pair
* Sorted Map - Key value pair in sorted order
* Queue - First in first out
* Stack - Last in first out
* Deque - Double ended queue
* Priority Queue - Queue with priority
* Blocking Queue - Queue with blocking
* Concurrent Queue - Queue with concurrency

() - Interface
[] - Class

(Maps):
1. (SortedMap) <- [TreeMap]
2. [HashMap], [LinkedHashMap], [HashTable]

(List) (ordered list of elements):
1. [ArrayList]
2. [LinkedList]
3. [Vector] <- [Stack]

(Queue):
1. [PriorityQueue]
2. (Dequeue) <- [Array Dequeue]

(Set) (unordered, cannot have duplicate elements):
1. (SortedSet) <- [TreeSet]
2. [HashSet], [LinkedHashSet]


### java.util
interfaces:
1. collection
2. list
3. set
4. queue

### interface Collection
1. add(E e)
2. addAll(Collection<E> c)
3. remove(Object o)
4. removeAll(Collection<E> c)
5. retainAll(Collection<E> c)
6. clear()
7. isEmpty()
8. contains(Object o)
9. containsAll(Collection<E> c)
10. equals(Object o)
11. size()
12. iterator()
13. toArray()

### interface List
1. add(int index, E element)
2. addAll(int index, Collection<E> c)
3. remove(int index)
4. get(int index)
5. set(int index, E element)
6. subList(int fromIndex, int toIndex)
7. indexOf(Object o)
8. lastIndexOf(Object o)
9. listIterator()
10. listIterator(int index)

### interface Set extends Collection
same as Collection

### interface Queue extends Collection
1. add(E e)
2. poll() - remove and return head, null if empty
3. peek() - return head, returns null if empty
4. remove() - remove head, throws NoSuchElementException if empty
5. element() - return head, throws NoSuchElementException if empty

