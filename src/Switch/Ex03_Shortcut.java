package Switch;

public class Ex03_Shortcut
{
    public static void main(String[] args)
    {
        int item_code=004;

        switch (item_code)

        {
            case 1 -> System.out.println("Code is valid");
            case 2-> System.out.println("codeis invalid");
            case 3-> System.out.println("code is under implementation");
            default -> System.out.println("Please enter code from manual only");


        }
    }
}
