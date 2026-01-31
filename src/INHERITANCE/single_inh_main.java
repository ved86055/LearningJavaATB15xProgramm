package INHERITANCE;

public class single_inh_main
{
    public static void main(String[]args)
    {
        single_inheritance2 sin=new single_inheritance2();

        System.out.println(sin.house);
        System.out.println(sin.amount);
        System.out.println(sin.money);

        System.out.println("--------------------------");

        sin.father();
        sin.son();

    }
}
