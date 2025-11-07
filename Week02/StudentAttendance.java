## Student Attendance Tracker in Java
Records daily attendance for multiple students, calculates **daily percentages**, and computes the **weekly attendance percentage**.
import java.util.Scanner;

public class StudentAttendance {

int[][] a = new int[5][8];

Scanner sc = new Scanner(System.in);


void attendance() {

for (int i = 0; i < 5; i++) {

System.out.println("Enter Attendance for day:" +(i+1));

for (int j = 0; j < 8; j++)

{

int c;

while(true)

{

System.out.println("Hour:"+(j+1));

c=sc.nextInt();

if(c==0||c==1)

break;

System.out.println("Invalid input.Enter 0 or 1");

}

a[i][j]=c;

}

}

}



float dailyAverage(int n) {

float sum = 0;

for (int i = 0; i < 8; i++) {

sum+= a[n][i];

}

float percentage = (sum / 8) * 100;

System.out.println("Day:"+(n+1)+" "+ "Attendance:"+percentage+"%" );

return percentage;

}


void weeklyPercentage() {

float total=0;

for (int i = 0; i < 5; i++) {

total+=dailyAverage(i);

}

float average=total/5;

System.out.println("The weekly percentage is:" + " " + average+ "%");

}

public static void main(String[] args)

{

int no;

System.out.println("Enter the no.of students:");

Scanner sc = new Scanner(System.in);

no=sc.nextInt();

StudentAttendance[] obj=new StudentAttendance[no];

for(int i=0;i<no;i++)

{

System.out.println("Entering attendance for Student:"+(i+1));

System.out.println("1 for present or 0 for absent");

obj[i] = new StudentAttendance();

obj[i].attendance();

obj[i].weeklyPercentage();

}

sc.close();}}
