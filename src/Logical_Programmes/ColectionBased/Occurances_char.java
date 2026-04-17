package Logical_Programmes.ColectionBased;

import java.util.HashMap;
import java.util.Map;

public class Occurances_char
{
    public static void main(String[] args)
    {

        String name="Regressionn";

        name=name.toLowerCase();

        char[]array=name.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for (int i=0;i<name.length();i++)
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
            //to count occurance of each char

            System.out.println(entry.getKey()+"--->"+entry.getValue());

            //check which is duplicate charatcter

            if (entry.getValue()>1)
            {
                System.out.println("duplicate characters are "+ entry.getKey()+">>"+entry.getValue());
            }


        }





















    }
}
