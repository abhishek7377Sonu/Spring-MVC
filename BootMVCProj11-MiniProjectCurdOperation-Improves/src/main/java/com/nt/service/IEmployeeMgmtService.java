package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {

	public List<Employee> getAllEmployees();//findAll
	public String registerEmployee(Employee emp);//save
	public Employee getEmployeeByNo(int no);
	public String editEmployee(Employee emp);
	public String deleteEmployee(int no);
}
