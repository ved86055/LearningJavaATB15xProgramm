package Practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class r12
{

    public static void main(String[] args)
    {
        String input="i am  am am i am i am ved i am ved";

        String[]array =input.split(" ");

        Set<String> myset=new LinkedHashSet<>();

        for (String list:array)
        {
            myset.add(list);
        }
       Iterator<String> it = myset.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

}}
