package org.example.hexlet.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.hexlet.model.Employee;
import org.example.hexlet.model.User;

import java.util.List;

// BEGIN
@AllArgsConstructor
@Getter
public class EmployeesPage {
    private String title;
    private List<Employee> employeeList;
    private String search;
}
// END
