
import java.util.Arrays;

import java.util.Scanner;

public class Anagram

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.print("Enter 1st string:");

String str1=sc.nextLine();

System.out.print("Enter second string:");

String str2=sc.nextLine();

str1 = str1.replaceAll("\\s", "").toLowerCase();

str2 = str2.replaceAll("\\s", "").toLowerCase();

if (str1.length()==str2.length())

{

char[] arr1=str1.toCharArray();

char[] arr2=str2.toCharArray();

Arrays.sort(arr1);

Arrays.sort(arr2);

if (Arrays.equals(arr1,arr2))

{

System.out.println("The Strings are Anagram");

}

else {

System.out.println("The Strings are not an Anagram");

}

}

else

{

System.out.println("The Strings are not an Anagram");

}

sc.close();

}

}
