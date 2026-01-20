package Arrays;

import java.util.Scanner;

public class User_inputArrays
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter sizw of array");

        int size=scanner.nextInt();

        int marks[]=new int[size];

        for (int i =0;i<marks.length;i++)
        {
            System.out.println("enter the marks");
            marks[i]= scanner.nextInt();
        }


        System.out.println("--------------------");

        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("++++++++++++++++++++");
        for (int a:marks)
        {
            System.out.println(a);
        }

    }
}
