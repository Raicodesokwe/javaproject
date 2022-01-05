package Employeesdetail;

import java.util.ArrayList;
import java.util.Scanner;

public class Details extends Employee {

    public Details(String name, String email, String phone_number, String salaries, String time_employed) {
        super(name, email, phone_number, salaries, time_employed);
    }

    public static void main(String[] args) {
        ArrayList<Employee>employees;

        employees = new ArrayList<>();

        Employee Davido=new  Employee("Davido kihika", "david@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Saverin=new  Employee("Saverin Rock", "eduardo@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Koch=new  Employee("Koch Komen", "kochbros@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Konman=new  Employee("Koman Freeman", "skihika@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Donald=new  Employee("Donald Duck", "skihika@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Wanyama=new  Employee("King Wanyama", "skihika@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Kean=new  Employee("Kean Kimani", "skihika@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Oscar=new  Employee("Oscar Vitalis", "skihika@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Ruth=new  Employee("Ruth Boken", "skihika@gmail.com", "0735007091", "ksh 45000", "2 yrs");
        Employee Cathrene=new  Employee("Cathrene Woodward", "katewood@gmail.com", "0735090091", "ksh 35000", "4 yrs");

        employees.add(Davido);
        employees.add(Saverin);
        employees.add(Koch);
        employees.add(Konman);
        employees.add(Donald);
        employees.add(Wanyama);
        employees.add(Kean);
        employees.add(Oscar);
        employees.add(Ruth);
        employees.add(Cathrene);

        System.out.println(employees.toString());


    }
}
