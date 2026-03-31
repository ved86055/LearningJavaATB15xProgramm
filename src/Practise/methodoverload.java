package Practise;

public class methodoverload
{
    int a =10;
    int b=122;
    public void addition()
    {
        System.out.println(a+b);
    }
    public void addition(int c,int d)
    {
        System.out.println(c+d);
    }

    public void addition(String nameofoperation)
    {
        System.out.println(nameofoperation);
    }
    public void addition(double f,double h)
    {
        System.out.println(f+h);
    }


    public static void main(String[] args)
    {

        methodoverload mo=new methodoverload();
        mo.addition();
        mo.addition(12,12);
        mo.addition(12.4,10.4);
        mo.addition("Sunnation logic");
    }


}
