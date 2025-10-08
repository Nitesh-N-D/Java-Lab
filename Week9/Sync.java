## Synchronized Counter using Runnable in Java  
Program to demonstrate **thread synchronization** with multiple threads implementing the `Runnable` interface.  
The program:  
- Uses multiple threads to **increment and decrement** a shared counter  
- Ensures **safe access** to shared data using `synchronized` methods  
- Shows the **value of the counter** after each operation per thread  
- Illustrates proper **synchronization and thread-safe operations** in Java

public class Sync{
    public static void main(String[] args) {
        Counter cobj=new Counter();
        Thread t1=new Thread(cobj, "Thread 1");
        Thread t2=new Thread(cobj, "Thread 2");
        Thread t3=new Thread(cobj, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Counter implements Runnable
{
    private int c = 0;

    public synchronized void increment() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Error:" + e.getMessage());
        }
        c++;
        System.out.println("Incremented");
    }

    public synchronized void decrement() {
        c--;
        System.out.println("Decremented");
    }

    public int getValue() {
        return c;
    }
    public void run()
    {
        this.increment();
        System.out.println("Value After increment:"+Thread.currentThread().getName()+" Value: "+this.getValue());
        this.decrement();
        System.out.println("Value after decrement:"+Thread.currentThread().getName()+" Value: "+this.getValue());
    }
}
