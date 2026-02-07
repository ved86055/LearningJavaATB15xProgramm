package Wrapper_class;

public class Ex_String_to_others
{
    public static void main(String[] args)
    {

        //Int

        String s1="10";
        String s2="20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        //double
        String s3="10.5";
        String s4="10.5";
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));

        //boolean

        String s5="ved";
        System.out.println(Boolean.parseBoolean(s5));   //false

        String s6="true";
        System.out.println(Boolean.parseBoolean(s6));   //true

        String s7="false";
        System.out.println(Boolean.parseBoolean(s7));  //false




    }
}
