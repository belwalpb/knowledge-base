A Java Iterator is a Cursor, which is used to iterate or traverse or retrieve a Collection or Stream object’s elements one by one. 

Iterator interface defines three methods as listed below:
1. hasNext(): Returns true if the iteration has more elements.
2. next(): Returns the next element in the iteration. It throws NoSuchElementException if no more element is present.
3. remove(): Removes the next element in the iteration. This method can be called only once per call to next().



**Collection:** A group of individual objects which can be represented as a single unit is known as the collection.

Advantages:
1. It includes various useful data structures, such as lists, sets, maps, queues, and stacks, that can be used to store and manage data efficiently.
2. It provides many utility methods for performing common operations on collections, such as sorting, searching, and filtering.
3. It supports generics, which allows you to specify the type of objects that a collection can hold, making your code more type-safe and easier to read.

#### Interfaces that extend the Collections Interface

1. **Iterable Interface:** This is the root interface for the entire collection framework. The collection interface extends the iterable interface. Therefore, inherently, all the interfaces and classes implement this interface. The main functionality of this interface is to provide an iterator for the collections.