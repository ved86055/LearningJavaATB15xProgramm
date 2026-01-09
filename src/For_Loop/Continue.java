package For_Loop;

public class Continue
{
    public static void main(String[] args)
    {
       for (int i=0;i<10;i++)
       {
           if (i%2==0)    //this will skip even
           {
               continue;
           }
           System.out.println(i);
       }
        System.out.println("--------------------------------------------------");
       for (int j=0;j<10;j++)
       {
           if (j%2!=0)
           {
               continue;
           }
           System.out.println(j);
       }



    }
}
