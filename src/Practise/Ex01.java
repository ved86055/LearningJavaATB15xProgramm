package Practise;

import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1 =scanner.nextInt();

        System.out.println("Enter side 2");
        int side2=scanner.nextInt();

        System.out.println("Enter side 3");
        int side3=scanner.nextInt();

        if(side1==side2 && side1==side3 && side2==side3)
        {
            System.out.println("Triangl is Equilateral");
        }
        else if (side1==side2 || side1==side3||side2==side3)
        {
            System.out.println("Triangle is isosceles");
        }
        else
        {
            System.out.println("Triangle is scalene");
        }
    }
}
