## Student Result Calculator in Java
Calculates **total, average, grade**, and **pass/fail status** based on marks for three subjects.
import java.util.Scanner;
class Result
{
  public static void main(String[] args)
     {
        float m1,m2,m3;
        float avg;
        float tot;
        boolean pass;
        char grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for the 3 subjects:");
        m1=sc.nextFloat();
        m2=sc.nextFloat();
        m3=sc.nextFloat();
        tot=m1+m2+m3;
        avg=tot/3;
        pass=(m1>=50)&&(m2>=50)&&(m3>=50);
        if(!pass)
        {
           grade='U';
        }
        else if(avg>=90)
        {
           grade='S';
        }
        else if(avg>=80)
        {
           grade='A';
        }
        else if(avg>=70)
        {
           grade='B';
        }
        else if(avg>=60)
        {
           grade='C';
        }
        else if(avg>=50)
        {
           grade='D';
        }
        else
        {
           grade='U';
        }
        System.out.println("Total Marks:"+tot);
        System.out.println("Average:"+avg);
        System.out.println("Grade:"+grade);
        System.out.println("Pass status:"+pass);
 }
}

