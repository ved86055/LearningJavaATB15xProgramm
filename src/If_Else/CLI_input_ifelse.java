package If_Else;

public class CLI_input_ifelse
{
    public static void main(String[]args)
    {
        int age =Integer.parseInt(args[0]);

        if (age>18)
        {
            System.out.println("user can vote");
        }
        else
        {
            System.out.println("user cant vote");
        }
    }
}
