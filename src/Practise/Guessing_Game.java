package Practise;

import java.util.Random;
import java.util.Scanner;



public class Guessing_Game
{
    public static void main(String[] args)
    {
        Random random=new Random();
        int NumToGuess=random.nextInt(100);

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int guess;
        int attempts=0;



        while (true)
        {
            if (!scanner.hasNextInt())
            {
                System.out.println("Please enter valid input");
                scanner.next();  //consumes invalid input which is string here so no nextInt used here
                continue;

            }

            guess=scanner.nextInt();
            attempts++;

            if (guess<NumToGuess)
            {
                System.out.println("Too low");
            }
            else if (guess>NumToGuess)
            {
                System.out.println("Too high");

            }
            else
            {
                System.out.println("correct");
            }


        }
















    }
}
