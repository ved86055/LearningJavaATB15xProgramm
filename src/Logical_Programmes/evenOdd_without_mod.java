package Logical_Programmes;

public class evenOdd_without_mod
{

    public static void main(String[] args)
    {
        int num=7;
        while (num>1)
        {
            num=num-2;
        }
        if (num==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
