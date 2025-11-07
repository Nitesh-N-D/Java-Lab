## Synchronized Counter in Java  
Program to demonstrate **thread synchronization** using the `synchronized` keyword.  
The program:  
- Uses multiple threads to **increment a shared counter**  
- Ensures **safe access** to shared data to avoid race conditions  
- Displays the **final count** after all threads have completed execution  
- Illustrates **basic synchronization concepts** in Java multithreading

public class Syncs{
    private int c=0;
    public synchronized void count()
    {
        c++;
    }
    public synchronized int get()
    {
        return c;
    }
    public static void main(String[] args) throws InterruptedException{
        Syncs obj=new Syncs();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++)
            {
                obj.count();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 60; i++)
            {
                obj.count();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count:"+obj.get());
    }
}
