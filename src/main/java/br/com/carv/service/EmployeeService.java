package br.com.carv.service;

import java.util.List;

import br.com.carv.model.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	void deleteEmployeeById(Long id);
}
