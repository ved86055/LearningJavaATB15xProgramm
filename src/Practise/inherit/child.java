package Practise.inherit;

public class child  extends Parent
{
    public void plot()
    {
        System.out.println("child is having plot");
    }

    public static void main(String[] args)
    {
        child ch=new child();
        ch.car();
        ch.home();
        ch.plot();
    }
}
