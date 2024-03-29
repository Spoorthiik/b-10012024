package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public List<Employee> getEmployeeList()
	{
		List<Employee> list=employeeRepository.findAll();
		return list;
	}
	
	public Employee getEmployeeDetails(int id)
	{
		Employee emp=employeeRepository.findById(id).get();
		return emp;
	}
	
	public Employee createEmployeeDetails(Employee emp)
	{
		Employee dbemp=employeeRepository.save(emp);
		return dbemp;
	}
	
	public Employee updateEmployeeDetails(Employee emp)
	{
		Employee dbemp=employeeRepository.save(emp);
		return dbemp;
	}

	public String deleteEmployee(int id)
	{
		employeeRepository.deleteById(id);
		return "successfully deleted";
	}
	

}