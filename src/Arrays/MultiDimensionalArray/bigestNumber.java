package Arrays.MultiDimensionalArray;

public class bigestNumber
{
    public static void main(String[] args)
    {
        int listArray[][]={{67,45,32},{45,43,78},{20,44,46},{90,43,76}};
        int max=listArray[0][0];

        for (int i=0;i<listArray.length;i++)
        {
            for (int j=0;j<listArray[i].length;j++)
            {
                if (listArray[i][j]>max)
                {
                    max=listArray[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
