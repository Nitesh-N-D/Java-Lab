## Vehicle Interface Implementation in Java  
Demonstrates the concept of **interfaces** in Java using a `Vehicle` interface and its implementation by the `Bike` class.  
Illustrates **abstraction** and **method overriding** through `start()` and `stop()` methods.  
Shows how interfaces define behavior contracts that implementing classes must follow.  
A simple example to understand **OOP principles** like abstraction and polymorphism.  
#Java #Interface #Abstraction #OOP #Polymorphism

interface Vehicle {
    void start();
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}

class Test2 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}
