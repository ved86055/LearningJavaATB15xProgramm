package Ways_to_store_data_into_variables;

public class studentMain1
{
    public static void main(String[] args)
    {

        student1 st1 =new student1();

       // // 1st way to store data  using object reference variable
       /*
        st1.team_code=124;
        st1.name="Arati";
        st1.Emp_id="xyz123";

        st1.printstudentData();


        */

        // 2nd way is using method


        st1.employeedata("123","ved", 2133);
        st1.printstudentData();

    }
}
