## Adapter Design Pattern

The Adapter design pattern is a structural pattern that allows objects with incompatible interfaces to work together. It provides a way to convert the interface of a class into another interface that the client expects.

In Java, the Adapter pattern can be implemented by creating a class that implements the target interface and wraps an instance of the adaptee class. The Adapter class forwards requests to the adaptee class and translates the adaptee's responses into a format that the client can understand.

Here is an example of the Adapter pattern in Java:

```java
interface Target {
    void request();
}

class Adaptee {
    void specificRequest() {
        // code to perform the specific request
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
```

In this example, the `Target` interface defines a request method that the client expects. The Adaptee class has a `specificRequest` method that the client cannot use directly because it has a different interface. The Adapter class implements the Target interface and wraps an instance of the Adaptee class. When the client calls the request method on the Adapter, it forwards the call to the specificRequest method of the Adaptee class. The Adapter class thus adapts the Adaptee class to the Target interface.

It's important to note that the Adapter pattern is a way to provide a different interface for an existing class, it's not a way to extend functionality.


The Adapter pattern can be used in a variety of situations, but it is typically used in the following scenarios:

1. When you need to use an existing class, but its interface is not compatible with the rest of your code. By using an adapter, you can convert the interface of the existing class to the interface that you need.

2. When you want to create a reusable class that cooperates with classes that don't have compatible interfaces. The adapter can act as a bridge between the two classes, allowing them to work together.

3. When you want to add functionality to an existing class, but don't want to modify the class itself. By using an adapter, you can add the functionality you need without modifying the existing class.

4. When you need to work with third-party libraries that have different interfaces than the ones you are used to. You can use an adapter to convert the interface of the third-party library to a more familiar interface.

5. When you need to work with legacy code that has an outdated or otherwise incompatible interface. Instead of modifying the legacy code, you can use an adapter to convert its interface to a more modern one.

6. It's important to note that the Adapter pattern is a way to make two incompatible interfaces work together. It's not a way to add functionality to a class, for that purpose you can use Decorator pattern.

**Some More Points:**

The adapter pattern does the same thing real-world adapters do. For example, between your all-entrusted old headphones and your new phone, I'm sure there will be an adapter that will let you plug the cable of your  old headphones into the USB-C port of your new phone. The adapter changes the interface of the headphones into one that your phone expects. That's the idea behind the adapter pattern.

In layman language it's about making two interfaces which aren't compatible, compatible :)
![image](https://user-images.githubusercontent.com/61246444/231216729-14400206-acb5-4982-a759-ace6019b3f70.png)

A common use case is when you're trying to integrate a legacy code base with a new one. They'll have different interfaces, so you'll need an adapter to convert one interface into another to make them work together without changing either one of them. 

So in the adapter pattern, there's a Target class that a Client uses and an Adaptee class that needs to be adapted to be used. In other languages which support multiple inheritance, the adapter uses multiple inheritance to get the functionality of both classes and adapt one to another. The problem is that in Java, you could not extend from two classes. There is no multiple inheritance of classes.
![image](https://user-images.githubusercontent.com/61246444/231216842-4a7f4c41-5a06-41ac-84a5-33e0cfeecfb4.png)

The only difference is that with this approach, we use composition to delegate request to the adaptee. Here's an example.![image](https://user-images.githubusercontent.com/61246444/231216874-ca7c0de2-44ac-4f5a-8688-7750832c50ae.png)

Let's suppose we have an interface to play all the audio files. And now that Video support has been added, we want to play the audio part of a video without making changes to the client.
![image](https://user-images.githubusercontent.com/61246444/231216897-527946ee-cb38-49de-8e2d-cbe2d91e6cf4.png)

To solve this, we can have a VideoAdapter class. This class implements the audio interface and has a reference to the video class set in the constructor. Now in the play method, we call another method to extract the audio part of the video file, so we can play it like any other audio file. This illustrates another point about adapters, sometimes you'll need to implement additional methods or classes to make the interfaces work, and you'll have to think what's better, rework all your client-side calls to fit the new interface or provide an Adapter class?

Public class VideoAdapter implements Audio{
	Private Video video;
	Public VideoAdapter (Video video){
		This.video = video;
	}
	
	Public void play(){
		Video AdapteeVideo = this.video.reproduce();
		Audio audio = extractAudio(video);
		Audio.play();
	}
	Private Audio extractAudio(Video video){
		//..
	}
}
![image](https://user-images.githubusercontent.com/61246444/231216938-fb8c4cfd-bc89-44f8-90b4-ccdf20a37099.png)

The adapter has an adaptee(Video here) and delegates to adaptee, so it is by composition.

If still not understood check this video:
![image](https://user-images.githubusercontent.com/61246444/231216988-7db0e233-b952-4e95-8993-1f1a58390d9d.png)

If still not understood check this video:
Adapter Pattern – Design Patterns (ep 8)![image](https://user-images.githubusercontent.com/61246444/231217082-cdd96008-f7d0-4d0e-b478-dd9629c1ca54.png)




