package Practise;

import java.util.Scanner;

public class Testday
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Day");

        if (scanner.hasNextInt())
        {
            int day=scanner.nextInt();
            switch(day)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("wed");
                    break;

                default:
                    System.out.println("No day");




            }




        }
    }
}
