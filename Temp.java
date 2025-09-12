## Celsius to Fahrenheit Converter in Java
Converts temperature from **Celsius to Fahrenheit** and indicates if it is considered **hot** (F > 100).
import java.util.Scanner;
class Temp
{ 
    public static void main(String[] args)
         {
            double c,f;
            boolean hot;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the temperature(in Celsius):");
            c=sc.nextDouble();
            f=(c*9/5)+32;
            hot=f>100;
            System.out.println("Temperature:"+c+"C"+"("+f+"F)");
            System.out.println("Hot:"+hot);
          }
}

