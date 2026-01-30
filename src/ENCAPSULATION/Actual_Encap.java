package ENCAPSULATION;

public class Actual_Encap
{
    private String name;
    private int accno;
    private int balance;


    void setAccnot(int accno)
    {
        this.accno=accno;

    }

    int getAccount()
    {
        return accno;
    }

    void setName(String name)
    {
        this.name=name;

    }

    String getName()
    {
        return name;

    }

    void setBalance(int balance,boolean iscashier)
    {
        if (iscashier)
        {
            this.balance = balance;
        }
        else {
            System.out.println("User is not cashier cant set acc balance");
        }
    }

    int  getBalance()
    {
        return balance;
    }










}
