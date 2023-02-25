## Factory vs Abstract Factory Design Pattern

 The difference between the Factory and Abstract Factory patterns is the number of objects they create and the level of abstraction they provide.

Factory pattern creates an object of a single class, but the client does not know which class is instantiated. It is used to create an object of a single class, but the client does not know which class is instantiated. For example, a factory for creating a car object can create different types of cars like sports car, luxury car, etc.

Example:

```java
interface Car{
  public void drive();
}

class SportsCar implements Car{
  public void drive(){
    System.out.println("Driving Sports car");
  }
}

class LuxuryCar implements Car{
  public void drive(){
    System.out.println("Driving Luxury car");
  }
}

class CarFactory{
  public Car createCar(String type){
    if(type.equalsIgnoreCase("Sports")){
      return new SportsCar();
    }else if(type.equalsIgnoreCase("Luxury")){
      return new LuxuryCar();
    }
    return null;
  }
}
```


Abstract Factory pattern creates a group of related objects, rather than just one single object, and the client does not know which factory is creating the object. It is used to create a group of related objects, rather than just one single object, and the client does not know which factory is creating the object. For example, a factory for creating a car object can create different types of cars and also different types of engines for those cars.

Example:

```java
interface Car{
  public void drive();
}

interface Engine{
  public void start();
}

class SportsCar implements Car{
  Engine engine;
  public SportsCar(Engine e){
    engine = e;
  }
  public void drive(){
    System.out.println("Driving Sports car");
  }
}

class LuxuryCar implements Car{
  Engine engine;
  public LuxuryCar(Engine e){
    engine = e;
  }
  public void drive(){
    System.out.println("Driving Luxury car");
  }
}

class V8Engine implements Engine{
  public void start(){  
        System.out.println("V8 Engine started");
    }
}

class V6Engine implements Engine{
    public void start(){
        System.out.println("V6 Engine started");
    }
}

abstract class CarAndEngineFactory{
    abstract Car createCar();
    abstract Engine createEngine();
}

class SportsCarFactory extends CarAndEngineFactory{
    public Car createCar(){
        return new SportsCar(createEngine());
    }
    public Engine createEngine(){
        return new V8Engine();
    }
}

class LuxuryCarFactory extends CarAndEngineFactory{
    public Car createCar(){
        return new LuxuryCar(createEngine());
    }
    public Engine createEngine(){
        return new V6Engine();
    }
}
```

In summary, the Factory pattern is used to create an object of a single class, while the Abstract Factory pattern is used to create a group of related objects. The Factory pattern provides a level of abstraction for creating a single object, while the Abstract Factory pattern provides a higher level of abstraction for creating a group of related objects.