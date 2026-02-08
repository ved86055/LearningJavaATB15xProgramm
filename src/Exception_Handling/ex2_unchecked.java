package Exception_Handling;

public class ex2_unchecked
{
    public static void main(String[] args)
    {



        try {
            System.out.println(" hi welcome");
            String s = "ved";
            Integer.parseInt(s);
            System.out.println(s);




        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        System.out.println("Hi there how are you ");






    }
}
