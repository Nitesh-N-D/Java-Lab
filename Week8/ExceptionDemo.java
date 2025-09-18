## Exception Overriding in Java  
Program to demonstrate **method overriding rules with exceptions**.  
The program:  
- `SuperClass` method declares a **checked exception** (`Exception`)  
- `SubClass` overrides the method and throws an **unchecked exception** (`ArithmeticException`)  
- Shows how overridden methods can replace checked exceptions with **runtime exceptions**  
- Demonstrates exception handling using **try–catch**  
class SuperClass {
    public void performTask() throws Exception {
        System.out.println("SuperClass exception");
        throw new Exception("General Exception from SuperClass");
    }
}

class SubClass extends SuperClass {
    @Override
    public void performTask() {
        System.out.println("SubClass exception");
        throw new ArithmeticException("Division by zero occurred");
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        SuperClass obj=new SubClass(); 
           try {
            obj.performTask();   
        } 
        catch (Exception e)
         {  
            System.out.println("Exception:"+e);
        }
    }
}
