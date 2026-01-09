package For_Loop;

import java.util.Scanner;

public class Continue_inputUser
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        for (int i=0;i<num;i++)
        {

            if ( i==5)
            {
                continue;

        }
            System.out.println(i);

        }

    }
}
