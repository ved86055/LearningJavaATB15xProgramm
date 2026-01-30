package Practise;

public class testmain22
{
    public static   void main(String[] args)
{

    Test21 test=new Test21();
    test.setName("vedoprakash");
    System.out.println(test.getName());

    test.setAccno(1234);
    System.out.println(test.getAccno());


    test.setBalance(1200,false);
    System.out.println(test.getBalance());

    test.setBalance(3455,true);
    System.out.println(test.getBalance());


}
}
