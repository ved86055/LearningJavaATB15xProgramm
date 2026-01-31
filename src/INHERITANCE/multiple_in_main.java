package INHERITANCE;

public class multiple_in_main
{
    public static void main(String[] args)
    {
        multiple_inheritance mul=new multiple_inheritance();
        System.out.println(mul.house);                    //father
        System.out.println(mul.amount);           //father
        System.out.println(mul.money);          //son
        System.out.println(mul.vehicle);        //son

        System.out.println(mul.thing);        //grandson


        System.out.println("---------------------------");

        //method

        mul.grandson();
        mul.father();
        mul.son();

    }
}
