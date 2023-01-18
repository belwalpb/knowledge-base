# Map Interface in Java

In Java, the Map interface is part of the Java Collections Framework and it provides a way to store key-value pairs. It is implemented by several classes, such as HashMap, TreeMap, and LinkedHashMap.

A Map stores its elements in a collection of key-value pairs, where each key is unique and is used to retrieve the corresponding value. The keys are used as an index, similar to the way an array is indexed. The basic operations of a Map include adding, removing, and looking up key-value pairs.

**Here are some of the important method provided by Map interface:**

`void clear()`: remove all the key-value pairs from the map.
`boolean containsKey(Object key)`: returns true if the map contains the specified key.
`boolean containsValue(Object value)`: returns true if the map contains the specified value.
`Set entrySet()`: returns a Set of the key-value pairs in the map.
`Object get(Object key)`: returns the value associated with the specified key.
`boolean isEmpty()`: returns true if the map is empty.
`Set keySet()`: returns a Set of the keys in the map.
`Object put(Object key, Object value)`: associates the specified value with the specified key in the map.
`void putAll(Map t)`: copies all of the key-value pairs from the specified map to this map.
`Object remove(Object key)`: removes the key-value pair for the specified key from the map.
`int size()`: returns the number of key-value pairs in the map.
`Collection values()`: returns a Collection of the values in the map.

Here are some of the popular Implementation of Hash Map Interface:

## 1. HashMap

In Java, the HashMap class is an implementation of the Map interface that uses a hash table to store key-value pairs. It provides **fast lookups, insertions, and deletions**, with O(1) average performance for most operations.

A HashMap works by taking a key and applying a hash function to it, which produces an index (also called a "bucket") in the underlying array where the value associated with that key should be stored. When a key is added to a HashMap, the key is hashed and the resulting hash value is used to determine the index of the key-value pair in the array.

HashMap class uses an array of Entry objects to store the key-value pairs. Each entry contains a key, a value, and a reference to the next entry in the same bucket, in case of collision.

The class provides a number of constructors, which allows you to create a HashMap with a specific initial capacity, load factor, and/or comparator.

**Here are some of the important method provided by HashMap class:**

**void clear()**: remove all the key-value pairs from the map.
**Object clone()**: returns a shallow copy of this HashMap instance.
**boolean containsKey(Object key)**: returns true if the map contains the specified key.
**boolean containsValue(Object value)**: returns true if the map contains the specified value.
**Set entrySet()**: returns a Set of the key-value pairs in the map.
**Object get(Object key)**: returns the value associated with the specified key.
**boolean isEmpty()**: returns true if the map is empty.
**Set keySet()**: returns a Set of the keys in the map.
**Object put(Object key, Object value)**: associates the specified value with the specified key in the map.
**void putAll(Map t)**: copies all of the key-value pairs from the specified map to this map.
**Object remove(Object key)**: removes the key-value pair for the specified key from the map.
**int size()**: returns the number of key-value pairs in the map.
**Collection values()**: returns a Collection of the values in the map.

It's important to note that HashMap is not thread-safe. The keys used in HashMap should be immutable, and also it should not be null, otherwise it'll throw a `NullPointerException`.

**Here are a few important concepts to understand when working with this class:**

1. Load factor: The load factor is a measure of how full the hash table is. It is defined as the ratio of the number of key-value pairs stored in the table to the number of buckets in the table. When the load factor exceeds a certain threshold, the HashMap will increase the size of the table (also known as rehashing) in order to maintain good performance. 

```java
int load_factor = key_value_pairs / buckets;
// Here key_Value_pairs >= buckets.
```

2. Capacity: The capacity of a HashMap is the number of buckets in the hash table. When a new key-value pair is added to the HashMap, the key is hashed and the resulting hash value is used to determine the index of the key-value pair in the table.

3. Rehashing: Rehashing is the process of increasing the size of the hash table and redistributing the key-value pairs to new buckets. This is done when the load factor exceeds a certain threshold, in order to maintain good performance. When rehashing occurs, a new and larger array is created and all the key-value pairs are placed into their new buckets.

**The default load factor of HashMap is 0.75 and the default capacity of HashMap is 16.**

When the number of key-value pairs in the HashMap exceeds the product of the load factor and the current capacity, the capacity is increased (by default, multiplied by 2) and all key-value pairs are rehashed, which is a potentially expensive operation.

You can also specify a custom load factor and initial capacity when creating a HashMap, using one of the constructors that take these arguments. This can be useful if you have a good estimate of the number of key-value pairs that will be stored in the map, and you want to avoid rehashing.

In general, a smaller load factor will decrease the likelihood of rehashing, but it will also increase the space overhead of the HashMap. A larger load factor will decrease the space overhead, but it will increase the likelihood of rehashing.

## 2. LinkedHashMap

In Java, the `LinkedHashMap` class is a variation of the HashMap class that maintains the insertion order of the key-value pairs. This means that when iterating over the key-value pairs in a LinkedHashMap, the keys will be returned in the order in which they were inserted.

