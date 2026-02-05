package Interface;


interface test
{
    int a=12;
    int b=13;

    void rectangle();

    static void triangle()
    {
        System.out.println("This is static method as triangle");
    }

    default void circle()
    {
        System.out.println("This is default method as circle ");
    }
}





public class concept implements test
{

    public void rectangle()
    {
        System.out.println("implementing abstract method in class ");
    }

    public void hecta()
    {
        System.out.println("hecta ");
    }

    public static void main(String[] args)
    {


       // concept ct=new concept();   // generating object & ref variable of class
        concept ct=new concept();
        ct.rectangle();
        ct.circle();
        test.triangle();

        test t1=new concept();   // can create only object reference var. of interface & not the object
        t1.rectangle();   //abstarct method
        t1.circle();  //default
        test.triangle();
      //  t1.hecta    >>>>>>>>>>not possible as hecta ethod is not there in interface

        ct.rectangle();


        System.out.println(  test.a * test.b);
    }

}
