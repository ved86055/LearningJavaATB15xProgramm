package Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class test102
{
    public static void main(String[] args)
    {
        ArrayList ary=new ArrayList();
        ary.add("CD");
        ary.add(12);
        ary.add(123);
        ary.add("CD");
        ary.add(12);
        ary.add(null);
        ary.add(null);

        System.out.println(ary);
        System.out.println(ary.size());

        System.out.println(ary.get(2));

        ary.set(0,"IT company");

        System.out.println(ary);

        Iterator ita=ary.iterator();

        while(ita.hasNext())
        {
            System.out.println(ita.next());
        }


        ArrayList al=new ArrayList();
        al.add("IT company");
        al.add(12);
        al.add(123);

        ary.removeAll(al);


        al.clear();
        ary.clear();
        System.out.println(al);
        System.out.println(ary);




    }
}
