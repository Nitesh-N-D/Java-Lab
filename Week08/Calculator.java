## Calculator in Java  
Program to demonstrate **exception handling** in arithmetic operations.  
The program:  
- Converts user input strings into integers using `Integer.parseInt()`  
- Performs **division** and handles `ArithmeticException` (e.g., division by zero)  
- Catches `NumberFormatException` for invalid numeric input  
- Uses a **finally block** to ensure execution of cleanup messages  
import java.util.Scanner;
public class Calculator{
    public static int divide(int a, int b) {
        return a/b;
    }
    public static int toInteger(String str) {
        return Integer.parseInt(str);
    }

    public static void calculate(String num1, String num2) {
        int a=toInteger(num1);   
        int b=toInteger(num2);   
        int result=divide(a, b);
        System.out.println("Result:"+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        String i1=sc.nextLine();
        System.out.println("Enter second number: ");
        String i2=sc.nextLine();

        try {
            calculate(i1, i2);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: " + nfe);
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae);
        } finally {
            System.out.println("Final Block Executed");
        }
    }
}
