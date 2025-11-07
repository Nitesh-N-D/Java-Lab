## String Comparison in Java
Compares two strings in **dd.mm.ss format** and determines which one is greater or if they are equal.
import java.util.Scanner;

public class StringCompare

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.print("Enter first string in format(dd.mm.ss):");

String str1=sc.nextLine();

System.out.print("Enter second string in format(dd.mm.ss):");

String str2=sc.nextLine();

String[] arr1=str1.split("\\.");

String[] arr2=str2.split("\\.");

boolean isGreater=false;

for (int i=0;i<arr1.length;i++)

{

if(arr1[i].compareTo(arr2[i])>0)

{

isGreater=true;

break;

}

else if(arr1[i].compareTo(arr2[i])<0)

{

isGreater=false;

break;

}

}

if(isGreater)

{

System.out.println(str1+" is greater than "+str2);

}

else if(!isGreater&&!str1.equals(str2))

{

System.out.println(str2 +" is greater than "+str1);

}

else

{

System.out.println("Both strings are equal");

}

sc.close();

}

}
