package Practise;

import java.util.ArrayList;

public class demo101 {
    public static void main(String[] args) {
        int a[] = {4, 5, 6, 4, 4, 5, 4, 5, 5, 4, 4, 6, 4, 5, 8, 5, 4};

        ArrayList<Integer> ar=new ArrayList<>();

        for (int i=0;i<a.length;i++)
        {
            int k=0;
            k++;

            if (!ar.contains(a[i]))
            {
                ar.add(a[i]);
                for (int j=i+1;j<a.length;j++)
                {

                    if (a[i]==a[j])
                    {
                        k++;
                    }
                }

                System.out.println(a[i]);
                System.out.println(k);
            }



        }













    }
}