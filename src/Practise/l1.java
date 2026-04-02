package Practise;

public class l1
{
    public static void main(String[] args)
    {
        int a[] = {12, 45, 99, 33, 44, 66, 77, 23,};

        int min=a[0];

        for (int i=0;i<a.length;i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }
        }

        System.out.println(min);


    }
}
