import java.util.Scanner;

public class VowelCount {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

String str;

System.out.println("Enter a string:");

str=sc.nextLine();

str=str.toLowerCase();

char[] chars=str.toCharArray();

int a=0,e=0,i=0,o=0,u=0;

for(int j=0;j<chars.length;j++)

{

char ch=chars[j];

switch(ch)

{

case 'a':

a++;

break;

case 'e':

e++;

break;

case 'i':

i++;

break;

case 'o':

o++;

break;

case 'u':

u++;

break;

}

}

System.out.println("Vowel frequencies is:");

System.out.println("a:"+a+"\n"+"e:"+e+"\n"+"i:"+i+"\n"+"o:"+o+"\n"+"u:"+u);

sc.close();

}

}
