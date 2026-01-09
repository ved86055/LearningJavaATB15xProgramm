package Practise;

import java.util.Scanner;

public class pract
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");

        if (scanner.hasNextInt())
        {
            int num=scanner.nextInt();
            int fact=1;

            for (int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);

        }
        else {
            System.out.println("Enter integer");
        }







    }
}
