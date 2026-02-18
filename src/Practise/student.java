package Practise;

public class student {
    String stuname;
    String division;
    int roll_no;


    void print_studentData() {
        System.out.println(stuname + " " + division + " " + roll_no + " ");

    }

    void StudentDetails(String sname, String div, int  rn) {
        stuname = sname;
        roll_no = rn;
        division = div;

    }
}

