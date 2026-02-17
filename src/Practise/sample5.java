package Practise;

public class sample5
{
    int age;
    sample5(int age)
    {
        this.age=age;
    }
    void show()
    {
        System.out.println(age);
    }

}
class testmain{

    public static  void main(String[]args)
    {
       sample5 s5=new sample5(12);
       s5.show();

    }
}