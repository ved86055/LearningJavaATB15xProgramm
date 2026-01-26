package Variables;

public class local
{
    public static void main(String[]args)
    {

        int surface=3;
        System.out.println(surface);   //surface is loccal variable for main method
      //  System.out.println(block);  // not valid as block is local variable only for list method
        list();                      // for static method list call method using methodname();

       // System.out.println(boy);   // invalid as boy is local variable for that method
        local l=new local();     // for non statc method details csll method using objectname.methodname
        l.details();

    }



     static void list()
    {
        int block = 3;
        String building="Rana";
        System.out.println(block);

        System.out.println(building);
    }

    void details()
    {
        int age=12;
        String boy="amar";
        System.out.println(boy);
        System.out.println(age);
    }
}
