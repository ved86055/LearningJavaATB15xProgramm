package Practise;

public class Testiugn

{
    public static void main(String[] args)

    {

        int num[]={252,215,100,877,94,34};

        int max=num[0];

        for (int i=0;i<num.length;i++)
        {
            if (num[i]>max)
            {
                max=num[i];
            }
        }
        System.out.println(max);


    }
}
