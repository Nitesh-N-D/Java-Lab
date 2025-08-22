
import java.util.Scanner;

import java.util.HashMap;

public class Occurrences {

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

String str;

System.out.println("Enter the string:");

str=sc.nextLine();

HashMap<Character,Integer>map=new HashMap<>();

for(char c:str.toCharArray())

{

map.put(c,map.getOrDefault(c,0)+1);

}

System.out.println("The number of occurrences is:");

System.out.println(map);

}

}
