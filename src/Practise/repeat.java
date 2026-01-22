package Practise;

public class repeat {
    public static void main(String[] args)
    {
        String st="testttting";
        char target='t';
        int count=0;

        for (int i=0;i<st.length();i++)
        {

            if (st.charAt(i)==target)
            {
                count++;

            }
        }
        System.out.println(count);



    }
}
