## Vaccination Eligibility Checker in Java
Checks patient eligibility based on age, assigns appointment slots, and provides gifts based on the last digit of a 3-digit appointment number.
import java.util.Scanner;

public class Eligibility {

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.println("Enter the no.of patients:");

int no=sc.nextInt();

for(int i=1;i<=no;i++)

{

System.out.println("Patient:"+i);

System.out.println("Enter age:");

int age=sc.nextInt();

if(age>=18&&age<=65)

{

System.out.println("Eligible for vaccination");

System.out.println("Enter 3-digit appt number:");

int apptno=sc.nextInt();

if(apptno>=100 && apptno<=999)

{

if(apptno%2==0)

{

System.out.println("Assigned to priority slot");

}

else

{

System.out.println("Assigned to regular slot");

}

int ldigit=apptno%10;

switch(ldigit)

{

case 1:

System.out.println("Gift:Pen");

break;

case 2:

System.out.println("Gift:Mask");

break;

case 3:

System.out.println("Gift:Sanitizer");

break;

default:

System.out.println("No special gifts");

}

}

else

{

System.out.println("Invalid appointment number");

}

}

else

{

System.out.println("Not eligible for vaccination");

} 
}
sc.close();
}
}
