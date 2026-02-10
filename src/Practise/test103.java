package Practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test103
{
    public static void main(String[] args)
    {

        HashSet hs=new HashSet();

        hs.add("Mobile");
        hs.add("Mobile");
        hs.add(1234);
        hs.add(1234);
        hs.add(434);
        hs.add(10.4);
        hs.add(null);
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.size());

        hs.remove(1234);

        ArrayList al2=new ArrayList(hs);
        System.out.println(al2.get(0));
        System.out.println(al2.set(1,12321));
        System.out.println(al2);

        System.out.println(al2.remove(1));

        System.out.println(al2);


        Iterator it3=hs.iterator();
        while(it3.hasNext())
        {
            System.out.println(it3.next());
        }























    }
}
