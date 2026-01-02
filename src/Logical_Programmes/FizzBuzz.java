package Logical_Programmes;

/*Write a program that prints numbers from 1 to N, but:

If a number is divisible by 3 → print "Fizz"

If a number is divisible by 5 → print "Buzz"

If a number is divisible by both 3 and 5 → print "FizzBuzz"

Otherwise → print the number

 */
public class FizzBuzz
{
    public static void main(String[] args)
    {

        for (int i=1 ;i<100;i++)
        {
            if (i % 3 ==0 & i % 5 ==0)
            {
                System.out.println("FizzBuzz");
            }

            else if(i%3==0)
            {

                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }

            else
            {
                System.out.println(i);
            }

        }



    }
  }
