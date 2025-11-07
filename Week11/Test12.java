## Bank Account Interface Implementation in Java  
Demonstrates the use of an **interface** to define banking operations like deposit and withdrawal.  
Implements the `Account` interface in `SavingsAccount` to manage balance transactions.  
Highlights **abstraction**, **method implementation**, and **object-oriented design** in Java.  
#Java #Interfaces #Abstraction #BankingSystem #OOP

  
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Account {
    double balance = 1000;
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", Balance = " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        System.out.println("Withdrawn " + amount + ", Balance = " + balance);
    }
}

class Test12 {
    public static void main(String[] args) {
      
        Account a = new SavingsAccount();
        a.deposit(500);
        a.withdraw(300);
    }
}

