package Logical_Programmes;

import java.util.Scanner;

public class Factorial_UserInput
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");

        if (scanner.hasNextInt())
        {
            int num=scanner.nextInt();
            int fact=1;   //fact is initialized to 1 because factorial is based on multiplication and 1 is the identity value; also, 1! equals 1.

            for (int j=1;j<=num;j++)
            {
                fact=fact*j;
            }
            System.out.println("Factorial of "+ num + "  is " + fact );


        }

        else {
            System.out.println("please enter integer value");
        }





    }
}
