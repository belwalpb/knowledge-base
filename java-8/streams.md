## Streams in Java

In Java, a stream is a sequence of elements that can be processed in parallel or sequentially. The java.util.stream package in Java 8 and later versions provides a functional approach to processing collections of data. Streams can be used to perform operations such as filtering, mapping, and reducing on data, and can be operated on using a variety of intermediate and terminal operations. They are useful for working with large data sets and can improve the performance of certain types of operations.

Java Stream API provides several intermediate and terminal operations that can be performed on a Stream. These operations are divided into two categories, intermediate operations, and terminal operations.

### Intermediate operations:

**1. filter():** The filter() operation in Java Stream API is used to filter elements from a stream based on a given predicate. The predicate is a function that takes an element and returns a Boolean value indicating whether the element should be included in the resulting stream or not.

The filter() operation returns a new stream containing only the elements that satisfy the given predicate. The original stream is not modified.

Here's an example of using the filter() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Stream<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0);
evenNumbers.forEach(System.out::println);
```

In this example, a stream of integers is created from a List of integers, and the filter() operation is used to filter out only the even numbers. The resulting stream of even numbers is then printed to the console using the forEach() terminal operation.

The filter() operation is an intermediate operation, which means that it can be chained with other intermediate or terminal operations. This allows for filtering and transforming the data in a single statement, making the code more readable.


**2. map():** The map() operation in Java Stream API is used to transform elements in a stream by applying a given function to each element. The function takes an element and returns a new element of a different type or the same type, depending on the requirements.

The map() operation returns a new stream containing the transformed elements. The original stream is not modified.

Here's an example of using the map() operation:

```java
List<String> words = Arrays.asList("hello", "world");
Stream<String> uppercaseWords = words.stream().map(String::toUpperCase);
uppercaseWords.forEach(System.out::println);
```

In this example, a stream of strings is created from a list of strings, and the map() operation is used to transform each word to uppercase. The resulting stream of uppercase words is then printed to the console using the forEach() terminal operation.

The map() operation is also an intermediate operation, which means that it can be combined with other intermediate or terminal operations to perform more complex data manipulation.

It's important to note that the map operation is not suitable when the function applied to the elements produces null or optional, in this cases flatMap or filter should be used instead.


**3. flatMap():** The flatMap() operation in Java Stream API is used to transform a stream of streams into a single stream. It applies a given function to each element in a stream and returns a stream of the results. The resulting stream is then "flattened" into a single stream.

Here's an example of using the flatMap() operation:

```java
List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
Stream<Integer> numbers = lists.stream().flatMap(list -> list.stream());
numbers.forEach(System.out::println);
```

In this example, a stream of lists of integers is created and the flatMap() operation is used to "flatten" the stream of lists into a stream of integers. The resulting stream of integers is then printed to the console using the forEach() terminal operation.

The flatMap() operation is particularly useful when working with nested data structures, as it allows you to access the elements of the nested data structure in a single stream.

It's also useful when the function applied to the elements returns a stream or an array, in that case, the flatMap operator is used to "flatten" the structure.

Like map and filter, the flatMap operation is an intermediate operation, which means that it can be combined with other intermediate or terminal operations to perform more complex data manipulation.


**4. distinct():** The distinct() operation in Java Stream API is used to remove duplicate elements from a stream. It returns a new stream containing only the distinct (unique) elements of the original stream. The original stream is not modified.

Here's an example of using the distinct() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5);
Stream<Integer> distinctNumbers = numbers.stream().distinct();
distinctNumbers.forEach(System.out::println);
```

In this example, a stream of integers is created from a list of integers and the distinct() operation is used to remove the duplicate elements. The resulting stream of distinct integers is then printed to the console using the forEach() terminal operation.

The distinct() operation is an intermediate operation, which means that it can be combined with other intermediate or terminal operations to perform more complex data manipulation.

Please note that distinct operation uses the equals method to determine the equality of elements, so if the class of the element does not override the equals method, the distinct function will not work as expected.

The distinct() operation uses the equals() method to determine the equality of elements, so it will only consider two elements to be equal if the equals() method returns true for those elements.

The distinct() operation also uses the hashCode() method to generate the hash values of the elements. If the class of the elements does not override the hashCode() method, then the distinct() operation will use the default implementation of the hashCode() method provided by the Object class, which may not produce unique hash values for distinct elements.

**5. sorted():** The sorted() operation in Java Stream API is used to sort the elements of a stream. It returns a new stream containing the elements of the original stream in a sorted order. The original stream is not modified.

By default, the sorted() operation sorts the elements in natural order, which means that it compares the elements using their compareTo() method if they are comparable. If the elements are not comparable, it will throw a ClassCastException.

Here's an example of using the sorted() operation:

