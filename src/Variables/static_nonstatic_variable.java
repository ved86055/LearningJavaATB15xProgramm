package Variables;

public class static_nonstatic_variable
{
    static int pack=12;
    String location="Shelf";


    public static void main(String[] args)
    {
        System.out.println(pack);  // as pack is static variable i can call it directly

      //  System.out.println(location);  // location is  non static vari cant access directly

        static_nonstatic_variable snv=new static_nonstatic_variable();
     //   snv.location;    // this is only accessing variavble but we have to use it as print/assign etc

        System.out.println(snv.location);

    }
}
