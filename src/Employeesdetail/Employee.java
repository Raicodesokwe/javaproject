package Employeesdetail;

import java.util.Arrays;

public class Employee {

    String name, email, phone_number, salaries, time_employed;

    public Employee(String name, String email, String phone_number, String salaries, String time_employed) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.salaries = salaries;
        this.time_employed = time_employed;
    }

    @Override
    public String toString() {
        return "\n Employee(" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", salaries='" + salaries + '\'' +
                ", time_employed='" + time_employed + '\'' +
                ')';
    }
}