```java
List<Integer> numbers = Arrays.asList(5, 2, 4, 1, 3);
Stream<Integer> sortedNumbers = numbers.stream().sorted();
sortedNumbers.forEach(System.out::println);
```

In this example, a stream of integers is created from a list of integers and the sorted() operation is used to sort the elements. The resulting stream of sorted integers is then printed to the console using the forEach() terminal operation.

You can also provide a custom comparator to the sorted() operation to sort the elements based on a specific criteria.

```java
List<String> words = Arrays.asList("hello", "world", "apple", "banana");
Stream<String> sortedWords = words.stream().sorted(Comparator.comparing(String::length));
sortedWords.forEach(System.out::println);
```

In this example, a stream of strings is created from a list of strings and the sorted() operation is used with a custom comparator that compares the length of the words. The resulting stream of sorted words is then printed to the console using the forEach() terminal operation.

The sorted() operation is an intermediate operation, which means that it can be combined with other intermediate or terminal operations to perform more complex data manipulation.

It's important to note that the sorted operation can be computationally expensive and require additional memory storage if the stream contains a large number of elements or the elements have a large size.


**6. peek():** The peek() operation in Java Stream API is used to perform a specific action on each element of a stream as they are consumed from the stream, without modifying the elements themselves.
It returns a new stream that is identical to the original stream, but with the added peek() operation.

Here's an example of using the peek() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = numbers.stream().peek(n -> System.out.println("Number: " + n));
stream.forEach(n -> {});
```

In this example, a stream of integers is created from a list of integers, and the peek() operation is used to print each element as it is consumed from the stream using the forEach() terminal operation.

The peek() operation is an intermediate operation, which means that it can be combined with other intermediate or terminal operations, to perform more complex data manipulation.

It's important to note that the peek operation is mostly used for debugging or for logging purposes. It does not change the data in the stream, it only allows to see the data as it flows through the pipeline. It's also important to note that the order of the peek operation in the pipeline matters, if it's placed after a filter operation, the peek will only show the data that passed through the filter.



**7. limit():** The limit() operation in Java Stream API is used to limit the number of elements in a stream. It returns a new stream that contains only the specified number of elements from the beginning of the original stream. The original stream is not modified.

Here's an example of using the limit() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Stream<Integer> firstThreeNumbers = numbers.stream().limit(3);
firstThreeNumbers.forEach(System.out::println);
```

In this example, a stream of integers is created from a list of integers, and the limit() operation is used to limit the stream to the first three elements. The resulting stream containing the first three elements is then printed to the console using the forEach() terminal operation.

The limit() operation is an intermediate operation, which means that it can be combined with other intermediate or terminal operations to perform more complex data manipulation.

It's important to note that the limit operation can improve the performance of the pipeline if the stream contains a large number of elements, by reducing the number of elements to process.


**8. skip():** The skip() operation in Java Stream API is used to skip a specified number of elements from the beginning of a stream. It returns a new stream that contains all elements of the original stream, except for the specified number of elements at the beginning. The original stream is not modified.

Here's an example of using the skip() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Stream<Integer> withoutFirstThreeNumbers = numbers.stream().skip(3);
withoutFirstThreeNumbers.forEach(System.out::println);
```

In this example, a stream of integers is created from a list of integers, and the skip() operation is used to skip the first three elements of the stream. The resulting stream containing the remaining elements is then printed to the console using the forEach() terminal operation.

The skip() operation is an intermediate operation, which means that it can be combined with other intermediate or terminal operations to perform more complex data manipulation.

It's important to note that the skip operation can improve the performance of the pipeline if the stream contains a large number of elements, by reducing the number of elements to process, but also, it could lead to a performance degradation if the number of elements to skip is high.


### Terminal operations:

**1. forEach():** The forEach() operation in Java Stream API is a terminal operation that is used to perform a specific action on each element of a stream. The forEach() operation takes a Consumer as a parameter, which is a functional interface that defines a single accept() method that takes an element and performs an action on it.

Here's an example of using the forEach() operation:


```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().forEach(n -> System.out.println(n));
```

In this example, a stream of integers is created from a list of integers, and the forEach() operation is used to print each element to the console.

You can also use the method reference instead of a lambda expression to make the code more readable:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().forEach(System.out::println);
```

The forEach() operation is a terminal operation, which means that it is the last operation in a stream pipeline, and it consumes the elements from the stream, which makes it impossible to access the same stream after the forEach() operation has been executed.

It's important to note that the forEach() operation is a sequential operation, it will not take advantage of the multithreading available in the system, for that reason, if you need to perform an operation that could be parallelized, you should use the forEachOrdered() operation, that preserves the order of the elements in the stream and allows to process the elements in parallel.


