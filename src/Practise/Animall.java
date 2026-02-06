package Practise;

public class Animall
{
    String behaviour="loyal";
    void dog()
    {
        System.out.println("he is loving caring");
    }
}

 class bird extends Animall
{
    String color="pink-green";
    void parrot()
    {
        System.out.println("talkative in nature");
    }

}

class main
{
    public static void main(String[] args)
    {
        Animall an =new bird();
        an.dog();
        System.out.println(an.behaviour);
    }
}
