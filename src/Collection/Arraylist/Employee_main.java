package Collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee_main
{
    public static void main (String []args)
    {

        Employee e1=new Employee("ved",22,"QA");

        Employee e2=new Employee("gouri",24,"DSA");

        Employee e3=new Employee("rohan",26,"dev");


        ArrayList<Employee> ar=new ArrayList<Employee>();

        ar.add(e1);
        ar.add(e2);
        ar.add(e3);

              Iterator<Employee> it=ar.iterator();


              while (it.hasNext())
              {

                  Employee emp=it.next();
                  System.out.println(emp.name);
                  System.out.println(emp.age);
                  System.out.println(emp.dept);

              }





    }
}
