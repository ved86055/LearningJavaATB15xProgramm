package Practise;

import java.util.HashMap;
import java.util.Map;

public class karizma
{ public static void main(String[] args)
{
    String name="Reggression";
    name= name.toLowerCase();

    char[]word=name.toCharArray();

    Map<Character,Integer> mp=new HashMap<>();

    for (int i=0;i<name.length();i++)
    {
        if (!mp.containsKey(word[i]))
        {
            mp.put(word[i],1);
        }
        else {
            mp.put(word[i], mp.get(word[i]) + 1);
        }
    }

    for (Map.Entry<Character,Integer>entry:mp.entrySet())
    {
        System.out.println("occurances of character is "+entry.getKey()+"---->>>"+entry.getValue());


    }




}
}
