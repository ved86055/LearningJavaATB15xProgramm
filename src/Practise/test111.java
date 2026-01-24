package Practise;


public class test111 {
    String name;
    int rollno;
    int height;


    void display() {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(height);
    }

    public static void main(String[] args)
    {
        test111 test=new test111();
        test.name="ved";
        test.rollno=123;
        test.height=5;
        test.display();

        test111 test2=new test111();
        test.name="ara";
        test.rollno=124;
        test.height=4;
        test.display();

    }
}