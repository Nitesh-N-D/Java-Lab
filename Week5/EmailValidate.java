## Email Validation in Java
Validates email addresses, checks format and domain, and extracts the **username** and **domain** if valid.
import java.util.Scanner;

public class EmailValidate

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.print("Enter email: ");

String email=sc.nextLine();

if(isValidEmail(email))

{

System.out.println("Valid Email");

String[] parts=email.split("@");

String username=parts[0];

String domain=parts[1];

System.out.println("Username:"+username);

System.out.println("Domain:"+domain);

}

else

{

System.out.println("Invalid Email");

}

sc.close();

}

public static boolean isValidEmail(String email)

{

if(email.length()>25||email.indexOf('@')==-1||email.indexOf('@')!=email.lastIndexOf('@'))

{

return false;

}

String[] parts=email.split("@");

if(parts.length!=2)

{

return false;

}

String username=parts[0];

String domain=parts[1];

if(!username.matches("[a-zA-Z0-9_\\-+]+"))

{

return false;

}

if(!(domain.endsWith(".com")||domain.endsWith(".in")||domain.endsWith(".edu")))

{

return false;

}

String domainName=domain.substring(0, domain.lastIndexOf('.'));

if(!domainName.matches("[a-zA-Z0-9.-]+"))

{

return false;

}

return true;

}

}
