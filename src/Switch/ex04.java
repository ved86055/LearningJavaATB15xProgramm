package Switch;

public class ex04
{
    public static void main (String[] args)
    {
        int code =4;
        switch (code)
        {
            case 1,3,5,7 :
                System.out.println("Code is odd");
                break;
            case 2,4,6,8 :
                System.out.println("code is even");
                break;
            default:
                System.out.println("Non executable");
                break;
        }
    }
}
