package com.intercorp.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "employees", schema = "hr")
public class Employee {
    @ApiModelProperty(value = "employee id", example = "100")
    @Id
    @Column(name = "employee_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;

    @ApiModelProperty(value = "employee's first name", example = "Mason", position = 1)
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @ApiModelProperty(value = "employee's last name", example = "Mount", position = 2)
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @ApiModelProperty(value = "employee's email", example = "Mount", position = 3)
    @Column(name = "email", nullable = false)
    private String email;

    @ApiModelProperty(value = "employee's phone number", example = "515.123.4567", position = 4)
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @ApiModelProperty(value = "employee's birth date", example = "03/02/2020", position = 5)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @ApiModelProperty(value = "employee's annual salary", example = "24000", position = 6)
    @Column(name = "salary", nullable = false)
    private String salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && hireDate.equals(employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, hireDate);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", salary='" + salary + '\'' +
                '}';
    }
}
