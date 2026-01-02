package Practise;

import java.util.Scanner;

public class ex02
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1=scanner.nextInt();

        System.out.println("Enter side 2");
        int side2=scanner.nextInt();

        System.out.println("Enter side3");
        int side3=scanner.nextInt();

        if (side1==side2 && side1==side3 && side2==side3)
        {
            System.out.println("Triangle is a");
        }
        else if (side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("triangle is isc");
        }
        else
        {
            System.out.println("traingle is sce");
        }
    }
}
