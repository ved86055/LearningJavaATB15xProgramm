package Practise;

public class pec
{
    public static void main(String[] args)
    {
        String list="Documents";
        String rev="";
        for (int i=list.length()-1;i>=0;i--)
        {
            rev=rev+list.charAt(i);
        }
        System.out.println(rev);



    }
}
