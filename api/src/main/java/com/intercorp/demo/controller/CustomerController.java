package com.intercorp.demo.controller;

import com.intercorp.demo.model.KpiResponseBody;
import com.intercorp.demo.service.CustomerService;
import com.intercorp.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Customer>> getAllEmployees() {
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Customer> getEmployeeById(@PathVariable(value = "id") Long customerId) {
        return ResponseEntity.ok(customerService.getById(customerId));
    }

    @PostMapping()
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.create(customer));
    }

    @PostMapping(value = "/batch")
    public ResponseEntity<List<Customer>> createCustomer(@RequestBody List<Customer> customers) {
        return ResponseEntity.ok(customerService.batchCreate(customers));
    }

    @GetMapping(value = "/kpideclientes", produces = "application/json")
    public ResponseEntity<KpiResponseBody> getKPI() {
        return ResponseEntity.ok(customerService.getKpiResponse());
    }
}
