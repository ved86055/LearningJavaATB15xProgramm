package Practise;

import java.util.*;

public class r15
{
    public static void main(String[] args) {


        String input = "programmminggg";
       char[] in=input.toCharArray();

        Set<Character>myset=new LinkedHashSet<>();

        for (char ch :in)
        {
           myset.add(ch);

        }
        Iterator it= myset.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next());
        }


    }
}
