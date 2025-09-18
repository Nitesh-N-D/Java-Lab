## MathCalculator in Java  
Program to demonstrate **custom exception handling** in mathematical operations.  
The program:  
- Calculates **power**, **factorial**, and **safe division** with validations  
- Throws appropriate exceptions like `IllegalArgumentException`, `ArithmeticException`, and `UnsupportedOperationException`  
- Handles cases such as **division by zero, negative factorial, invalid power operations, and overflow**  
public class MathCalculator {
    public static double calculatePower(int base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Base is zero and the exponent is negative");
        }
        if (base < 0 && exponent < 0) {
            throw new ArithmeticException("Both base and exponent are negative");
        }
        if (base == 0 && exponent == 0) {
            throw new UnsupportedOperationException("Both base and exponent are zero");
        }
        return Math.pow(base, exponent);
    }

    public static double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n is negative");
        }
        if (n > 20) {
            throw new ArithmeticException("n overflows");
        }
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static double safeDivide(double dividend, double divisor) {
        if (divisor == 0.0) {
            throw new ArithmeticException("Divisor is zero");
        }
        if (dividend == 0.0 && divisor == 0.0) {
            throw new IllegalArgumentException("Both dividend and divisor are zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
            System.out.println("Power(2,5):"+ calculatePower(2,3));
        System.out.println("Factorial of 5:"+factorial(5));
        System.out.println("Division:"+safeDivide(10,2));
        try
        {
            System.out.println("Power(0,-2):"+ calculatePower(0,-2));
        }
        catch(Exception e)
        {
            System.out.println("Power(0,-2):"+e.getMessage());
        }
        try
        {
            System.out.println("Power(-3,-2):"+ calculatePower(-3,-2));
        }
        catch(Exception e)
        {
            System.out.println("Power(-3,-2):"+e.getMessage());
        }
        try
        {
            System.out.println("Power(0,0):"+ calculatePower(0,0));
        }
        catch (Exception e)
        {
            System.out.println("Power(0,0):"+e.getMessage());
        }
        try
        {
            System.out.println("Factorial of -5:"+factorial(-5));
        }
        catch(Exception e)
        {
            System.out.println("Factorial of -5:"+e.getMessage());
        }
        try
        {
            System.out.println("Factorial of 25:"+factorial(25));
        }
        catch(Exception e)
        {
            System.out.println("Factorial of 25:"+e.getMessage());
        }
        try
        {
            System.out.println("Division of 5/0:"+safeDivide(5,0));
        }
        catch (Exception e){
            System.out.println("Division of 5/0:"+e.getMessage());
        }
        try
        {
            System.out.println("Division of 0/0"+safeDivide(0,0));
        }
        catch(Exception e)
        {
            System.out.println("Division of 0/0"+e.getMessage());
        }

    }
}
