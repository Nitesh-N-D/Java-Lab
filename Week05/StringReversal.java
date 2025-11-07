## String Reversal in Java
Reverses a user-input string using **character array swapping** and displays the reversed result.
import java.util.Scanner;

public class StringReversal {

public static void main(String[] args)

{

String str;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the string to reverse:");

str=sc.nextLine();

int n=str.length();

char[] c=str.toCharArray();

for(int i=0;i<n/2;i++)

{

int j=n-i-1;

char temp=c[i];

c[i]=c[j];

c[j]=temp;

}

System.out.println("The reversed string is:");

System.out.println(c);

}

}
