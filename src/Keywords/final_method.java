package Keywords;

class test1
{

    final void m()
    {
        System.out.println("this is m1");
    }

}

class test2 extends test1
{

    void m1()            // cant override method in child class if final usd
    {
        System.out.println("this is m2 method ");
    }

}

public class final_method
    {
        public static void main(String[] args)
    {

        test2 t2=new test2();
        t2.m1();





    }
    }







