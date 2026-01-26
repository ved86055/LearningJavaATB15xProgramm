package Practise;

public class overloading
{
    int a,b=10;

    void sum()
    {
        System.out.println(a+b);
    }
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
    void sum(int y,double x)
    {
        System.out.println(y+x);
    }
}
