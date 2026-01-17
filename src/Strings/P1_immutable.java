package Strings;

public class P1_immutable
{
    public static void main(String[] args)
    {

        String name="abc";
        name=name+"de";
        System.out.println(name);  //but here new object will be crated to store de &it wont modify abc
                                   //stored in constant pool are & duplicate not allowed


        String s=new String("pqr");
        String s1=new String("pqr");  //even though  both are same will stored every time in new package/object





    }
}
