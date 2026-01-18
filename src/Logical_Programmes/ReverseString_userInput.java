package Logical_Programmes;

import java.util.Scanner;

public class ReverseString_userInput
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter String");
        String input=scanner.next();
        String rev =" ";

        for (int i=input.length()-1;i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);


}}
