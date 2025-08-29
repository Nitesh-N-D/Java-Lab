import java.util.Scanner;

public class BankAccount {

static int totalAccount;

private int accountNumber;

private float balance;

BankAccount(int accountNumber,float balance)

{

this.accountNumber=accountNumber;

this.balance=balance;

totalAccount++;

}

public void deposit(int amount)

{

if(amount<0)

{

System.out.println("Invalid,Enter the current amount\n");

return;

}

else

{

int depositAmount=0;

depositAmount=amount;

balance=balance+amount;

}

}


public void display()

{

System.out.println("Account Number:"+accountNumber+" \n"+"Balance:"+balance);

}

public static void setTotalAccount()

{

System.out.println("Total Accounts:"+totalAccount);

}


public static void main(String[] args)

{

BankAccount a=new BankAccount(123,456);

BankAccount b=new BankAccount(234,678);

BankAccount c=new BankAccount(100,956);

a.deposit(457);

b.deposit(23);

c.deposit(200);

a.display();

b.display();

c.display();

setTotalAccount();

}

}
