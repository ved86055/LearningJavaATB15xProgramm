package Practise;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class r17
{
    public static void main(String[] args)
    {
        String name="Regression";

       char[] arr= name.toCharArray();

       Map<Character,Integer> map=new HashMap<>();

       for (int i=0;i<name.length();i++)
       {
           if (!map.containsKey(arr[i]))
           {
               map.put(arr[i],1);
           }
           else
           {
               map.put(arr[i],map.get(arr[i])+1);
           }
       }



       for (Map.Entry<Character,Integer> entrys:map.entrySet())
       {
           if (entrys.getValue()>1)
           {

               System.out.println("Duplicate character is " + entrys.getKey() + " >>>>"+entrys.getValue());
           }
       }


    }
}
