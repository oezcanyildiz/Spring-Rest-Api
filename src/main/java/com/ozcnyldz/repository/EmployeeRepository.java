package com.ozcnyldz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ozcnyldz.model.Employee;
import com.ozcnyldz.model.UpdateEmployee;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList() {
        return employeeList;
    }
    public Employee getEmployeeById(String id) {
    	Employee findEmployee = null; 
    	for (Employee employee : employeeList) {
			if(id.equals(employee.getId())) {
				findEmployee = employee; 
				break;
			}
			
		}
    	return findEmployee;
    }
    
    public List<Employee> getEmployeeWithParams(String firstnameString, String lastnameString) {

        List<Employee> employeeWithParams = new ArrayList<>();

        if (firstnameString == null && lastnameString == null) {
            return employeeList;
        }

        for (Employee employee : employeeList) {

            if (firstnameString != null && lastnameString != null) {
                if (employee.getFirstnameString().equalsIgnoreCase(firstnameString)
                    && employee.getLastnameString().equalsIgnoreCase(lastnameString)) {
                    employeeWithParams.add(employee);
                }
            }

            else if (firstnameString != null) {
                if (employee.getFirstnameString().equalsIgnoreCase(firstnameString)) {
                    employeeWithParams.add(employee);
                }
            }

            else if (lastnameString != null) {
                if (employee.getLastnameString().equalsIgnoreCase(lastnameString)) {
                    employeeWithParams.add(employee);
                }
            }
        }

        return employeeWithParams;
    }
    
    public Employee saveEmployee(Employee newEmployee) {
    	employeeList.add(newEmployee);
    	return newEmployee;
    }
    
    public boolean deleteEmployee(String id) {
    	Employee deleteEmployee=null;
    	for (Employee employee : employeeList) {
    		if(id.equals(employee.getId())){
    			deleteEmployee=employee;
    			break;
    		}
		}
    	if(id==null) {
    		return false;
    	}
    	employeeList.remove(deleteEmployee);
    	return true;
    }
    
    
    private Employee findEmployeeById(String id) {
    	Employee findEmployee=null;
    	for (Employee employee : employeeList) {
			findEmployee=employee;
			break;
		}
    	return findEmployee;
    }
    public Employee updateEmployee(String id, UpdateEmployee request) {
    	Employee findEmployee= findEmployeeById(id);
    	if(findEmployee!=null) {
    		deleteEmployee(id);
    		
    		Employee updatedEmployee=new Employee();
    		updatedEmployee.setId(id);
    		updatedEmployee.setFirstnameString(request.getFirstnameString());
    		updatedEmployee.setLastnameString(request.getFirstnameString());
    		
    		employeeList.add(updatedEmployee);
    		
    		return updatedEmployee;
    	}
    	return null;
    }
    
    
    
    
    
    
    
    
    
    
    
}
