package Practise.OopsPractise;

public interface mother
{
    public default void belongings()
    {
        System.out.println("belongings");
    }

    default void jewellery()
     {
         System.out.println("jewellery");

     }

     static void kitchen()
     {
         System.out.println("kitchen uten");
     }

}
