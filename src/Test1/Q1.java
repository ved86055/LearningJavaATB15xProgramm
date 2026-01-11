package Test1;
//Write a Java program that takes two
// integer numbers and prints their sum, difference, multiplication, division, and remainder.

import java.util.Scanner;

public class Q1
{

    public static void main(String[] args)
    {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1=scanner.nextInt();
        System.out.println("Enter number 2");
        int number2=scanner.nextInt();

        System.out.println(" sum : " + (number2 + number1) );

        System.out.println("Difference : "+(number2-number1));


         System.out.println("Multiplication: "+ (number2 *number1));

        if (number2 !=0)
        {
            System.out.println("Divison : "+ (number1 / number2));
            System.out.println("Remainder :"+ (number1 % number2));
        }



    }
}
