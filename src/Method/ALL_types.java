package Method;
/*Method Types
        1.Method with No parameter & No return Value
        2.Method with No parameter & with return value
        3.Method with Parameter    & No return value
        4.Method wit Parameter     & with return value
        */
public class ALL_types
{
    public static void main(String[] args)
    {

        m1();                             //1st type : Static
        ALL_types al=new ALL_types();
        al.m2();                          //1st type : non static

        String s=al.m3();                          // 2nd no para : with return value
        System.out.println(s);
        System.out.println(al.m3());


        al.m4("ved");                     // 3rd parameter & no return type


       int addition= al.sum(5,10);        // 4th parameter & return value
        System.out.println(addition);




    }








    //        1.Method with No parameter & No return Value   //Static regular method
     static void m1()
    {
        System.out.println("Hello ved");
    }

    //        1.Method with No parameter & No return Value   //non-Static regular method

     void m2()
   {
    System.out.println("Hello ved how are you");
   }

   //2.Method with No parameter & with return value

    String  m3()
     {
         return("Im good");

     }


     // 3.Method with Parameter    & No return value

      void  m4(String name)
     {
         System.out.println("My name is " + name);
     }



    //  4.Method with Parameter     & with return value

    int sum(int a, int b)
    {

        return(a+b);
    }






}
