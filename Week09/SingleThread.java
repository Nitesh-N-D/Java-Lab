## Single-Thread Arithmetic Operations in Java  
Program to perform **arithmetic operations** using **threads**.  
The program:  
- Demonstrates **basic multi-threading** with `Thread` class  
- Performs **addition** and **subtraction** concurrently  
- Shows how **threads execute tasks independently** and simultaneously  

public class SingleThread {
    public static void main(String[] args) {
        Add obj1=new Add(5,3);
        Sub obj2=new Sub(5,3);
        obj1.start();
        obj2.start();
    }
}
class Add extends Thread{
    int num1,num2;
    Add(int a,int b)
    {
        num1=a;
        num2=b;
    }
    public void run()
    {
        System.out.println("The Sum is:"+(num1+num2));
    }
}
class Sub extends Thread{
    int num1,num2;
    Sub(int a,int b)
    {
        num1=a;
        num2=b;
    }
    public void run()
    {
        System.out.println("The Difference is:"+(num1-num2));
    }
}
