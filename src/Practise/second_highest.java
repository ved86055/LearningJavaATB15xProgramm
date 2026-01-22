package Practise;

public class second_highest
{
    public static void main(String[] args)
    {
        int list[]={12,34,77,44,33,11,55,56};
        int highest=0;
        int second_highest=0;

        for (int num:list)
        {
            if (num>highest) {
                second_highest = highest;
                highest = num;
            } else if (num>second_highest && num!=highest)
            {
                second_highest=num;
                
            }


        }            System.out.println(second_highest);




    }

}
