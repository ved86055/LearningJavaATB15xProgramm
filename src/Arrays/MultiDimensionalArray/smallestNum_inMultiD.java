package Arrays.MultiDimensionalArray;

public class smallestNum_inMultiD
{
    public static void main(String[] args)
    {

        int multiD_array[][]={{21,32,31},{98,67,65},{87,56,90}};

        int min=multiD_array[0][0];

        for (int i=0;i<3;i++ )
        {
             for (int j=0;j<3;j++)
            {
                if (multiD_array[i][j]<min)
                {

                    min=multiD_array[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
