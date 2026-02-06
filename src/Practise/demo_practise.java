package Practise;

interface i15
{
    int p=1122;
    int q=344;
    void access();

}

interface i16
{
    void reaccess();

}

 class session
{
    public void m18()
    {
        System.out.println("this is classs ");
    }
}






public class demo_practise extends session implements i15,i16
{
    public void access()
    {
        System.out.println(p+q);
    }

    public void reaccess()
    {
        System.out.println(p*q);
    }


    public static void main(String[] args)
    {


        demo_practise dm=new demo_practise();
        dm.access();
        dm.reaccess();
        dm.m18();
        System.out.println(i15.p-i15.q);
    }


}
