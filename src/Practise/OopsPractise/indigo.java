package Practise.OopsPractise;

public class indigo extends WorldAircraftOrganisation
{
    public void nameOfAirraft()
    {
        System.out.println("concrete method name of Aircraft");
    }

    public void colorAircraft()
    {
        System.out.println("Concrete Method color");
    }

    public  static void main(String[] args)
    {


        WorldAircraftOrganisation wo=new indigo() ;

        wo.EngineOfAircraft();
        wo.colorAircraft();
        wo.nameOfAirraft();






}}
