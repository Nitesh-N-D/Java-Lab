import java.util.Scanner;

public class Login {


public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

int failCount=0;

while(true)

{

System.out.println("Enter the username(type 'exit' to exit):");

String username=sc.nextLine();

if(username.toLowerCase().equals("exit"))

{

break;

}

System.out.println("Enter password:");

String password=sc.nextLine();

boolean isPasswordCorrect=password.equals("1234");

if(!username.equals("admin")&&!isPasswordCorrect)

{

failCount++;

System.out.println("Login failed"+"\n"+"Failurecount is:"+failCount);

}

else

{

System.out.println("Login proceeds");

}

}

System.out.println("Total failcounts is:"+failCount);

sc.close();

}

}
