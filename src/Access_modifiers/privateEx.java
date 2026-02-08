package Access_modifiers;

public class privateEx
{

        private int balance = 110;

        private void m1() {
            System.out.println(balance);
        }
    }

    class main
    {

        public static void main(String[] args)
        {
            privateEx ex =new privateEx();
            //   ac.m1();   : private is not possible so error


        }
    }







