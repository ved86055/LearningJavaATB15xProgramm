package Practise.OopsPractise;

public interface HeadOrganisation
{
      int a=12;        //
      int b=13;

    public void Green();
    public  void Red();
    public  void yellow();

    default void  walkingrule()
    {
        System.out.println("Default method is allowed in interface");

    }

    static void footpath()
    {
        System.out.println("static method are allowed in interface");
    }
}

