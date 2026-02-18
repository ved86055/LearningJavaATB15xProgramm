package Practise;

public class even_odd {
    public static void main(String[] args) {
        int num = 23;

        while(num>1)
        {
            num=num-2;

        }
        if (num==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}