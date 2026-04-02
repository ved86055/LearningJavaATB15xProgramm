package Practise;

public class pala
{
    public static void main(String[] args) {

        int num = 456789;
        int rev=0;

        for (int i=num;i>0;i=i/10)
        {
            int remainingnum=i%10;
            rev=rev*10+remainingnum;
        }
        System.out.println(rev);
    }
}
