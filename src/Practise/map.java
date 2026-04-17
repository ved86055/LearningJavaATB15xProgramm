package Practise;

import java.util.HashMap;
import java.util.Map;

public class map
{
    public static void main(String[] args)
    {


        HashMap<Integer,String> hs=new HashMap();
        hs.put(100,"ved");
        hs.put(101,"ram");
        hs.put(102,"aru");
        hs.put(103,"pot");
        hs.put(null,null);
        hs.put(109,"dor");
        hs.put(110,"iop");


       for (Map.Entry<Integer,String>k:hs.entrySet())
       {
           System.out.println(k.getKey() + " " + k.getValue());
       }
    }
}
