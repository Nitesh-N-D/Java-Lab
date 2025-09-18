## DivisionByZero in Java  
Program to demonstrate **exception handling** in Java.  
The program:  
- Handles **ArithmeticException, NullPointerException, NumberFormatException, InputMismatchException**  
- Uses **try–catch–finally** blocks to manage runtime errors  
- Shows cases like **division by zero, invalid input, null access, and string parsing**  
import java.util.Scanner;
public class DivisionByZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=4/2;
        System.out.println("I am executable "+ "a: "+a);
        double b=5.0/0;
        System.out.println("I am executable "+"b: "+b);
        try {
            int c = 5 / 0;
        } catch(ArithmeticException ae)
        {
            System.out.println(ae+"I am at  Arithmetic catch block");
        }
        try{
            System.out.println("Enter a number:");
            int str1=sc.nextInt();
        }
        catch(java.lang.Exception e)
        {
            System.out.println("Error:"+e);
        }
        String str=null;
        try
        {
            System.out.println(str.length());
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne+"I am at catch block");
        }
        String s="Next";
        try
        {
            int n=Integer.parseInt(s);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe + " Number format exception catch block");
        }
        finally
        {
            System.out.println("I am executable");
        }
    }
}
