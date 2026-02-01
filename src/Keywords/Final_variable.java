package Keywords;

public class Final_variable
{
   final int a=10;            //final variable



    void m1()
    {
        int a=12;
    }


    public static void main(String[] args)
    {

        Final_variable f=new Final_variable();
     //   f.a=122;                                //in case of not using final 122
        System.out.println(f.a);

    }
}
