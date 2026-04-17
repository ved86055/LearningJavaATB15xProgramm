package Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList<I extends Number> {
    public static void main(String[] args)
    {

        Emp employee1=new Emp("ved","QA",32);
        Emp employee2 =new Emp("Ram","SDET",34);
        Emp employee3 =new Emp("sam","dev",36);

        ArrayList <Emp>ar=new ArrayList<>();
        ar.add(employee1);
        ar.add(employee2);
        ar.add(employee3);

       Iterator<Emp> it=ar.iterator();

       while (it.hasNext())
       {
           Emp emp=it.next();
           System.out.println(emp.name);
           System.out.println(emp.age);
           System.out.println(emp.dept);
       }











    }
}
