package Type_casting;

public class downcasting
{
    String nameanimal="dog";
    void soundanimal()
    {
        System.out.println("barking of dog");
    }
}

class bird extends downcasting
{
    String namebird="Chimani";
    void soundbird()
    {
        System.out.println("chiv chiv ");
    }
}
class test
{
    public static void main(String[] args)
    {

              downcasting dc =new bird();

              bird b=(bird)dc;



              b.soundbird();
        System.out.println(b.namebird);

        System.out.println(b.nameanimal);
        b.soundanimal();



    }
}