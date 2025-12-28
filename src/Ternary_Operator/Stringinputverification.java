package Ternary_Operator;

public class Stringinputverification
{public static void main(String[]args)
{

    String age_input_string=args[0];


    System.out.println(age_input_string instanceof String);

    int age_user_inout=Integer.parseInt(age_input_string);
    String result=(age_user_inout<18)?"User is minor":(age_user_inout<60)?"user is adult":"user is sr.citizen";
    System.out.println(result);
}
}

