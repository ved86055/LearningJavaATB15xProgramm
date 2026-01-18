package String_Buffer_Builder;

public class Buffer
{
    public static void main(String[] args)
    {
        String name="vedprakash";
        StringBuffer st=new StringBuffer("vedprakash");
        System.out.println(st.reverse());

     //   System.out.println(st.toString());

        st.append("shinde");
        System.out.println(st);
       System.out.println(st.append(12));




    }
}
