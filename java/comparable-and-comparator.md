# Comparable

`Comparable` is an interface that is implemented by a class to indicate that its instances have a natural ordering. The `compareTo()` method compares the current object to the one passed as an argument, and returns an integer value indicating their relative order. A positive value indicates that the current object is greater than the argument, a negative value indicates that the current object is less than the argument, and a zero value indicates that the two are equal.

Here's an example of a Person class implementing Comparable:

```java
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other) {
        if (this.age == other.age) {
            return this.name.compareTo(other.name);
        } else {
            return this.age - other.age;
        }
    }
    ...
}
```

Once the class implements Comparable, it can be used in sorting algorithms, such as `Arrays.sort(personArray)` or `Collections.sort(personList)`, and the sorting will be based on the natural ordering defined by the compareTo method.

**compareTo returns:**

- It returns 0 if the values are equal.
- In case, if the object has a lesser value, then this method returns a negative value.
- If the object has a higher value, it returns a positive value.

# Comparator

`Comparator` is an interface that is used to define specific ordering for a class. It has two methods: `compare()` and `equals()`. The compare() method compares two objects and returns an integer indicating their relative order, just like compareTo(). The equals() method is used to determine if two Comparator objects are equal.

Here's an example of a Person class using a Comparator to sort instances by name:

```java
class PersonNameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
```

This comparator can be passed as an argument to sorting algorithms, such as `Arrays.sort(personArray, new PersonNameComparator())` or `Collections.sort(personList, new PersonNameComparator())`, and the sorting will be based on the specific ordering defined by the comparator.

In summary, if a class implements `Comparable`, its instances have a natural order, and you can use sorting methods that rely on that order. But if you want to sort instances of a class based on specific criteria, you can define a `Comparator` and use it to sort the instances.