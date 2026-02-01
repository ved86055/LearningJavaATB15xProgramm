package Practise;

public class tesstet
{
    void sleep()
    {
        System.out.println("sleeping time in morning");
    }

}


class tesasset extends tesstet
{

    void sleep()
    {

       super.sleep();
    }

    public static void main(String[] args)
    {


        tesstet ts=new tesasset();
        ts.sleep();
    }


}
