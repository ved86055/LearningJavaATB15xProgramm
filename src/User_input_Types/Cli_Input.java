package User_input_Types;

public class Cli_Input
{
    public static void main(String[]args)
    {

        int age1=Integer.parseInt(args[0]);
        int age2=Integer.parseInt(args[1]);
        int age3=Integer.parseInt(args[2]);

        int result =(age1>age2) ? (age1>age3 ?age1:age3):(age2>age3?age2:age3);
        System.out.println(result);


    }
}
