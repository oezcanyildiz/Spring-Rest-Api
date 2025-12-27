package com.ozcnyldz.config;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ozcnyldz.model.Employee;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1", "Ozcan", "Yildiz"));
        employeeList.add(new Employee("2", "Hans", "Müller"));
        employeeList.add(new Employee("3", "Anna", "Bauer"));
        employeeList.add(new Employee("4", "Pascal", "Schultze"));

        return employeeList;
    }
}
