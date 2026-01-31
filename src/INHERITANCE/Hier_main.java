package INHERITANCE;

public class Hier_main
{
    public static void main(String[] args)
    {
        Hierarchical2 h2=new Hierarchical2();
        h2.anna();
        System.out.println(h2.farmana);
        h2.kumar();
        System.out.println(h2.farm);


        System.out.println("-----------------------------------");

        Hieraechical3 h3=new Hieraechical3();
        System.out.println(h3.farmana);
        System.out.println(h3.property);

        h3.anna();
        h3.gopal();




    }
}
