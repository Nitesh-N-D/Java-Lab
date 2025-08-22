import java.util.Scanner;

public class StringCompression

{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.print("Enter a string:");

String str = sc.nextLine();

StringBuilder compressed = new StringBuilder();

int count = 1;

for(int i=0;i<str.length();i++)

{

if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))

{

count++;

}

else

{

compressed.append(str.charAt(i)).append(count);

count = 1;

}

}

System.out.println("The Compressed string is:"+(compressed.length()<str.length()?compressed:str));

sc.close();

}

}
