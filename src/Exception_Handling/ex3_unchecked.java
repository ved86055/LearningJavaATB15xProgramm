package Exception_Handling;

import java.util.Scanner;

public class ex3_unchecked
{

    public static void main(String[] args)
    {
        System.out.println("programme is started ");

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number ");

        int num=sc.nextInt();

        try
        {

        System.out.println(100/num);
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {

            System.out.println("this finally has to be printed ");
        }


        System.out.println("progreamme is completed ");

        System.out.println("exited thr progremme");




    }


}
