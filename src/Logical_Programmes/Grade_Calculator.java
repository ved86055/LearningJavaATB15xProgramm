package Logical_Programmes;

/* Grade Calculator:

Write a program that calculates and displays the letter grade
 for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
 A=90-100
 B=80-89
 c=70-79
 D=60-69
 F=0-59
*/

import java.util.Scanner;

public class Grade_Calculator
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks1=scanner.nextInt();

        if (marks1>=90 &&marks1<100)
        {
            System.out.println("A Grade");
        }
        else if (marks1>=80)
        {
            System.out.println("Grade B");
        } else if (marks1>=70)
        {
            System.out.println("Grade C");
        } else if (marks1>=60)
        {
            System.out.println("Grade D");
        }

        else
        {
            System.out.println("Grade F");
    }



    }
}
