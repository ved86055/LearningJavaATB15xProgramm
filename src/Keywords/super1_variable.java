package Keywords;

public class super1_variable
{
    String color="black";

}
class super2 extends super1_variable
{

    String color ="white";

    void display()
    {
        System.out.println(super.color);
    }

    public static void main(String[] args)
    {
        super2 s2=new super2();
        s2.display();
    }
}
