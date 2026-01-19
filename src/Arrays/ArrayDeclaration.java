package Arrays;

public class ArrayDeclaration
{
    public static void main(String[] args)
    {

        String names[]={"ved","ari","pooja","ram"};
        int marks[]={12,32,43,41,76};
        boolean [] results={true,false,false,true };

        for (int item:marks)
        {
            System.out.println(item);
        }

        for (String item:names)
        {
            System.out.println(item);

        }

        for (boolean item:results)
        {

            System.out.println(item);
        }



    }
}
