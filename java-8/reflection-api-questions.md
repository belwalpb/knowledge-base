## Java Reflection API


**1. What is the Reflection API in Java?**

The Reflection API in Java allows developers to examine and manipulate the properties and behavior of classes, interfaces, and objects at runtime. This includes being able to inspect the class, its methods, constructors, and fields, as well as being able to instantiate new objects, invoke methods, and access fields using reflection.

**2. How do you use the Reflection API to inspect a class?**

You can use the Reflection API to inspect a class by first obtaining a Class object for the class using the .class syntax or the Class.forName() method. Once you have the Class object, you can use various methods such as getMethods(), getConstructors(), getFields() to inspect the class's methods, constructors, and fields.

**3. How do you use the Reflection API to invoke a method?**

You can use the Reflection API to invoke a method by first obtaining a Method object for the method using the getMethod() method of the Class object. Once you have the Method object, you can use the invoke() method to invoke the method on an instance of the class.

**4. How do you use the Reflection API to access a private field?**

You can use the Reflection API to access a private field by first obtaining a Field object for the field using the getDeclaredField() method of the Class object. Once you have the Field object, you can use the setAccessible(true) method to make the field accessible. Then you can use the get() or set() method to access the field's value.

**5. What are the drawbacks of using Reflection API?**

Using the Reflection API can have several drawbacks, including decreased performance and increased complexity. The reflection methods can be slow, especially when compared to direct method invocation. Additionally, because reflection allows for the manipulation of private members, it can make code more difficult to understand and maintain. It also breaks encapsulation, which can lead to security risks.

**6. What is the difference between Class.forName() and .class in Java?**

Both Class.forName() and .class are used to obtain a Class object for a class in Java. The main difference is that Class.forName() takes a string containing the fully qualified class name as an argument, and it can also initialize the class if it has not already been loaded. The .class syntax, on the other hand, is a shorthand for calling Class.forName() and is used to obtain the Class object for a class known at compile-time.

**7. What is the use of the java.lang.reflect package?**

The java.lang.reflect package provides classes and interfaces for obtaining reflective information about classes and objects. These classes and interfaces can be used to examine and manipulate the properties and behavior of classes, interfaces, and objects at runtime.

**8. How do you use the Reflection API to instantiate an object?**

You can use the Reflection API to instantiate an object by first obtaining a Constructor object for the class using the getConstructor() method of the Class object. Once you have the Constructor object, you can use the newInstance() method to create a new instance of the class.

**9. What is the difference between getField() and getDeclaredField() in Java?**

The getField() method of the Class object is used to obtain a Field object for a field that is accessible from the class or any of its superclasses, while the getDeclaredField() method is used to obtain a Field object for a field that is declared in the class. The getField() method only returns fields that are public, while the getDeclaredField() method returns all fields regardless of their accessibility.

**10. Can you use the Reflection API to invoke a private method?**

Yes, you can use the Reflection API to invoke a private method by first obtaining a Method object for the method using the getDeclaredMethod() method of the Class object. Once you have the Method object, you can use the setAccessible(true) method to make the method accessible, and then use the invoke() method to invoke the method on an instance of the class.

**11. How can you determine if a class is an interface or a class?**
You can use the isInterface() method of the Class object to determine if a class is an interface or a class. This method returns true if the class is an interface, and false if it is a class.

**12. How can you determine the superclass of a class?**
You can use the getSuperclass() method of the Class object to determine the superclass of a class. This method returns the Class object for the superclass of the class, or null if the class has no superclass (i.e. it is the Object class).