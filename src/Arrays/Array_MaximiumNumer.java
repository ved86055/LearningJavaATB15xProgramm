package Arrays;

public class Array_MaximiumNumer
{
    public static void main(String[] args)
    {
        int []num={12,54,11,32,42,12,22,87,1,444};

        int max=num[0];

        for (int i=1;i<num.length;i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);













    }

}
