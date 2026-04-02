package This_Super.ths;

public class this_ex
{
    int a =12;

    public void demo3()
    {
        int a=15;
        System.out.println(this.a);

        System.out.println(a);
    }

    public static void main(String[] args)
    {
        this_ex ex=new this_ex();

        ex.demo3();

    }
}
