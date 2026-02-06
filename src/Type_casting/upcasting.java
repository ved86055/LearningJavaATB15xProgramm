package Type_casting;


/*
upcasting =storing child class objc=ect in parent class reference is upcasting

*/

public class upcasting
{
    String nameanimal="dog";
    void animal()
    {
        System.out.println("animal");
    }
}

class dog extends upcasting
{
    String namebird ="peacock";
    void bird()
    {
        System.out.println("bird");
    }


    public static void main(String[] args)
    {
        upcasting up =new dog();
        up.animal();
        System.out.println(up.nameanimal);



    }

}
