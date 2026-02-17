package Practise;

public class sample1
{
    int a,b;

    sample1()
    {
         a=12;
         b=13;
    }

    sample1(int c,int d)
    {
        a=c;
        b=d;
    }

    void add()
    {
        System.out.println(a+b);
    }

    public static  void main(String[]args)
    {
        sample1 s1=new sample1();
                s1.add();


    }








}
