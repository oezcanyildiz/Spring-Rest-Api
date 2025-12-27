package com.ozcnyldz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcnyldz.model.Employee;
import com.ozcnyldz.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {
        return employeeRepository.getAllEmployeeList();
    }
}
