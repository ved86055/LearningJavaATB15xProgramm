package Logical_Programmes;
import java.util.*;

public class Remove_Duplicate_word
{
    public static void main(String[] args)
    {

        String sentence="Cd is very good cd app is very good all is good very good";

        String[]splitsentence=sentence.split(" ");
        Set<String> myset=new LinkedHashSet<>();

        for (String word:splitsentence)
        {
            myset.add(word);
        }

        Iterator<String> it=myset.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
