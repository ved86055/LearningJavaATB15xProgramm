package Practise;

public class sample3
{
    int age;
    int id;
    sample3()
    {
         age=12;
         id=21;
    }

    sample3( int age, int id)
    {
       this.age=age;
       this.id=id;
    }

    void sumation()
    {
        System.out.println(age+id);
    }

    public static  void main(String[]args)
    {
        sample3 s3=new sample3();
        s3.sumation();
    }
}
