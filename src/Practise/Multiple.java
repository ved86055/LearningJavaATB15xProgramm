package Practise;

 interface i10
{
    int a=12;
    int b =123;

    void m1();
}

 interface i11
{
    void m2();
}

class again
{
    void m4()
    {
        System.out.println("ved");
    }
}

public class Multiple extends again implements i10 ,i11
{

    public void m1()
    {
        System.out.println(a);
    }

   public void m2()
    {
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Multiple m=new Multiple();
        m.m1();
        m.m2();
        m.m4();
        System.out.println(i10.a+ i10.b);

    }

}
