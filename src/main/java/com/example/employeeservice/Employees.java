package com.example.employeeservice;
import java.util.Arrays;
import java.util.List;

public class Employees {
    private List<Employee> employees;

    public Employees() {
        employees = Arrays.asList(
                new Employee(
                        "1",
                        "Atish",
                        "Amale",
                        "atish@gmail.com",
                        "Software Engineer"
                ),
                new Employee(
                        "2",
                        "Rahul",
                        "Patil",
                        "rahul@gmail.com",
                        "Developer"
                ),
                new Employee(
                        "3",
                        "Sneha",
                        "Sharma",
                        "sneha@gmail.com",
                        "Project Manager"
                )
        );
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
