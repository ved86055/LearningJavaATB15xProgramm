package Exception_Handling;

public class multiple_catchblock
{
    public static void main(String[] args)
    {



        String s=null;

        try {

            System.out.println(s.length());
        }


        catch (ArithmeticException a)
        {
            System.out.println("handled arihm,atic ");

        }


        catch (NullPointerException n)
        {
            System.out.println(n.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a.getMessage());
        }

        finally
        {
            System.out.println("entered finally block ");

        }



        System.out.println("priogramee complted");











    }
}
