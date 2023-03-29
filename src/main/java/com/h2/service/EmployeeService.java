package com.h2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.h2.model.Employee;

public interface EmployeeService {
    public Employee addEmployee(Employee emp);
    public List<Employee> getEmployee();
}
