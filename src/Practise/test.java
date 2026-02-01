package Practise;

public class test
{
    String name="arati";

}

class test21 extends test
{
    String name="ved";

    void display()
    {
       // System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String []args)
    {
        test21 t21=new test21();
        t21.display();
    }
}
