package Practise;

public class Test21
{
     private String name;
   private  String branch;
    private int accno;
    private int balance;


    void setName(String name)
    {
        this.name=name;

    }

    String getName()
    {
        return (name);
    }

    void setAccno(int accno)
    {
        this.accno=accno;
    }

    int  getAccno()
    {
        return(accno);
    }

    void setBalance(int balance, boolean isCashier)

    {
        if (isCashier)
        {
        this.balance=balance;
        }
        else
        {
            System.out.println("user is not cashier cant set ");

     }
    }

    int  getBalance()
    {
        return (balance);
    }
}
