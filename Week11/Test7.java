## Interface Constant Usage in Java  
Demonstrates how to define and use **constants in an interface**.  
The `MathConstants` interface declares the constant `PI`, which is accessed directly in the `CircleArea` class.  
This program calculates the **area of a circle** using the interface constant, showcasing **shared constant usage** in Java.  
#Java #Interface #Constants #OOP #Encapsulation

interface MathConstants {
    double PI = 3.14159;
}

class CircleArea implements MathConstants {
    double radius;
    CircleArea(double r) { radius = r; }

    void calculate() {
        System.out.println("Area = " + (PI * radius * radius));
    }
}

class Test7 {
    public static void main(String[] args) {
        CircleArea c = new CircleArea(5);
        c.calculate();
    }
}
