## Nested Classes Inside Interfaces in Java  
Demonstrates how an **interface** can contain a **nested class** and how both can be used together.  
The program shows an `OuterInterface` with a `NestedClass`, and an implementing class `Implementor`.  
Highlights **interface implementation**, **nested class instantiation**, and **modular structure** in Java.  
#Java #Interfaces #NestedClasses #OOP #Encapsulation

  
interface OuterInterface {
    void outerMethod();

    class NestedClass {
        void nestedMethod() {
            System.out.println("Nested class inside Interface");
        }
    }
}

class Implementor implements OuterInterface {
    public void outerMethod() {
        System.out.println("Outer interface method implemented");
    }
}

class Test11 {
    public static void main(String[] args) {
    
        Implementor i = new Implementor();
        i.outerMethod();

        OuterInterface.NestedClass nc = new OuterInterface.NestedClass();
        nc.nestedMethod();
    }
}
