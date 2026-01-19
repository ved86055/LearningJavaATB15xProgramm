package Logical_Programmes;

import java.util.Scanner;

public class Pallindrome
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the strinbg name");
        String input=scanner.next();
        String rev="";

        for (int i=input.length()-1;i>=0;i--)
        {
            rev =rev + input.charAt(i);
        }
        if (input.equalsIgnoreCase(rev))
        {
            System.out.println("given string is pallindrome");
        }
        else {
            System.out.println("Given string is noit pallindrome");
        }


    }

}
