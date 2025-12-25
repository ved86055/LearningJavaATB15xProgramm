package Type_casting;

public class example
{
    public static void main(String[]args){
        int fees=100;
        float gst=18.12f;

        float total1=fees+gst;
        float total2=(float)fees+gst;
        System.out.println(total2);
    }



}
