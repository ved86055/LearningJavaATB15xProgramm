package Practise;

public class p112
{
    public static void main(String[] args)
    {
        int ir[]=new int[2];

        ir[0]=13;
        ir[1]=99;

        int sum=0;
        for (int i=0;i<ir.length;i++)
        {
            sum=sum+ir[i];
        }
        System.out.println(sum);
    }
}
