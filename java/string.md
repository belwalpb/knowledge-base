## Strings in Java

In Java, String is an immutable class, meaning that once a String object is created, its value cannot be changed.

```java
String s1 = "abc";
String s2 = new String("abc");
```

In the first statement, a string literal "abc" is created in the string pool (a special memory area in the JVM dedicated to storing string literals) and a reference to that string is assigned to the variable "s1".

In the second statement, a new String object is created with the value "abc" using the String class's constructor. This object is not stored in the string pool and a reference to this new object is assigned to the variable "s2".

In terms of memory and performance, using string literals is more efficient because it reuses the same object in the string pool if it already exists. Creating a new String object using the constructor creates a new object in the heap memory, which takes up more memory and may cause garbage collection to run more frequently.


StringBuffer is thread-safe, meaning that multiple threads can access a StringBuffer object without causing errors or unexpected behavior. StringBuilder is not thread-safe.

In terms of performance, StringBuilder is generally faster than StringBuffer because it is not thread-safe and does not have the overhead of synchronization. However, if multiple threads will be accessing the same object, it is safer to use StringBuffer.