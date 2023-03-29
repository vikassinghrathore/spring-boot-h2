package com.h2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.h2.model.Employee;
import com.h2.service.EmployeeService;

@RestController
public class EmployeeController {
    Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    EmployeeService employeeServiceimpl;

    @PostMapping(value = "/addemp")
    public ResponseEntity<Employee> addData(@RequestBody Employee emp) {
        Employee empData = employeeServiceimpl.addEmployee(emp);
        log.info("Adding Data in");
        if (HttpStatus.BAD_REQUEST == null) {
            log.warn("Bad Request...");
        }
        return new ResponseEntity<Employee>(empData, HttpStatus.OK);
    }

    @GetMapping(value = "/showemp")
    public ResponseEntity<List<Employee>> showData() {
        log.info("Showing Data in");
        if (HttpStatus.BAD_REQUEST == null) {
            log.warn("Bad Request...");
        }
        return new ResponseEntity<List<Employee>>(employeeServiceimpl.getEmployee(), HttpStatus.OK);
    }
}