## Banking System in Java  
Program to simulate a **banking system** with custom exception handling.  
The program:  
- Defines custom exceptions: `InvalidAmountException` and `InsufficientFundsException`  
- Implements **BankAccount** class with operations: `deposit`, `withdraw`, and `transfer`  
- Validates inputs and handles errors like **negative amounts, insufficient funds, and invalid accounts**  
- Demonstrates exception handling in **real banking scenarios**  
class InsufficientFundsException extends  Exception{
    private double balance;
    private double shortFall;
    public InsufficientFundsException(double balance,double shortFall)
    {
        super("Insufficient Funds:"+"\nBalance:"+balance+"\nShortfall:"+shortFall);
        this.balance=balance;
        this.shortFall=shortFall;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getShortFall()
    {
        return shortFall;
    }

}
class InvalidAmountException extends Exception{
    public InvalidAmountException(String message) {
        super(message);
    }
}
class BankAccount
{
private String accountId;
private double balance;
public BankAccount(String accountId,double balance) throws InvalidAmountException
{
    if(accountId==null||accountId.isEmpty())
    {
        throw new IllegalArgumentException("Error");
    }
    if(balance<0)
    {
        throw new InvalidAmountException("Invalid Balance amount");
    }
    this.accountId=accountId;
    this.balance=balance;
}
public void deposit(double amount) throws InvalidAmountException
{
    if(amount<=0)

        throw new InvalidAmountException("Amount won't be negative");
    balance+=amount;
    System.out.println("New Balance amount is:"+balance);
}
public void withdraw(double amount) throws InvalidAmountException,InsufficientFundsException
{
    if(amount<=0)
    {
        throw new InvalidAmountException("Amount won't be negative");
    }
    if(amount>balance)
        throw new InsufficientFundsException(balance,amount-balance);
    balance-=amount;
    System.out.println("The Remaining balance is:"+balance);
}
public void transfer(BankAccount target,double amount) throws InvalidAmountException,InsufficientFundsException
{
    if(target==null)
    {
        throw new IllegalArgumentException("The target should not be empty");
    }
    this.withdraw(amount);
    target.deposit(amount);
    System.out.println("The amount is transferred successfully");
}
public double getBalance()
{
    return balance;
}
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount b1 = null;
        BankAccount b2 = null;
        try {
            b1 = new BankAccount("a", 2000);
            b2 = new BankAccount("b", 1000);
            b1.deposit(100);
            b2.deposit(100);
            b1.withdraw(50);
            b1.transfer(b2, 200);
            System.out.println("The new Balance is:" + b1.getBalance());
            System.out.println("The new Balance is:" + b2.getBalance());
        } catch (Exception e) {
            System.out.println("Error for amount:\n" + e.getMessage());
        }
        try {
            b1.withdraw(5000);
        } catch (Exception e) {
            System.out.println("Error for withraw:\n" + e.getMessage());
        }
    }
}
