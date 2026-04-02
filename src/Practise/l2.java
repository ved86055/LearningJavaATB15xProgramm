package Practise;

import java.util.Scanner;

public class l2
{public static void main(String[] args)
{

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string ");

    String input=sc.next();
    String rev="";
    for (int i=input.length()-1;i>=0;i--)
    {
        rev=rev+input.charAt(i);
    }
    System.out.println(rev);
}
}
