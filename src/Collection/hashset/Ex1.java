package Collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        //         Set hss=new HashSet;
        HashSet hs = new HashSet<>();

        hs.add(100);
        hs.add(100);
        hs.add(200);
        hs.add(200);
        hs.add("vedrao");
        hs.add("vedrao");
        hs.add(100);
        hs.add("sample");

        System.out.println(hs.size());
        System.out.println(hs);

        //removing element specify element itself

        hs.remove("vedrao");
        System.out.println(hs);

        //inserting elemtnt not possoble bcz insertion order is not maintained
        //accessing specific elemt not possinle as in arraylist we used get method with input index but inex not tere in hash
       //But we can convert hashset > arraylist & perform opertn
        ArrayList al=new ArrayList(hs);
        System.out.println(al);
        System.out.println(al.get(0));

        //Read data
        /*
        for(Object x:hs)
        {
            System.out.println(x);
        }

         */

        Iterator its =hs.iterator();
        while(its.hasNext())
        {
            System.out.println(its.next());
        }









    }
}