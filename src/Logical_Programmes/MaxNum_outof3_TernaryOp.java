package Logical_Programmes;

public class MaxNum_outof3_TernaryOp
{
    public static void main(String []args)
    {


     int a =27;
     int b = 12;
     int c = 21;

     String result = (a>b) ?(a>c?"a is max":"c is max") : (b>c ?"b is max":"c is max");
        System.out.println(result);


    }
}
