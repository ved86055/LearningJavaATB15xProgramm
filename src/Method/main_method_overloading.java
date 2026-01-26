package Method;

public class main_method_overloading
{
    void main(String s)
    {

        System.out.println(s);
    }

     void main(int a)
    {

        System.out.println(a);
    }

    void main(String s , String t)
    {
        System.out.println(s+t);
    }


    public static void main(String[] args)
    {
        main_method_overloading mmo=new main_method_overloading();
       mmo.main(1);
       mmo.main("ved ", "hello");
       mmo.main("ram");

    }
}
