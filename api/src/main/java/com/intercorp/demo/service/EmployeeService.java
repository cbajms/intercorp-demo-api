package com.intercorp.demo.service;

import com.intercorp.demo.exception.ServiceException;
import com.intercorp.demo.model.Employee;
import com.intercorp.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(Long employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ServiceException("Empleado no encontrado", HttpStatus.NOT_FOUND));
    }

    public Employee create(Employee employee) throws ServiceException {
        return employeeRepository.save(employee);
    }
}
