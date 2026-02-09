package Collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class example
{

    public static void main(String[] args)
    {

       //            List l  =new ArrayList();
      //  ArrayList<String>al=new ArrayList<String>();   // to store only string type of data

        ArrayList ar=new ArrayList();

        ar.add("ved");
        ar.add(55);
        ar.add(55);
        ar.add("ved");
        ar.add(10.3);
        ar.add(null);
        ar.add(null);

        System.out.println(ar);

        System.out.println(ar.size());

        ar.remove(0);
        System.out.println(ar);

        ar.add(0,"insertion");
        System.out.println(ar);

        ar.set(0,"updated");
        System.out.println(ar);

        ar.get(4);
        System.out.println(ar.get(0));

        System.out.println(ar.indexOf("updated"));

        ar.addLast("final");
        ar.addFirst("Begining");

        System.out.println(ar);


       Iterator  it=ar.iterator();

       while (it.hasNext())
       {
           System.out.println(it.next());
       }


       System.out.println(ar.isEmpty());

       // To remove multiple entities

        ArrayList al=new ArrayList();

        al.add("ved");
        al.add(10.3);

        System.out.println(al);

        al.removeAll(al);

        System.out.println(al);






        /*
        for (int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
        for (Object x:ar)
        {

            System.out.println(x);
        } */























    }
}
