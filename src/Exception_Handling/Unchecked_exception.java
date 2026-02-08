package Exception_Handling;

import java.util.Scanner;

public class Unchecked_exception
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int ar[]=new int[5];
        try{

        System.out.println("Print numbwer between 0-4");

        int position=sc.nextInt();

        System.out.println("print value for corresponding position");


        int value=sc.nextInt();

        ar[position]=value;

        System.out.println(ar[position]);}
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }









    }
}
