package Type_casting;

public class implicitCasting
{
    public static void main(String[]args)
    {
        byte b=12;
        int a =b;//impiicit/widening typecasting high to low

        System.out.println(a);

        int d=21;
        byte f=(byte)d;
        System.out.println(f);


        int fees=1211;
        float tax=18.3f;

        float total1=fees+tax;
        float total2=(float)fees+tax;

        System.out.println(total2);
    }
}

