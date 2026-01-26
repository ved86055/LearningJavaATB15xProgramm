package ENCAPSULATION;

public class Actual_Encap_main
{
    public static void main(String[] args)
    {

        Actual_Encap ae=new Actual_Encap();
        ae.setAccnot(12345);
        System.out.println(ae.getAccount());


        ae.setName("vedprakash vvs");
        String name=ae.getName();
        System.out.println(name);


        ae.setBalance(55000);
        System.out.println(ae.getBalance());





    }

}
