## Multi-Thread Prime Number Finder in Java  
Program to find **prime numbers** in a specified range using **multiple threads**.  
The program:  
- Divides the range into parts and assigns each to a **separate thread**  
- Checks each number for primality using **trial division**  
- Measures and displays the **execution time** for multi-threaded computation  
- Demonstrates the **performance improvement** using **concurrent execution**

class Prime extends Thread 
{
    int start;
    int end;
    Prime(int start, int end) {
        this.start=start;
        this.end=end;
    }
    public void run() {
        for (int i=start;i<=end;i++)
         {
            if (isPrime(i)) {
            }
        }
    }
    boolean isPrime(int num)
     {
        if(num<=1) 
        return false;
        for(int i=2;i*i<=num;i++) 
        {
            if(num%i==0) 
            return false;
        }
        return true;
    }
}
public class MultiThread {
    public static void main(String[] args) {
        int start=1;
        int end = 10000;  
        int mid=(start+end)/2; 
        System.out.println("Finding prime numbers using Multiple Threads");
        long startingtime=System.currentTimeMillis(); 
        Prime t1 = new Prime(start,mid);
        Prime t2 = new Prime(mid+1,end);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endingtime=System.currentTimeMillis();
        System.out.println("Multi thread execution time: "+(endingtime-startingtime)+" ms");
    }
}
