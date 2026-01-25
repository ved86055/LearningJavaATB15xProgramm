package Constructor;

public class constructorDemo
{

    int x,y;

    constructorDemo()   // default constructor
    {

         x=100;
         y=200;
    }

    void sum()
    {
        System.out.println(x+y);
    }


    constructorDemo(int a , int b)  //parameterised constructor
    {
        x=a;
        y=b;
    }

    public static void main(String[] args)
    {

    //    constructorDemo cd=new constructorDemo();    // invoke default constructor
        constructorDemo cd =new constructorDemo(11,12);     // invoke parameterised c
        cd.sum();
    }
}

