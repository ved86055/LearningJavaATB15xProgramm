package Practise;

public class miltDd
{
    public static void main(String[] args)
    {

        int a[][]={{2101,3332,943},{765,89,35554},{9558,645,499}};
        int min=a[0][0];


        for (int i=0;i<a.length;i++)
        {

            for (int j=0;j<a[i].length;j++)
            {
                if (a[i][j]<min)
                {
                    min=a[i][j];
                }


            }

            System.out.println("row"+ i+ "min"+min);
        }

    }

    }
