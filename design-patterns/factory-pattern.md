## Factory Design Pattern


The Factory design pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It separates the process of creating objects from the objects themselves, which makes the code more flexible and easy to maintain.

There are three types of factory pattern:

1. Simple Factory
2. Factory Method
3. Abstract Factory


#### Simple Factory:

```java
interface Product {
    void doSomething();
}

class ConcreteProductA implements Product {
    public void doSomething() {
        //do something
    }
}

class ConcreteProductB implements Product {
    public void doSomething() {
        //do something
    }
}

class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
```


#### Factory Method:


```java
interface Product {
    void doSomething();
}

class ConcreteProductA implements Product {
    public void doSomething() {
        //do something
    }
}

class ConcreteProductB implements Product {
    public void doSomething() {
        //do something
    }
}

interface Factory {
    Product createProduct();
}

class ConcreteFactoryA implements Factory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements Factory {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

```

#### Abstract Factory:

```java
interface ProductA {
    void doSomethingA();
}

interface ProductB {
    void doSomethingB();
}

class ConcreteProductA1 implements ProductA {
    public void doSomethingA() {
        //do something
    }
}

class ConcreteProductB1 implements ProductB {
    public void doSomethingB() {
        //do something
    }
}

interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}    
```


#### Difference Between Simple, Factory & Abstract Factory Design Patterns:

The Simple Factory, Factory Method, and Abstract Factory design patterns are all creational patterns that are used to create objects. However, they have different approaches and uses.

**Simple Factory:** A Simple Factory is a class that has a method that creates objects of different classes. The method takes in some input and based on that input, it creates an object of the corresponding class. The clients of the Simple Factory do not need to know about the specific classes that are being created, they only need to know the interface of the objects being created.

**Factory Method:** The Factory Method pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The factory method pattern defines a method that creates objects, but it is implemented by subclasses. The client uses the factory method to create objects, but it does not know which class is instantiated.

**Abstract Factory:** The Abstract Factory pattern is a creational pattern that provides an interface for creating families of related objects, but does not specify their concrete classes. The factory is an interface, and there are multiple implementations of the factory which create different types of products. It is a pattern that creates a group of related objects, rather than just one single object.

In summary, Simple Factory is used for creating a single object, Factory Method is used for creating an object of a sub-class and Abstract Factory is used for creating a group of related objects.