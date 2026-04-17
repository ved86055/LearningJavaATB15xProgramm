package Practise;

import java.util.HashMap;
import java.util.Map;

public class postfinal
{
    public static void main(String[] args)
    {

        String input="performance is to perform today";
        input=input.replace(" ", "");

       char[] array=input.toCharArray();

       Map<Character,Integer>map=new HashMap<>();

       for (int i=0;i<input.length();i++)
       {
           if (!map.containsKey(array[i]))
           {
               map.put(array[i],1);
           }
           else
           {
               map.put(array[i],map.get(array[i])+1);
           }
       }

       for (Map.Entry<Character,Integer>entry:map.entrySet())
       {

           if (entry.getValue()>1)
           {
               System.out.println(entry.getKey()+"--->"+entry.getValue());
           }
       }









    }
}
