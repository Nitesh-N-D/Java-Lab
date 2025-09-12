## Word Count in Java
Counts the **number of words** in a user-input string, ignoring extra spaces.
import java.util.Scanner;

public class WordCount {

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

System.out.print("Enter a string:");

String str=sc.nextLine();

String[] words=str.split(" ");

int count = 0;

for (String word:words)

{

if (!word.isEmpty())

{

count++;

}

}

System.out.println("Number of words:" +count);

sc.close();

}

}
