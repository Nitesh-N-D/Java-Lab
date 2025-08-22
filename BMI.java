import java.util.Scanner;
class Bmi
{
         public static void main(String[] args)
                       {
                            int w;
                            double h;
                            double bmi;
                            boolean status;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Name:N.D.Nitesh \nRoll.No:2024503529");
                            System.out.println("Enter the height(in m):");
                            h=sc.nextDouble();
                            System.out.println("Enter the weight(in kg):");
                            w=sc.nextInt();
                            bmi=w/(h*h);
                            if(bmi>=18.5 && bmi<25)
                            {
                                 System.out.println("BMI is normal");
                                 status=true;
                            }
                            else
                            {
                                 System.out.println("BMI is not normal");
                                 status=false;
                            }
                            System.out.println("BMI:"+bmi);
                            System.out.println("BMI Status is:"+status);
                       }
}
