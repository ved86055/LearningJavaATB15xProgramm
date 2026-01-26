package Method;

public class static_nonstatic_method
{
    int age =12;
    static int age1 =14;


    public static void main(String[] args)
    {
       //calling static variabl;e
        System.out.println(age1);


        // calling non static variable
        static_nonstatic_method snm=new static_nonstatic_method();

        System.out.println(snm.age);


        //calling static method:from same class
        test();

        //calling non static method by

        static_nonstatic_method snm1=new static_nonstatic_method();
        snm1.practise();

    }

    static void test()
    {
        int a =10;
        int b =12;
        int c =a+b;
        System.out.println(c);

    }
    void practise()
    {
        int x =12;
        int y=12;
        int z=13;
        int g=x+y+z;
        System.out.println(g);

    }






}
