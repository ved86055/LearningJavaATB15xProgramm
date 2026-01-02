package Logical_Programmes;

import java.util.Scanner;

public class Triangle_Classifier
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter sidea");
        int sidea=scanner.nextInt();

        System.out.println("Enter sideb");
        int sideb=scanner.nextInt();

        System.out.println("Enter sidec");
        int sidec=scanner.nextInt();

        if( sidea == sideb && sideb ==sidec && sidea== sidec)
        {
            System.out.println("Triangle is Equilateral");
        }

        else if (sidea == sideb || sideb==sidec ||sidec==sidea)
        {
            System.out.println("Triangle is isosceles");
        }

        else
        {
            System.out.println("Triangle is scalene");
        }


        scanner.close();    }
}
