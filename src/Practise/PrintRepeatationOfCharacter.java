package Practise;

import java.util.ArrayList;

public class PrintRepeatationOfCharacter
{
    public static void main(String[] args)
    {

       String name="vedaperakasahe is here as well as vishal";

        ArrayList<Object> ar=new ArrayList<>();

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
                System.out.println(name.charAt(i));
                System.out.println(k);


            }



        }


        }









    }

