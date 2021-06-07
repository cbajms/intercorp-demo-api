package com.intercorp.demo.service;

import com.intercorp.demo.exception.ServiceException;
import com.intercorp.demo.model.Customer;
import com.intercorp.demo.model.KpiResponseBody;
import com.intercorp.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer getById(Long customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new ServiceException("Cliente no encontrado", HttpStatus.NOT_FOUND));
    }

    public Customer create(Customer customer) throws ServiceException {
        return customerRepository.save(customer);
    }

    public List<Customer> batchCreate(List<Customer> customers) {
        return customers
                .stream()
                .map(customer -> customerRepository.save(customer))
                .collect(Collectors.toList());
    }

    public Double calculateAgeAverage() {
        List<Customer> customers = customerRepository.findAll();
        return customers
                .stream()
                .mapToDouble(Customer::getAge)
                .average()
                .orElse(Double.NaN);
    }

    public Double calculateStandardDeviation() {
        List<Customer> customers = customerRepository.findAll();
        Double mean = getMean(customers);
        List<Integer> customersAge = customers.stream()
                .map(Customer::getAge)
                .collect(Collectors.toList());
        Double variance = getVariance(customersAge,mean);

        return Math.sqrt(variance);
    }

    public KpiResponseBody getKpiResponse() {
        KpiResponseBody kpiResponseBody = new KpiResponseBody();
        kpiResponseBody.setAverage(calculateAgeAverage());
        kpiResponseBody.setStandardDeviation(calculateStandardDeviation());

        return kpiResponseBody;
    }

    public Double getVariance(List<Integer> customersAge, Double mean) {
        return customersAge.stream()
                .map(age -> age - mean)
                .map(age -> age*age)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
    }

    public Double getMean(List<Customer> customers) {
        return customers.stream()
                .mapToInt(Customer::getAge)
                .average()
                .getAsDouble();
    }
}
