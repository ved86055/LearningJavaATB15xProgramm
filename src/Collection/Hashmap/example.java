package Collection.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class example
{
    public static void main(String[] args)
    {
        //HashMap hs=new HashMap();
       // Map hs=new HashMap();

        HashMap<Integer,String> hs=new HashMap<Integer,String>();

        hs.put(101,"Ved");
        hs.put(102,"Tataji");
        hs.put(103,"Guan");
        hs.put(101,"ram");
        hs.put(108,null);
        hs.put(110,"ved");
        hs.put(104,"ved");

        System.out.println(hs);
        System.out.println(hs.size());

        hs.remove(102);
        System.out.println(hs);

        System.out.println(hs.get(104));

        //print all keys
        System.out.println(hs.keySet());

        // values
        System.out.println(hs.values());

        //key n values
        System.out.println(hs.entrySet());


        for (Object k:hs.keySet())
        {
            System.out.println(k+" "+hs.get(k));
        }

 /*
        for (Map.Entry <Integer,String>k:hs.entrySet())
        {

            System.out.println(k.getKey()+ " "+ k.getValue());
        }

*/











    }
}
