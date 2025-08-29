import java.util.Scanner;
class BankAccounts
{
    String name;
    double balance;
    BankAccount(String name,double balance)
    {
        this.name=name;
        this.balance=balance;
    }
    BankAccount deposit(double amount)
    {
        if(amount>0)
        {
            this.balance+=amount;
             System.out.println("Deposited:"+amount);
        }
        else{
             System.out.println("Invalid amount");
            
         } return this;
        }
        BankAccount withdraw(double amount)
        {
            if(amount>0 && amount<=this.balance)
            {
                this.balance-=amount;
                 System.out.println("Withdrawal:"+amount);
            }
            else
            {
                 System.out.println("Invalid amount");
                 return this;
            }
            return this;
        }
        BankAccount transfer(BankAccount receiver,double amount)
        {
            if(amount>0 && this.balance>=amount)
            {
                this.balance-=amount;
                receiver.balance+=amount;
                 System.out.println("Transferred "+amount+ " amount to "+receiver.name);
            }
            else
            {
                 System.out.println("Transfer failed");
                 return this;
            }
            return this;

        }
        void display()
        {
             System.out.println("Name:"+this.name);
              System.out.println("Balance:"+this.balance);
        }

    }
public class BankObject3  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount b1=new BankAccount("Harish",5000 );
        BankAccount b2=new BankAccount("Akash", 3000);
        b1.deposit(2000).withdraw(1000).transfer(b2,5500).display();
         System.out.println("Receiver:\n");
        b2.display();
        sc.close();
    }
    
}
