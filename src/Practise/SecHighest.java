package Practise;

public class SecHighest
{
    public static void main(String[] args)
    {
        int marks[] = {44, 33, 55, 66, 77, 88, 33, 12};

        int highest=0;
        int secondHighest=0;

        for (int num:marks)
        {
            if (num>highest)
            {
                secondHighest=highest;
                highest=num;
            } else if (num>secondHighest && num!=highest)
            {
                secondHighest=num;

            }
        }
        System.out.println(highest);
        System.out.println(secondHighest);

    }
}
