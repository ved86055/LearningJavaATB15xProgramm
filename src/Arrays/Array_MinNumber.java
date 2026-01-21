package Arrays;

public class Array_MinNumber
{
    public static void main(String[] args){

        int list[]={55,44,32,77,88};
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
