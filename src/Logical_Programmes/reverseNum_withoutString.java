package Logical_Programmes;

public class reverseNum_withoutString
{
    public static void main(String[] args) {
        int num = 675483;
        int rev = 0;
        int remNum;

        for (int i=num;i>0;i=i/10)
        {
            remNum=i%10;
            rev=rev*10+remNum;

        }
        System.out.println(rev);

    }
}
