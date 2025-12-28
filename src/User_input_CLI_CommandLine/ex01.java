package User_input_CLI_CommandLine;

public class ex01
{
    public static void main(String[]args)
    {

        String String_age_input=args[0];
        int age_user_input=Integer.parseInt(String_age_input);

        String result = (age_user_input<18) ? "Minor" :(age_user_input<60)?"adult" :"senior citizen";






        System.out.println(result);

        

    }
}
