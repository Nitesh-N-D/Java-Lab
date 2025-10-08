## Multi-Thread Arithmetic Operations using Runnable in Java  
Program to perform **arithmetic operations** using the **Runnable interface**.  
The program:  
- Demonstrates **multi-threading with Runnable**  
- Performs **addition** and **subtraction** concurrently  
- Shows **thread execution**, including sleep/delay and looped output  
- Illustrates how **threads can run independently** while performing tasks

public class Test {
    public static void main(String[] args) {
        Adds obj1=new Adds(8,7);
        Subs obj2=new Subs(19,8);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
class Adds implements Runnable{
    int num1,num2;
    Adds(int a,int b)
    {
        num1=a;
        num2=b;
    }
    public void run()
    {
        try{
            Thread.sleep(2000); }
        catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
        System.out.println("The Sum is:"+(num1+num2));
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

    }

}
class Subs implements Runnable{
    int num1,num2;
    Subs(int a,int b)
    {
        num1=a;
        num2=b;
    }
    public void run()
    {
        System.out.println("The Difference is:"+(num1-num2));
    }
}
