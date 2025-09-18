## Complex Number Operations in Java  
Program to perform **arithmetic operations on complex numbers**.  
The program:  
- Implements **addition, subtraction, multiplication, and division** for complex numbers  
- Checks for **equality** between two complex numbers  
- Uses **toString()** to display complex numbers in standard `a+bi` or `a-bi` format  
- Demonstrates object-oriented design with **methods returning new ComplexNumber objects**  
public class ComplexNumber {
    private double real,imaginary;
    public ComplexNumber(double real,double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public ComplexNumber add(ComplexNumber other)
    {
        double newReal=this.real+other.real;
        double newImaginary=this.imaginary+other.imaginary;
        return new ComplexNumber(newReal,newImaginary);
    }
    public ComplexNumber subtract(ComplexNumber other)
    {
        double newReal=this.real-other.real;
        double newImaginary=this.imaginary-other.imaginary;
        return new ComplexNumber(newReal,newImaginary);
    }
    public ComplexNumber multiply(ComplexNumber other)
    {
      double newReal=(this.real*other.real)-(this.imaginary*other.imaginary);
      double newImaginary=(this.real*other.imaginary)+(this.imaginary*other.real);
      return new ComplexNumber(newReal,newImaginary);
    }
    public ComplexNumber divide(ComplexNumber other)
    {
        double newReal=((this.real* other.real)+(this.imaginary* other.imaginary))/((other.real*other.real)+(other.imaginary *other.imaginary));
        double newImaginary=((this.imaginary* other.real)-(this.real*other.imaginary))/((other.real*other.real)+(other.imaginary* other.imaginary));
        return new ComplexNumber(newReal,newImaginary);
    }


    boolean isEqual(ComplexNumber other)
    {
        return (this.real== other.real && this.imaginary== other.imaginary);
    }


    public String toString()
    {
        if(imaginary<0)
        {
            return real+""+imaginary+"i";
        }
        else
        {
            return real+"+"+imaginary+"i";
        }
    }
    public static void main(String[] args)
    {
        ComplexNumber c1=new ComplexNumber(3,4);
        ComplexNumber c2=new ComplexNumber(1,-2);
        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);
        ComplexNumber sum=c1.add(c2);
        System.out.println("Sum: "+sum);
        ComplexNumber difference=c1.subtract(c2);
        System.out.println("Difference: "+difference);
        ComplexNumber product=c1.multiply(c2);
        System.out.println("Product: "+product);
        ComplexNumber quotient=c1.divide(c2);
       System.out.println("Quotient: "+quotient);
        boolean isEqual=c1.equals(c2);
        System.out.println("c1 equals c2: "+isEqual);

    }
}
