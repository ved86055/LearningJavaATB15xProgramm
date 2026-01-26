package POLYMORPHISM;

public class Method_overloading
{
    int a=12;
    int b=23;

    void sum()              // 1st >>>>>>>>>>.0 para
    {
        System.out.println(a+b);
    }

    void sum(int x, int y)        // 2nd >>>>>>>>>>> 2 para
    {
        System.out.println(x+y);
    }


    void sum(int x, double y)        // 3rd >>>>>>>> diferent datatype of para
    {
        System.out.println(x+y);
    }

    void sum(double x, int y)          // 4th >>>>>>>>>>>order of para chaanged
    {

        System.out.println(x+y);
    }

    void sum(int x,int y , int z)     // 5th >>>>>>>>>>>>> 3 para
    {
        System.out.println(x+y+z);
    }





}
