package Practise;

import java.util.Scanner;

public class exc
{
    public static void main(String[] args)
    {

        System.out.println("programme is started ");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number ");

        int num=sc.nextInt();


        try {
        System.out.println(100/num);}

        catch (ArrayIndexOutOfBoundsException array)
        {
            array.printStackTrace();
        }

        catch (ArithmeticException a)
        {
            a.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("check the numer entered");
        }


        System.out.println("programme finishes ");






    }
}
