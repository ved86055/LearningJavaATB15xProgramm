package Practise;

public class sample2
{
    int p,q;
    sample2()
    {
        p=100;
        q=100;
    }

    sample2 (int w,int v)
    {
        p=w;
        q=v;
    }
    void addition()
    {
        System.out.println(p+q);
    }

    public static  void main(String[]args)
    {
        sample2 s2=new sample2(122,222);
        s2.addition();

        sample2 s3=new sample2();
        s3.addition();
    }
}
