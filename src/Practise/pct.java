package Practise;

public class pct
{

    public class test
    {
        String name="arati";

    }

    class test21 extends Practise.test
    {
        String name="ved";

        void display()
        {
            // System.out.println(name);
            System.out.println(super.name);
        }

        public static void main(String []args)
        {
            Practise.test21 t21=new Practise.test21();
            t21.display();
        }
    }

}
