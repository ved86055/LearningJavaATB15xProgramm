package Logical_Programmes;

public class Array_secondHighest_number
{
    public static void main(String[] args)
    {
        int list[]={12,33,44,55,66,77,11,22,33,44};
        int highest=0;
        int secondHighest=0;

        for (int digits:list)
        {

            if (digits>highest)
            {
                secondHighest=highest;
                highest=digits;

            }
            else if (digits>secondHighest && digits!=highest)
            {
                secondHighest=digits;

            }
        }
        System.out.println(secondHighest);



    }
}
