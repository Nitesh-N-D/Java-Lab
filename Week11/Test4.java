## Multiple Interface Implementation in Java  
Demonstrates how a single class can implement **multiple interfaces** in Java.  
The `Report` class implements both `Printable` and `Showable` interfaces, defining their methods.  
Illustrates **multiple inheritance through interfaces** and **polymorphism** in Java.  
A simple example to understand how interfaces enhance flexibility and modularity in design.  
#Java #Interface #MultipleInheritance #OOP #Polymorphism

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Report implements Printable, Showable {
    public void print() {
        System.out.println("Printing Report");
    }
    public void show() {
        System.out.println("Showing Report");
    }
}

class Test4 {
    public static void main(String[] args) {
        Report r = new Report();
        r.print();
        r.show();
    }
}

