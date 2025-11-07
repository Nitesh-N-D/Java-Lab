## Abstract Class and Interface Implementation in Java  
Demonstrates how a class can **extend an abstract class** and **implement an interface** simultaneously.  
The `Machine` abstract class defines a `powerOn()` method, while the `Operable` interface declares `operate()`.  
`WashingMachine` provides concrete implementations for both methods, showcasing **multiple inheritance through interfaces**.  
#Java #AbstractClass #Interface #OOP #Inheritance

interface Operable {
    void operate();
}

abstract class Machine {
    abstract void powerOn();
}

class WashingMachine extends Machine implements Operable {
    public void powerOn() {
        System.out.println("Power ON the washing machine");
    }
    public void operate() {
        System.out.println("Washing clothes");
    }
}

class Test6 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.powerOn();
        wm.operate();
    }
}
