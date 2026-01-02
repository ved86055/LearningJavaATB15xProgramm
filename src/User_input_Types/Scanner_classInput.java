package User_input_Types;

import java.util.Scanner;

public class Scanner_classInput
{

    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter age");
        int age = scanner.nextInt();

        if (age>18)
        {
            System.out.println("age is greater than expected");
        }

        else if (age<18)
        {
            System.out.println("age is lesser than expected");

        }
        else
        {
            System.out.println("age is equal");
        }
        scanner.close();

    }

}
