## Abstraction in Java

In Java, abstraction is a concept that refers to the ability to focus on the essential characteristics of an object or concept, while ignoring certain details that are not relevant in a particular context. This is often achieved through the use of interfaces and abstract classes, which define a set of methods that must be implemented by any concrete class that implements or extends them.

##### Abstract classes:
An abstract class can be used to provide a common interface for a group of related classes. You can define an abstract class by using the abstract keyword before the class declaration. Abstract classes can have both abstract and non-abstract methods (i.e methods with a body). An abstract method is a method with no implementation, denoted by the keyword abstract. Concrete subclasses of an abstract class must implement all of its abstract methods.

##### Interfaces:
An interface is a collection of abstract methods that can be implemented by any class. The methods in an interface have no implementation (i.e., no method body). A class that implements an interface must provide an implementation for all its methods. An interface can be defined using the keyword interface.

##### When to use Abstract Class and When to use Interfaces?

In Java, you should use an `abstract class` when you want to provide a common interface for a group of related classes and  one or more of the methods in that interface have a default implementation that can be shared among the classes.

An example of when to use an abstract class is when you have a group of related classes that represent different types of animals. You could create an abstract class called "Animal" that defines the basic properties and behavior that all animals have in common, such as the ability to move, eat, and breathe. The abstract class could also have a method called makeSound() that is abstract and must be implemented by all concrete subclasses such as Dog, cat etc.

<br/>

On the other hand, an interface should be used when you want to define a contract that can be implemented by multiple unrelated classes. Interface only have abstract methods, so the implementing classes have the flexibility to provide their own implementations.


An example of when to use an interface is when you have a group of unrelated classes that need to be able to perform certain actions, such as Playable and Destroyable. For example, you could create an interface called "Playable" that defines methods such as play(), pause(), and stop(). Any class, such as a music player, video player or game that needs to be able to play, pause, or stop could implement this interface.

##### Abstract Class Example:

```java
abstract class Shape {
    int x, y;
    abstract void draw();
    void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }
}

class Circle extends Shape {
    int radius;
    void draw() {
        // Code to draw a circle
    }
}

class Square extends Shape {
    int side;
    void draw() {
        // Code to draw a square
    }
}
```


##### Some Common Bad Practices With Abstraction in Java

Here are some common bad practices when using abstract classes and interfaces in Java:

1. Using too many abstract classes: Overuse of abstract classes can make your code more complex and harder to understand. It's important to use them only when necessary, and to keep the number of levels of inheritance to a minimum.

2. Not properly implementing the abstract methods: If a concrete subclass fails to implement all the abstract methods defined in the abstract class, it will also need to be declared as abstract and this can lead to problems and confusion.

3. Not declaring fields as final: An abstract class can define fields that are common to all its subclasses. But, if these fields are not declared as final, the subclasses can change their value, which can lead to unexpected behavior.

4. Not using interfaces for cross-cutting concerns: Interfaces are great for cross-cutting concerns, such as logging, security, and error handling. However, if you don't use interfaces for these concerns, you'll end up with a lot of duplicate code in your classes.

5. Not using interface for loosely-coupled design: Interfaces allow for a loosely-coupled design, where classes don't need to know about each other's implementation details. But, if you put too much implementation detail into an interface, you'll end up with tightly-coupled classes that are hard to test and maintain.

6. Not providing implementation in abstract class: An abstract class provides an option to provide a common implementation of the methods while giving the flexibility to subclasses to change the implementation. If all methods are abstract, there is no point in using abstract class and it can be converted to interface.

7. Not providing proper documentation or name for abstract methods and classes. This leads to confusion and difficult maintenance of codebase.