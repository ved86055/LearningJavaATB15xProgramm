package Test1;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

//Month Name Finder
//Description:
//Write a Java program to print the month name based on the month number (1–12) using a switch statement.
public class Q5
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  number");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            switch (month) {
                case 1:
                    System.out.println("jan");
                    break;
                case 2:
                    System.out.println("feb");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("April");
                    break;

                default:
                    System.out.println("Enter value between 1-12");
            }
        }
        else {
            System.out.println("No month");
        }
















    }
}
