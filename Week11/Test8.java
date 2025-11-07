## Interface Implementation for Payment Methods in Java  
Demonstrates the use of **interfaces** to achieve **runtime polymorphism**.  
The `Payment` interface is implemented by `CreditCard` and `UPI` classes, each providing its own version of the `pay()` method.  
The program dynamically switches between different **payment modes**, showcasing flexibility and code reusability.  
#Java #Interface #Polymorphism #OOP #RuntimeBinding


interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class Test8 {
    public static void main(String[] args) {
        
        Payment p;
        p = new CreditCard();
        p.pay();
        p = new UPI();
        p.pay();
    }
}