LinkedHashMap uses a doubly-linked list to maintain the insertion order of the key-value pairs. It also uses a hash table to provide fast lookups and insertions, similar to HashMap. This combination of a hash table and a doubly-linked list allows for a good balance of performance and memory usage.

In general, a `LinkedHashMap` will use more memory than a `HashMap` in Java because it needs to maintain both a doubly-linked list and a hash table.

Like HashMap, LinkedHashMap class provides several constructors, which allows you to create a LinkedHashMap with a specific initial capacity, load factor, and/or ordering mode.

One of the constructor of LinkedHashMap allows you to specify an ordering mode of the key-value pairs, either by insertion order or by access order. Access order means that the keys will be returned in the order in which they were last accessed, which can be useful for implementing a Least Recently Used (LRU) cache.

**Here are some of the important method provided by LinkedHashMap class:**

**void clear()**: remove all the key-value pairs from the map.
**Object clone()**: returns a shallow copy of this LinkedHashMap instance.
**boolean containsKey(Object key)**: returns true if the map contains the specified key.
**boolean containsValue(Object value)**: returns true if the map contains the specified value.
**Set entrySet()**: returns a Set of the key-value pairs in the map.
**Object get(Object key)**: returns the value associated with the specified key.
**Object getOrDefault(Object key, V defaultValue)**: returns the value to which the specified key is mapped, or the defaultValue if this map contains no mapping for the key.
**boolean isEmpty()**: returns true if the map is empty.
**Set keySet()**: returns a Set of the keys in the map.
**Object put(Object key, Object value)**: associates the specified value with the specified key in the map.
**void putAll(Map t)**: copies all of the key-value pairs from the specified map to this map.
**Object remove(Object key)**: removes the key-value pair for the specified key from the map.
**int size()**: returns the number of key-value pairs in the map.
**Collection values()**: returns a Collection of the values in the map.


LinkedHashMap is useful when you need to maintain the insertion order of the key-value pairs, and also it is thread-safe, but not suitable for high-concurrency scenarios.


## WeakHashMap

A WeakHashMap is a type of HashMap in Java that uses weak keys. This means that the keys in a WeakHashMap can be garbage collected if they are no longer referenced outside of the map. This is in contrast to a regular HashMap, where keys are strongly referenced and will not be garbage collected until they are explicitly removed from the map. WeakHashMap is useful in situations where you want to use keys that may not always be in use, but you still want to be able to retrieve their associated values if they are still in use.

**Some more important differences between Hashmap and WeakHashmap:**

**1. Strong vs Weak References:** Weak Reference Objects are not the default type/class of Reference Object and they should be explicitly specified while using them. This type of reference is used in WeakHashMap to reference the entry objects. 
Strong References: This is the default type/class of Reference Object. Any object which has an active strong reference are not eligible for garbage collection. In HashMap, key objects have strong references. 

**2. Role of Garbage Collector:** In HashMap , entry object(entry object stores key-value pairs) is not eligible for garbage collection i.e Hashmap is dominant over Garbage Collector. 
In WeakHashmap, When a key is discarded then its entry is automatically removed from the map, in other words, garbage collected.

**3. Clone method Implementation:** HashMap implements Cloneable interface. 
WeakHashMap does not implement Cloneable interface, it only implements Map interface. Hence, there is no clone() method in the WeakHashMap class.

**Garbage Collection Example With HashMap:**

```java
// Java program to illustrate
// Hashmap
import java.util.*;
class HashMapDemo
{
	public static void main(String args[])throws Exception
	{
		HashMap m = new HashMap();
		Demo d = new Demo();
		
		// puts an entry into HashMap
		m.put(d," Hi ");
		
		System.out.println(m);
		d = null;
		
		// garbage collector is called
		System.gc();
		
		//thread sleeps for 4 sec
		Thread.sleep(4000);
		
		System.out.println(m);
		}
	}
	class Demo
	{
		public String toString()
		{
			return "demo";
		}
		
		// finalize method
		public void finalize()
		{
			System.out.println("Finalize method is called");
		}
}
```

**Output:**

```
{demo=Hi}
{demo=Hi}
```

**Garbage Collection Example With WeakHashMap:**

```java
// Java program to illustrate
// WeakHashmap
import java.util.*;
class WeakHashMapDemo
{
	public static void main(String args[])throws Exception
	{
		WeakHashMap m = new WeakHashMap();
		Demo d = new Demo();
		
		// puts an entry into WeakHashMap
		m.put(d," Hi ");
		System.out.println(m);
		
		d = null;
		
		// garbage collector is called
		System.gc();
		
		// thread sleeps for 4 sec
		Thread.sleep(4000); .
		
		System.out.println(m);
	}
}

class Demo
{
	public String toString()
	{
		return "demo";
	}
	
	// finalize method
	public void finalize()
	{
		System.out.println("finalize method is called");
	}
}
```

**Output:**

```
{demo = Hi}
finalize method is called
{ }
```


## EnumMap

