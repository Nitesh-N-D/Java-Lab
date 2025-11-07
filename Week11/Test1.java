## Interface Implementation in Java  
Program to demonstrate **interface implementation** using a `Shape` interface and `Circle` class.  
Shows how **abstraction** is achieved through interfaces in Java.  
#Java #OOP #Interface #Abstraction

     interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Test1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
