package Practise;

public class max
{
    public static void main(String[] args)
    {


        int array[]={87,43,88,33,22,44,3,4};

        int max=array[0];

        for (int i=1;i<array.length;i++)
        {
            if (array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println(max);
    }

}
