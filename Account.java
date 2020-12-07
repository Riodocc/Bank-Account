
import java.lang.*;

public  class Account implements Transactions
{
    protected int accountNumber;
    protected double balance;

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void showInfo()
    {
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+getBalance());
    }
    public void deposit(double balance,double amount)
    {
        if(amount>0)
        {
            System.out.println("Previous Balance: "+balance);
            System.out.println("Deposit Amount: "+amount);
            balance = balance + amount;
            System.out.println("Current Balance: "+balance);
        }
        else
        {
            System.out.println("Cannot Deposit");
        }
    }
    public void withdraw(double balance,double amount)
    {
        if(amount>0 && amount<=balance)
        {
            System.out.println("Previous Balance: "+balance);
            System.out.println("Withdraw Amount: "+amount);
            balance = balance - amount;
            System.out.println("Current Balance: "+balance);
        }
        else
        {
            System.out.println("Cannot Withdraw");
        }
    }
    public void transfer(Account a, double amount)
    {
        if(amount>0 && amount<=balance)
        {
            System.out.println("Previous Balance:	"+this.balance);
            System.out.println("Transfer Amount:	"+amount);
            this.balance = this.balance - amount;
            a.balance = a.balance + amount;
            System.out.println("Current Balance:	"+this.balance);
        }
        else
        {
            System.out.println("Cannot Transfer");
        }
    }
}