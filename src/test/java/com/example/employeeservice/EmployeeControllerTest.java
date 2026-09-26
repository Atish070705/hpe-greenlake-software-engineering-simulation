package com.example.employeeservice;


import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
public class EmployeeControllerTest {


        @Test
        void testGetEmployees() {
            EmployeeController controller = new EmployeeController();

            Employees employees = controller.getEmployees();

            assertNotNull(employees);
            assertNotNull(employees.getEmployees());
        }

        @Test
        void testAddEmployee() {
            EmployeeController controller = new EmployeeController();

            Employee employee = new Employee(
                    "4",
                    "Amit",
                    "Patil",
                    "amit@gmail.com",
                    "Developer"
            );

            ResponseEntity<Employee> response = controller.addEmployee(employee);

            assertEquals(201, response.getStatusCode().value());
            assertEquals("Amit", response.getBody().getFirst_name());
            assertEquals("4", response.getBody().getEmployee_id());
        }
    }
