package Keywords;

public class super_method
{
    void eat()
    {
        System.out.println("im eating veg");
    }

}

class super_method2 extends super_method
{
    void eat()
    {
       // System.out.println("im eating non veg");
        super.eat();
    }

    public static void main(String[] args)
    {
        super_method2 sm=new super_method2();
        sm.eat();
    }
}
