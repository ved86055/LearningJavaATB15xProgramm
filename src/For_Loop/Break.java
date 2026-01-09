package For_Loop;

public class Break
{
    public static void main(String[] args)
    {
        for (int i=0;i<50;i++)
        {
          //  System.out.println(i);  1,2,3,4,5 includes 5 also
            if (i==5)
            {
                break;
            }

            System.out.println(i); //1,2,3,4 No 5 bcz loop breaks as sson as 5 even before it reaches println
        }
        System.out.println("End");
    }
}
