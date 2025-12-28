package com.ozcnyldz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ozcnyldz.model.Employee;
import com.ozcnyldz.services.EmployeeService;


@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }
    
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable(name="id", required = true)String id) {
    	return employeeService.getEmployeeById(id);
    }
    @GetMapping("/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name="firstnameString" , required = false) String firstnameString,
    											@RequestParam(name="lastnameString" , required = false) String lastnameString){
    	return employeeService.getEmployeeWithParams(firstnameString,lastnameString);
    }
    
    @PostMapping(path="/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee) {
    	return employeeService.saveEmployee(newEmployee);
    }
    
}
