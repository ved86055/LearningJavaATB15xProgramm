package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test101
{
    public static void main(String[] args)
    {
        ArrayList al =new ArrayList();
        al.add("vedprakash");
        al.add("shinde");
        al.add(34);
        al.add("hyderabad");
        al.add("shinde");
        al.add("honda activa");
        al.add(null);
        al.add(null);

        System.out.println(al);

        System.out.println(al.size());

        al.addFirst(1);
        al.addLast("last");
        System.out.println(al);

        al.remove(0);
        System.out.println(al);

        al.set(1,"shonde123");
        System.out.println(al);

        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        ArrayList ll=new ArrayList();
        ll.add("hyderabad");
        ll.add("shinde");
        ll.add(34);
        ll.add("last");

        System.out.println(ll);

        ll.removeAll(ll);
        System.out.println(ll);

        al.clear();
        System.out.println(al);









    }
}
