package Arrays.MultiDimensionalArray;

public class basic
{
    public static void main(String[] args)
    {

        int multi[][]=new int [2][3];

        multi [0][0]=79;
        multi [0][1]=67;
        multi [0][2]=78;

        multi[1][0]=34;
        multi[1][1]=21;
        multi[1][2]=24;

        for (int i=0;i<2;i++)
        {

            for (int j=0;j<3;j++)
            {
                System.out.println(multi[i][j]);
            }
        }



















    }
}
