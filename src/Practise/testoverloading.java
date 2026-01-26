package Practise;

public class testoverloading
{
    int a =12;
    int b = 10;

    void multiply()
    {
        System.out.println(a*b);
    }

    void multiply(int x, int y)
    {
        System.out.println(x*y);

    }

    void multiply(int x, double y)
    {
        System.out.println(x*y);

    }

    void multiply(double x , double y)
    {
        System.out.println(x*y);
    }


    void multiply(int x, int y , int z)
    {
        System.out.println(x*y*z);
    }





}
