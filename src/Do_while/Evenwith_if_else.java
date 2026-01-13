package Do_while;

public class Evenwith_if_else
{
    public static void main(String[] args)
    {
        int i =1;

        do {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i++;                          //keep i++ out of if else
        }while (i<=50);



    }
}
