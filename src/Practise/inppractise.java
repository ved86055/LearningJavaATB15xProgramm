package Practise;

import java.util.Scanner;

public class inppractise
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scanner.nextInt();
        int marks[]=new int[size];

        for (int i=0;i<marks.length;i++)
        {
            System.out.println("enter marks");
            marks[i]=scanner.nextInt();
        }








    }
}
