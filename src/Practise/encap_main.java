package Practise;

public class encap_main
{
    public static void main(String[] args)
    {
        encap1 en=new encap1();
        en.setName("Arati Rohi");
        String name=en.getName();
        System.out.println(name);


        en.setBranch("Ausa road latur ");
        System.out.println(en.getBranch());

        en.setBankBalance(12555);
        System.out.println(en.getBankBalance());
    }
}
