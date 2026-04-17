package Logical_Programmes;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_character
{
    public static void main(String[] args)
    {
        String word = "chhassis";
      char[] inp= word.toCharArray();

        Set<Character> st=new LinkedHashSet<>();

        for (char ch:inp)
        {
            st.add(ch);
        }

        Iterator<Character>it=st.iterator();

        while (it.hasNext())
        {
            System.out.print(it.next());
        }
    }

}
