package Practise;

public class overloadingmain
{
    public static void main(String[] args)
    {
        testoverloading to=new testoverloading();
        to.multiply();
        to.multiply(3,4);
        to.multiply(1,2.3);
        to.multiply(2.1,3.2);
        to.multiply(1,1,2);
    }
}
