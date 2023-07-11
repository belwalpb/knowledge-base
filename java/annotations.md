# Annotations in Java:

In Java, annotations are used to provide metadata or additional information about program elements such as classes, methods, variables, and parameters. Annotations allow developers to add information to their code that can be used by compilers, tools, and libraries to generate boilerplate code, enforce constraints, and perform other tasks.

Some common uses of annotations in Java include:

1. Code generation: Annotations can be used to generate boilerplate code at compile time, which can save developers time and reduce the risk of errors.

2. Documentation: Annotations can be used to generate documentation for classes, methods, and other program elements.

3. Runtime processing: Annotations can be processed at runtime to perform tasks such as validating input, controlling access to resources, and configuring dependencies.

4. Testing: Annotations can be used in testing frameworks to specify test data, expected results, and other test-related information.


## Creating Custom Annotations in Java:

1. Define the Annotation: To create a custom annotation, we need to define it using the `@interface` keyword. Here's an example:

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
   String value();
   int count() default 1;
}
```

In this example, the `@CustomAnnotation` annotation is defined with two elements: `value()` and `count()`. The `value()` element takes a string value, while the `count()` element takes an integer value with a default of 1. The `@Retention` and `@Target` annotations are used to specify the retention policy and target element type of the custom annotation.


2. Use the Annotation: Once we have defined the custom annotation, we can use it to annotate program elements such as methods, classes, and fields. Here's an example:

```java
public class MyClass {
   @CustomAnnotation(value = "Hello, World!", count = 3)
   public void myMethod() {
      // method body
   }
}
```

In this example, the `@CustomAnnotation` annotation is applied to the `myMethod()` method of the `MyClass` class with the `value` attribute set to "Hello, World!" and the `count` attribute set to 3.

3. Process the Annotation: To process the custom annotation, we can use reflection to access the annotation and its values at runtime. Here's an example:

```java
public class AnnotationProcessor {
   public static void processAnnotation(Object obj) {
      Class<?> clazz = obj.getClass();
      Method[] methods = clazz.getMethods();
      for (Method method : methods) {
         if (method.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
            String value = annotation.value();
            int count = annotation.count();
            // process annotation values
         }
      }
   }
}
```

In this example, the `processAnnotation()` method uses reflection to access the `@CustomAnnotation` annotation applied to the methods of an object and processes its values.