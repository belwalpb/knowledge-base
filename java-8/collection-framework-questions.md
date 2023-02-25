## Java Collection Framework Questions


**1. What is the difference between ArrayList and LinkedList in Java?**

ArrayList is implemented as a resizable array, while LinkedList is implemented as a doubly-linked list. ArrayList is generally faster for read operations and uses less memory, while LinkedList is faster for insertions and deletions.

**2. What is the difference between HashSet and TreeSet in Java?**

HashSet is implemented using a hash table and offers constant-time performance for add, remove, and contains operations. TreeSet is implemented using a tree structure and offers logarithmic time performance for the same operations, but also provides an ordering of elements.


**3. What is the difference between the Iterator and ListIterator interfaces in Java?**

Both Iterator and ListIterator are used for traversing a collection of elements. The main difference is that ListIterator is an extension of Iterator and provides additional methods for bidirectional traversal and element modification.

**4. How does the HashMap class in Java handle collisions?**

The HashMap class in Java uses a technique called open addressing, also known as closed hashing, to handle collisions. When a collision occurs, the HashMap will try to find the next open slot in the hash table to store the new key-value pair.

**5. How do you sort a collection of objects in Java?**

You can sort a collection of objects in Java by using the Collections.sort() method and providing it with a comparator. The comparator can be used to define the sorting order by implementing the compare() method. Additionally, you can use the java.util.Arrays.sort() method to sort an array of objects, and you can use the java.util.List.sort() method to sort a List of objects.


**6. What is the difference between HashMap and Hashtable in Java?**

HashMap and Hashtable are both classes used for storing key-value pairs, but there are a few key differences between them. HashMap is not synchronized and allows null keys and values, while Hashtable is synchronized and does not allow null keys or values. Additionally, HashMap is generally considered faster than Hashtable.

**7. What is the difference between Queue and Stack in Java?**

Queue and Stack are both classes used for storing and manipulating a collection of elements. The main difference is that a Queue follows the First-In-First-Out (FIFO) principle, while a Stack follows the Last-In-First-Out (LIFO) principle.

**8. What is the difference between Vector and ArrayList in Java?**

Vector and ArrayList are both classes used for storing a collection of elements, but there are a few key differences between them. Vector is synchronized, while ArrayList is not. Additionally, Vector has some additional methods that ArrayList does not have.

**9. How do you synchronize access to a collection in Java?**
You can synchronize access to a collection in Java by using the Collections.synchronizedXXX() methods to wrap the collection, or by using a synchronized block.

**10.What is the use of Iterator in Java?**

Iterator is an interface that is used to iterate over a collection of elements in Java. It is designed to allow the programmer to traverse the elements of a collection in a consistent way, regardless of the underlying data structure. By using an iterator, we can traverse the elements of a collection and perform operations on them.


**11. What is the difference between fail-fast and fail-safe Iterator in Java?**

The fail-fast iterator throws a ConcurrentModificationException if the collection is modified while the iterator is traversing it. This is the default behavior of iterators in the Java collection framework, such as those returned by the iterator() method of the ArrayList and HashMap classes.
Fail-safe iterator, on the other hand, works on a copy of the collection and doesn't throw any exception if the collection is modified while the iterator is traversing it.

**12. How HashMap internally works in Java?**

A HashMap in Java is implemented as an array of buckets. Each bucket is a linked list of Map.Entry objects. The key is used to calculate the index of the bucket in the array, and the value is stored in the linked list. When a key-value pair is added to the HashMap, the key is hashed to determine its index in the array. If there is already a key-value pair with the same hash code, the new key-value pair is added to the linked list.

**13. How do you remove duplicates from a List in Java?**

There are several ways to remove duplicates from a List in Java. One way is to convert the list to a set, as a Set only stores unique elements. Another way is to use a loop and an if statement to check if the element already exists in a new list, if not add to the new list.

**14. How do you find the intersection of two lists in Java?**
You can find the intersection of two lists in Java by using the retainAll() method of the List interface, which removes all the elements from the list that are not present in the specified collection. By calling this method on one of the lists with the other list as the argument, you will be left with the elements that are present in both lists.

**15. How do you sort a Map by its values in Java?**

You can sort a Map by its values in Java by first creating a TreeMap and then providing it with a custom comparator that compares the values of the map entries. You can also use the Stream API and the Collectors.toMap() method to sort the map entries by value.

**16. How do you implement a custom comparator in Java?**

You can implement a custom comparator in Java by creating a class that implements the Comparator interface and override the compare() method. This method takes two objects of the class you want to compare as arguments and returns an int value representing the result of the comparison. For example, if the first object is greater than the second, the method should return a positive value, and if the first object is less than the second, it should return a negative value.

**17. How do you reverse a List in Java?**

You can reverse a List in Java by using the reverse() method of the Collections class or by using a loop and the set() method of the List interface to swap the elements. Additionally, you can use the ListIterator to traverse the list in reverse order.

**18. What is the difference between ArrayList and Vector in terms of performance?**

Both ArrayList and Vector are implemented as dynamic arrays, so they have similar performance characteristics. However, Vector is synchronized, so it may have slightly worse performance than ArrayList in multi-threaded environments. Additionally, Vector has some additional methods that ArrayList does not have, which may also affect performance.

**19. What are the different types of data structures supported by Java Collection Framework?**

Java Collection Framework supports following types of data structures:

List : It is an ordered collection of elements that allows duplicate elements. Examples are ArrayList, LinkedList, Vector.
Set : It is an unordered collection of unique elements. Examples are HashSet, TreeSet.
Map : It is an object that maps keys to values. Examples are HashMap, TreeMap.
Queue : It is a collection that is used to hold multiple elements prior to processing. Examples are PriorityQueue, LinkedList, ArrayDeque
Deque : It is a double ended queue, which means it can be used as both a stack and a queue. Examples are ArrayDeque, LinkedList.