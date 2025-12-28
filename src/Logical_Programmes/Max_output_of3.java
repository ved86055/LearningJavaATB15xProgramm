package Logical_Programmes;

public class Max_output_of3
{
    public static void main(String[]args)
    {

       /*
        int A=Integer.parseInt(args[0]);
        int B =Integer.parseInt(args[1]);
        int C=Integer.parseInt(args[2]);

        String result= (A>B) ? (A>C ? "A is max" : " C is max"):(B>C ?"B is Max":"C is max");
        System.out.println(result);

        */

        int a =Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int result =(a>b)?(a>c ?a :c):b;

        System.out.println(result);


    }
}
