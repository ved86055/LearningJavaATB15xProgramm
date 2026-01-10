package While;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game
{
    public static void main(String[] args)
    {
         Random random=new Random();
        int NumToGuess=random.nextInt(100);
      //  System.out.println(NumToGuess);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts=0;

        while (true)
        {
            if (!scanner.hasNextInt())
            {
                System.out.println("Please enter valid Integer value");
                scanner.next();  //consumes invalid input which is string here so no nextInt used here
                continue;

            }
            guess=scanner.nextInt();
            attempts++;


            if (guess<NumToGuess)
            {
                System.out.println("Too Low!! Try Again");
            } else if (guess>NumToGuess)
            {
                System.out.println("Too High!! Try Again");

            }
            else
            {
                System.out.println("correct !!" + " You have guessed in " + attempts + " Attempts ");
                break;
            }



        }












    }
}
