package Practise;

import java.util.ArrayList;

public class demo10
{
    public static void main(String[] args)
    {
       String name="vedishereaswellasheisaswellasthereeverywhere";


       ArrayList<Character> ar=new ArrayList();

       for (int i=0;i<name.length();i++)
       {
           int k=0;
           k++;
           if (!ar.contains(name.charAt(i)))
           {
               ar.add(name.charAt(i));


               for (int j=i+1;j<name.length();j++)
               {

                   if (name.charAt(i)==name.charAt(j))
                   {
                       k++;
                   }
               }
               if (k>1)
               {
                   System.out.println("Duplicate char which  repeat are "+" "+ name.charAt(i));
               }


           }


       }



    }
}
