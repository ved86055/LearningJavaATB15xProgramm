package Ternary_Operator;

public class CLI_input
{
    public static void main(String[]args)
    {

        String age_inout_string=args[0];

        int age=Integer.parseInt(age_inout_string);

        String result = (age<18)? "Minor" : (age<60)?"adult":"senior citizen";
        System.out.println(result);


    }
}
