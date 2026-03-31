package Practise.inherit;

public class grandchild  extends  Parent
{
    public void toys()
    {
        System.out.println("child having toys");
    }
    public static void main(String[] args)
    {
        grandchild gc=new grandchild();
        gc.toys();



    }
}
