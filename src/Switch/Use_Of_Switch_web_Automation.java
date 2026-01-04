package Switch;

import java.util.Scanner;

public class Use_Of_Switch_web_Automation
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser=scanner.next();

        switch (browser)
        {
            case "chrome" :
                System.out.println("starting the chrome");
                System.out.println("Run test case 1");
                break;

            case "firefox" :
                System.out.println("Staring firefox");
                System.out.println("Run test case 2");
                break;

            case "edge" :
                System.out.println("Starting edge");
                System.out.println("Run test case 2");
                break;

            default:
                System.out.println("No browser is usefull");
                break;




        }
    }
}