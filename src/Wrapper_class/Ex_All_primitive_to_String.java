package Wrapper_class;

public class Ex_All_primitive_to_String
{
    public static void main(String[] args)
    {

        int a=10;
        double d=23.3;
        char c='c';
        boolean b=true;

        //int >string

        String value=String.valueOf(a);
        System.out.println(value);

        //double

        String str=String.valueOf(d);
        System.out.println(str);

        //char to String

        String chr=String.valueOf(c);
        System.out.println(chr);

        //boolean >string

        String bo=String.valueOf(b);
        System.out.println(bo);




    }
}
