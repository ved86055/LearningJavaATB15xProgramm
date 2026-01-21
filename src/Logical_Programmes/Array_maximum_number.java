package Logical_Programmes;

public class Array_maximum_number
{
    public static void main(String[] args){

        int marks[]={12,44,55,66,11,10};
        int max=marks[0];
        for (int i=1;i<marks.length;i++)
        {
            if (marks[i]>max)
            {
                max=marks[i];
            }

        }
        System.out.println(max);
    }
}
