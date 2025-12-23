package operators;

public class Logical_operators
{
    public static void main(String []args)
    {
        boolean b =true;

        System.out.println(b);

        System.out.println(!b);

        System.out.println(!!b);

        /* or cycle'
            (any 1 value true result true
        true false  true'
        false true  true'
        false false  false'
        true  true    true


        && cycle
        true false false
        false true  false'
        true true  true
        false false false

         */





        boolean c = true||false;
        System.out.println(c);

        boolean d=false&&true;
        System.out.println(d);



    }
}
