package com.example.employeeservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private Employees employees=new Employees();
    @GetMapping("/employees")
    public Employees getEmployees() {

        return new Employees();
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        employees.addEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