**2. forEachOrdered():** The forEachOrdered() operation in Java Stream API is similar to the forEach() operation, but it guarantees that the elements of the stream are processed in the order they were produced by the source of the stream, even if the stream is parallelized.

Here's an example of using the forEachOrdered() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream().forEachOrdered(n -> System.out.println(n));
```

In this example, a parallel stream of integers is created from a list of integers, and the forEachOrdered() operation is used to print each element to the console in the order they were produced by the source of the stream.

The forEachOrdered() operation is a terminal operation, which means that it is the last operation in a stream pipeline, and it consumes the elements from the stream, which makes it impossible to access the same stream after the forEachOrdered() operation has been executed.

It's important to note that the forEachOrdered() operation can be slower than the forEach() operation when the stream is parallelized, as it needs to ensure that the elements are processed in order and it's

**3. toArray():** The toArray() operation in Java Stream API is used to convert a stream into an array. It returns an array containing the elements of the stream.

Here's an example of using the toArray() operation:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Integer[] numberArray = numbers.stream().toArray(Integer[]::new);
```

In this example, a stream of integers is created from a list of integers, and the toArray() operation is used to convert the stream into an array of integers.

You can also pass a constructor reference to the toArray() method, which will be used to create the array. The constructor reference should be for an array of the same type as the elements in the stream.

The toArray() operation is a terminal operation, which means that it consumes the elements from the stream and makes it impossible to access the same stream after the toArray() operation has been executed.

It's important to note that the toArray() operation can be useful when you need to pass the elements of a stream to a method that expects an array, or when you need to store the elements of a stream in an array for further processing.


**4. reduce():**  The reduce() operation in Java Stream API is used to combine all elements of a stream into a single value. It takes two arguments: an initial value (also known as the identity) and a binary operator (also known as accumulator), and applies the operator to the elements of the stream and the initial value, accumulating the result.

Here's an example of using the reduce() operation to sum the elements of a stream:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream().reduce(0, Integer::sum);
```

In this example, a stream of integers is created from a list of integers, and the reduce() operation is used to sum the elements of the stream. The initial value of 0 is passed to the reduce() method as the identity, and the Integer::sum method reference is passed as the binary operator.

You can also use the reduce() operation without an initial value to find the maximum or minimum element in a stream:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> max = numbers.stream().reduce(Integer::max);
```

In this example, a stream of integers is created from a list of integers, and the reduce() operation is used to find the maximum element in the stream. The Integer::max method reference is passed as the binary operator. The reduce() method returns an Optional, since it's possible that the stream is empty.

The reduce() operation is a terminal operation, which means that it consumes the elements from the stream and makes it impossible to access the same stream after the reduce() operation has been executed.

It's important to note that the reduce() operation can be useful when you need to combine the elements of a stream into a single value, for example, to calculate the sum, the product or the maximum of a set of numbers.


**5. collect():** The collect() operation in Java Stream API is used to accumulate the elements of a stream into a container, such as a collection or a map. It takes a Collector as an argument, which is a functional interface that defines methods for accumulating elements into a mutable container.

Here's an example of using the collect() operation to create a List from a stream:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> numberList = numbers.stream().collect(Collectors.toList());
```

In this example, a stream of integers is created from a list of integers, and the collect() operation is used to create a new List containing the elements of the stream. The Collectors.toList() method is used to create a Collector that accumulates the elements into a List.

Here's another example of using the collect() operation to create a Set from a stream:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
```

In this example, a stream of integers is created from a list of integers, and the collect() operation is used to create a new Set containing the elements of the stream. The Collectors.toSet() method is used to create a Collector that accumulates the elements into a Set.

You can also use the collect() operation to create more complex data structures, such as maps, by using the Collectors.toMap() method, which takes two functions as arguments, one to extract the key from an element, and another to extract the value.

```java
List<Person> people = Arrays.asList(new Person("John", 25), new Person("Jane", 30), new Person("Bob", 35));
Map<String, Integer> nameAgeMap = people.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
```

In this example, a stream of Person objects is created, and the collect() operation is used to create a Map, where the names of the people are used as the keys and the ages are used as the values. The Person::getName and Person::getAge method references are passed as the functions to extract the key and value respectively.

It's important to note that the collect() operation is a terminal operation, which means that it consumes the elements from the stream and makes it impossible to access the same stream after the collect() operation has been executed.

It's also important to note that the collect operation is useful when you need to accumulate the elements of a stream into a container, this operation can be more efficient than using a forEach operation and adding elements to a container one by one, specially if the stream is parallelized.


min()
max()
count()
anyMatch()
allMatch()
noneMatch()
findFirst()
findAny()

Please note that list of operation is not exhaustive, it may vary with the version of Java, and there can be additional operation as well.