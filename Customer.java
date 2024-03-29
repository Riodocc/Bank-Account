import java.lang.*;

public class Customer implements AccountOperations
{
    private String name;
    private int nid;
    static Account accounts[] = new Account [10];

    public void setName(String name)
    {
        this.name = name;
    }
    public void setNid(int nid)
    {
        this.nid = nid;
    }
    public void setAccount(Account accounts[])
    {
        this.accounts=accounts;
    }

    public String getName()
    {
        return name;
    }
    public int getNid()
    {
        return nid;
    }
    public Account[] getAccount()
    {
        return accounts;
    }

    public void insertAccount(Account a)
    {
        int flag = 0;
        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] == null)
            {
                accounts[i] = a;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Account Inserted");
        }
        else
        {
            System.out.println("Cannot Insert");
        }
    }

    public void removeAccount(Account a)
    {
        int flag = 0;
        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] == a)
            {
                accounts[i] = null;
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Account Removed");
        }
        else
        {
            System.out.println("Cannot Remove");
        }
    }
    public void showAllAccounts()
    {
        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] != null)
            {
                accounts[i].showInfo();
            }
        }
    }
    public Account getAccount(int accountNumber)
    {
        Account a = null;

        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] != null)
            {
                if(accounts[i].getAccountNumber() == accountNumber)
                {
                    a = accounts[i];
                    break;
                }
            }
        }
        if(a != null)
        {
            System.out.println("Account Found");
        }
        else
        {
            System.out.println("Account Not Found");
        }
        return a;
    }
}
