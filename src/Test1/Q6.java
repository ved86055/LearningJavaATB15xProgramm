package Test1;
//) Positive, Negative or Zero
//
//Description:
//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.


import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        /*int num=-2;
        String result=( num > 0)  ? "Number is positive":(num<0)?"Number is negative":"Number is 0";


        System.out.println(result);*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();

        String result=num>0 ?"Positive":num<0?"num is negative":"Number is 0";

        System.out.println(result);




    }
}
