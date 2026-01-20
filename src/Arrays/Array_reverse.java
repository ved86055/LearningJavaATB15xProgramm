package Arrays;

public class Array_reverse
{
    public static void main(String[] args)
    {

        String st[]=new String[5];
        st[0]="ved;";
        st[1]="ram";
        st[2]="tex";
        st[3]="pax";
        st[4]="rak";

        for (int i=st.length-1;i>=0;i--)
        {
            System.out.println(st[i]);
        }


        System.out.println("--------------------------------------------");


        int in[]=new int[3];
        in[0]=34;
        in[1]=30;
        in[2]=44;

      /*  for (int i=2;i>=0;i--)
        {
            System.out.println(in[i]);
        } */
        for (int i=in.length-1;i>=0;i--)
        {
            System.out.println(in[i]);
        }



    }



}
