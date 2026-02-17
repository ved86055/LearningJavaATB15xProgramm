package Practise;


public class sample7
{
    int result;
    sample7()
    {
        result =0;
    }
    sample7(int a)
    {
       result=a;
    }
    sample7(String b)
    {
        result=b.length();
    }
    sample7(int h,int k)
    {
        result=h+k;
    }

    void show()
    {
        System.out.println(result);
    }


    public static  void main(String[]args)
    {
        sample7 s7 =new sample7("ved");
        s7.show();

        sample7 s8=new sample7(12);
        s8.show();



        sample7 s9=new sample7(12,12);
        s9.show();


        sample7 s0=new sample7();
        s0.show();

    }
}
