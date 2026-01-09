package For_Loop;

import java.util.Scanner;

public class Factorial_User_input
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the number");


        if (scanner.hasNextInt()) {

            int num = scanner.nextInt();
            int fact = 1;
            for (int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("factorial of " +num + " is " +  fact);
        }

        else
        {
            System.out.println("Please enter the integer value");

        }
        scanner.close();






    }

}
