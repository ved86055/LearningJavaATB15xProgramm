package This_Super.supe;


public class childDemo extends parentDemo
{
    String name="ram";

    public childDemo()
    {
        super(); // to access parent class constructor
        System.out.println("constructor from child demo class");
    }


    public void m1()
    {
        System.out.println("metod m1 from child ");
        System.out.println(super.name);
        System.out.println(name);

    }

    public void getData()
    {
        System.out.println("metod getDta from child ");
        super.getData();
    }

    public static void main(String[] args)
    {
        childDemo ch=new childDemo();

        ch.getData();
        ch.m1();
    }
}
