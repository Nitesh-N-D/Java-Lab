## Packages and Interfaces in Java  
Demonstrates the use of **packages** to organize classes and implement **interfaces** across files.  
The `Printable` interface and `Report` class reside in a custom package, imported and used in `Test10`.  
Highlights **modular programming**, **code reusability**, and **namespace management** in Java.  
#Java #Packages #Interfaces #OOP #Encapsulation

  
package mypacakage;

public class Printable {
    void print() {
        System.out.println("This is a printable document");
    }
}
package mypacakage;
public class Report implements Printable {
    public void print() {
        System.out.println("Printing from package class");
    }
}


import mypackage.*;
class Test10 {
    public static void main(String[] args) {
       
        Printable p = new Report();
        p.print();
    }
}
