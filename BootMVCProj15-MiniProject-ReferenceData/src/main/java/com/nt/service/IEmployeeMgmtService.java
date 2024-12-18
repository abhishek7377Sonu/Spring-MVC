package com.nt.service;



import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {

	public Page<Employee> getAllEmployeesPageData(Pageable pageable);//findAll
	public String registerEmployee(Employee emp);//save
	public Employee getEmployeeByNo(int no);
	public String editEmployee(Employee emp);
	public String deleteEmployee(int no);
	public Set<String> getAllCountries();
    public  List<String> getStatesByCountry(String country);
}
