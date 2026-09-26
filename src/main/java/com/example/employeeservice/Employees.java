package com.example.employeeservice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees {
    private List<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();

        employees.add(new Employee(
                "1",
                "Atish",
                "Amale",
                "atish@gmail.com",
                "Software Engineer"
        ));

        employees.add(new Employee(
                "2",
                "Rahul",
                "Patil",
                "rahul@gmail.com",
                "Developer"
        ));

        employees.add(new Employee(
                "3",
                "Sneha",
                "Sharma",
                "sneha@gmail.com",
                "Project Manager"
        ));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
