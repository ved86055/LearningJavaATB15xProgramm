package Keywords;

public class Thiss
{
    int money;
    String name;


    void   m1(int money)
    {
       this.money=money;
    }
    void m2(String name)
    {
        this.name=name;
    }

    void display()

    {
        System.out.println(money);
        System.out.println(name);
    }


    public static void main(String[] args)
    {

        Thiss th=new Thiss();
        th.m1(124);
        th.m2("ved");
        th.display();
    }


}
