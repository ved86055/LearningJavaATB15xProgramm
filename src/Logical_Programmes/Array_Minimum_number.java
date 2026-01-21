package Logical_Programmes;

public class Array_Minimum_number
{
    public static void main(String[] args)
    {
        int list[]={1,2,3,4,5};
        int min=list[0];
        for (int i=1;i<list.length;i++)
        {

            if (list[i]<min)
            {
                min=list[i];
            }
        }
        System.out.println(min);


    }
}
