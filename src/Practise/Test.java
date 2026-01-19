package Practise;

public class Test {
    public static void main(String[] args) {

        String name = "madam";
        String rev = "";

        for (int i=name.length()-1;i>=0;i--)
        {

            rev=rev+name.charAt(i);
        }

        System.out.println(rev);

        if (name.equalsIgnoreCase(rev))
        {
            System.out.println("Given string is pallindrome");
        }
        else
        {
            System.out.println("Given string is not pallindrome");
        }
}
}
