package org.example.hexlet.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.hexlet.model.Employee;

// BEGIN
@Getter
@AllArgsConstructor
public class EmployeePage {
    private Employee employee;
}
// END
