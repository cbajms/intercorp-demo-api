package com.intercorp.demo.controller;

import com.intercorp.demo.model.Employee;
import com.intercorp.demo.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Recupera todos los empleados de la tabla ejemplo de oracle HR.EMPLOYEES")
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @ApiOperation(value = "Recupera un empleado por su id, de la tabla ejemplo de oracle HR.EMPLOYEES")
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        return ResponseEntity.ok(employeeService.getById(employeeId));
    }

    @ApiOperation(value = "Crea un nuevo empleado en la tabla ejemplo de oracle HR.EMPLOYEES")
    @PostMapping()
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.create(employee));
    }
}
