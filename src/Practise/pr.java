package Practise;

public class pr
{
    public static void main(String[] args)
    {

        String name="Google";
        String reverse="";

        for (int i=name.length()-1;i>=0;i--)
        {

            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);


    }
}
