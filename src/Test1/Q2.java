package Test1;

/* Description:
Write a Java program to check whether a given number is even or odd using arithmetic operators. */


import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
      /*int num =44;

        if ( num %2==0)
        {
            System.out.println("given num is even");
        }
        else
        {
            System.out.println("given num is odd");
        }
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");

        int Num=scanner.nextInt();

        if (Num %2==0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }


    }
}
