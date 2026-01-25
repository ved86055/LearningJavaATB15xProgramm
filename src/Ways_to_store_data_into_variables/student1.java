package Ways_to_store_data_into_variables;

public class student1
{

    String Emp_id;

    String name;

    int team_code;

 // 1st way to store data  using object reference variable
    //purpose : just print the data
    void printstudentData()
    {
        System.out.println(Emp_id  + " "  + name + " "  +  team_code + " ");
    }


    // 2nd way is using method
    //purpose is take the input n store data into variables

    void employeedata(String empid ,String empname, int empcode)
    {
        Emp_id =empid;
        name=empname;
        team_code=empcode;

    }

}
