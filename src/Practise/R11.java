package Practise;

public class R11
{
    public static void main(String[] args)
    {
        int list[]={12,78,43,90,54,65,89};
        int highest=0;
        int sechighest=0;

        for (int i=0;i<list.length;i++)
        {
            if (list[i]>highest)
            {
                sechighest=highest;
                highest=list[i];
            }
            else if (list[i]>sechighest && list[i]!=highest)
            {
                sechighest=list[i];

            }


        }
        System.out.println(sechighest);


    }




}
