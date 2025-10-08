## Single-Thread Prime Number Finder in Java  
Program to find **prime numbers** in a specified range using a **single thread**.  
The program:  
- Checks each number for primality using a simple **trial division** method  
- Measures and displays the **execution time** for the computation  
- Demonstrates **basic performance timing** in Java

public class SingleThreadPrime {
    public static void main(String[] args) {
        int start=1;
        int  end=10000; 
        System.out.println("Finding the prime numbers using Single Thread");
        long startingtime=System.currentTimeMillis(); 
        for(int i=start;i<=end;i++) 
        {
            if (isPrime(i)) {
            }
        }
        long endingtime=System.currentTimeMillis();
        System.out.println("Single thread execution time: "+(endingtime - startingtime) + " ms");
    }
    static boolean isPrime(int num) 
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
