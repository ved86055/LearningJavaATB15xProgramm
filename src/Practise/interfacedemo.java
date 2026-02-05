package Practise;

interface operations
{
    int x=10;
    int y=20;

    void addition();

    static void multiply()
    {
        System.out.println("multiply mthod");
    }

    default void substraction()
    {
        System.out.println("sub method");
    }

}

public class interfacedemo implements operations
{


    public void addition()
    {
        System.out.println("adition abstract method");
    }

    void divide()
    {
        System.out.println("this is one more method ");
    }

    public static void main(String[] args)
    {
        interfacedemo inter=new interfacedemo();
        System.out.println(operations.x+operations.y);
        inter.addition();
        inter.divide();
        inter.substraction();
        operations.multiply();

    }

    }




