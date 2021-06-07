package com.intercorp.demo.controller;

import com.intercorp.demo.model.Employee;
import com.intercorp.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        return ResponseEntity.ok(employeeService.getById(employeeId));
    }

    @PostMapping()
    public ResponseEntity<Employee> createCustomer(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.create(employee));
    }
}
