#### List Interface in Java

The List interface in Java provides a way to store the ordered collection. It is a child interface of Collection. It is an ordered collection of objects in which duplicate values can be stored. Since List preserves the insertion order, it allows positional access and insertion of elements. 

**Implementation of List Interface in Java:**

**1. ArrayList:** It is the resizable-array implementation of the List interface. The `size`, `isEmpty`, `get`, `set`, `iterator`, and `listIterator` operations run in constant time.

The `add` operation runs in amortized constant time, that is, adding n elements requires `O(n)` time.

In Java, an ArrayList grows by allocating a new, larger array and copying the elements from the old array to the new one. The new array is typically larger than the old one to reduce the number of times this operation needs to be performed as elements are added to the list.

The specific growth strategy used by ArrayList is to increase the size of the array by a factor of 1.5. For example, if the current array has a length of 10, then a new array of length 15 will be created when more space is needed.

When you add an element to an ArrayList, the ArrayList will first check if there is any room left in the current array to store the new element. If there is, the element is added to the next available position in the array. If there is no room, a new array is created with the new size and all the elements of the current array are copied to it. Then the new element is added to the end of the new array.

In general, this approach of periodically increasing the size of the array to be slightly larger than the current number of elements in the list allows the ArrayList to keep the average cost of adding an element to O(1) amortized performance.

**2. LinkedList:** In Java, a LinkedList is implemented as a doubly-linked list. A doubly-linked list is a data structure in which each element, called a node, contains a reference to the previous and next elements in the list. The first and last elements in the list have special nodes, called sentinels, that do not contain actual data but are used to mark the beginning and end of the list.

LinkedList class provides methods to add, remove, and access elements, as well as various other utility methods such as methods to check if the list is empty, to find the index of a given element, and to sort the elements.

## When to use ArrayList and when to use LinkedList?

In Java, ArrayList and LinkedList are both classes that implement the List interface and provide the functionality of a dynamic array. However, they have different performance characteristics and are better suited to different use cases.

You should use an ArrayList when:

1. You need fast, constant-time access to elements by index, as the performance of getting and setting elements is O(1) operation
2. You don't need to add or remove elements from the middle of the list frequently, as doing so is an O(n) operation for ArrayList
3. You have a large number of elements, and the memory overhead of maintaining a linked list would be too high.
**Example:** you have a large collection of books and you want to store it in a List in java, you want to find a specific book by its index and you don't need to frequently add or remove books from it, so you can use ArrayList in this case.

You should use a LinkedList when:

1. You need to add or remove elements from the middle of the list frequently, as doing so is an O(1) operation for LinkedList
2. You don't need fast, constant-time access to elements by index, as the performance of getting and setting elements is O(n) operation.
**Example:** You have a list of tasks that need to be done, and you want to use a List in Java to represent the tasks, you need to frequently add or remove tasks from the list, and you don't need to access the tasks by index frequently. So you can use LinkedList in this case.

It's also worth noting that LinkedList has additional features of Deque and Queue, which can be used as a double ended queue, and FIFO data structure respectively.