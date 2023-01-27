# Serialization and Deserialization

Serialization in Java is the process of converting an object's state to a byte stream, and deserialization is the process of recreating the object from a byte stream. This allows objects to be easily saved to a file or sent over a network. In order for a class to be serializable, it must implement the java.io.Serializable interface. However, it's worth noting that not all objects should be serializable, for example, objects with resources such as file handles should not be serialized.

## serialVersionUID

In Java, the SerialVersionUID is a unique identifier that is used to ensure that a serialized class is compatible with the class into which it is being deserialized.

When a class is serialized, an object of that class is converted into a stream of bytes so that it can be stored or transmitted over a network. When the object is deserialized, the bytes are converted back into an object of the class. However, sometimes the class may have changed since the object was serialized, for example, due to modification in the code, adding or removing fields, etc. In this case, deserialization may not work as expected.

The SerialVersionUID is a unique identifier that is automatically generated for a class when it is serialized. When the class is deserialized, the JVM checks the SerialVersionUID of the class and the deserialized object. If they match, the deserialization process continues as expected. If they do not match, it throws an InvalidClassException, indicating that the class has been modified and is incompatible with the object being deserialized.

In simple words, SerialVersionUID ensures that the class being deserialized is the same as the class that was serialized, in order to avoid deserialization error due to class changes.