package StringConcatination;

public class example01
{
    public static void main(String[]args)
    {
        int a =200;
        int b =25;

        String c = "heyved";
        String d="gmved ";

        System.out.println(a+b+c+d);            //225hey vedgm ved
        System.out.println(c+d+a+b) ;                            //heyvedgmved 20025

        System.out.println(c+d+a+b+c+d);   //heyvedgmved 20025heyvedgmved

        System.out.println(c+d+(a+b)

    }
}
