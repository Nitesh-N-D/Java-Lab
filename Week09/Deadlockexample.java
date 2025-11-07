## Deadlock Simulation in Java  
Program to demonstrate a **deadlock situation** using multiple threads.  
The program:  
- Defines `Printer` resources and `Employee` threads that need to access **two printers**  
- Shows how acquiring locks in different orders can cause a **deadlock**  
- Demonstrates **synchronized blocks** and potential pitfalls in multithreaded environments  
- Useful for understanding **deadlock detection and prevention** in Java

class Printer {
    String name;
    Printer(String name) 
    {
        this.name=name;
    }
}
class Employee extends Thread {
    String name;
    Printer fPrinter;
    Printer sPrinter;
    Employee(String name,Printer fPrinter,Printer sPrinter) {
        this.name=name;
        this.fPrinter=fPrinter;
        this.sPrinter=sPrinter;
    }
    public void run() {
        try {
            synchronized(fPrinter) {
                System.out.println(name+" locked "+fPrinter.name);
                Thread.sleep(100);

                synchronized(sPrinter) {
                    System.out.println(name+" locked "+sPrinter.name);
                    System.out.println(name+" is printing using both printers");
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was caught");
        }
    }}

 class Deadlockexample {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Printer 1");
        Printer printer2 = new Printer("Printer 2");

        Employee emp1 = new Employee("Employee 1", printer1, printer2);
        Employee emp2 = new Employee("Employee 2", printer2, printer1);

        emp1.start();
        emp2.start();
    }
}
