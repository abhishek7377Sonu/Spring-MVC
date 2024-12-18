package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
public class EmployeeControllerOperation {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showEmployeeReport(Map<String, Object> map) {

		// use service
		List<Employee> list = service.getAllEmployees();
		// put the results in model attribute
		map.put("empsData", list);
		// return LVN(Logical view name)
		return "employee_report";

	}// method

	@GetMapping("/add")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		emp.setJob("CLERK");// initial value to display in form comp as initial value
		// return LVN
		return "employee_register";

	}// method

	@PostMapping("/add")
	public String addEmployee(Map<String, Object> map, @ModelAttribute("emp") Employee emp) {
		// user service
		String result = service.registerEmployee(emp);
		List<Employee> list = service.getAllEmployees();
		// keep results in model attributes
		map.put("resultMsg", result);
		map.put("empsData", list);
		// return LVN
		return "employee_report";
	}

	@GetMapping("/edit")
	public String showEditEmployeeForm(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {

		// get Employee details dynamically based on the given emp no
		Employee emp1 = service.getEmployeeByNo(no);
		// emp=emp1; otherwise
		BeanUtils.copyProperties(emp1, emp);

		// return LVN
		return "employee_edit";

	}// method

	@PostMapping("/edit")
	public String EditEmployeeForm( @ModelAttribute("emp") Employee emp,Map<String,Object>map) {
	
		//use service
		String msg=service.editEmployee(emp);
	List <Employee>list=service.getAllEmployees();
	//keep results in model attributes
	map.put("resultMsg", msg);
	map.put("empsData", list);
	//return LVN	
		return "employee_report";

	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("no")int no,Map<String,Object>map) {
		//use service
		String msg=service.deleteEmployee(no);
		List<Employee>list=service.getAllEmployees();
		//keep results in model attributes
		map.put("resultMsg", msg);
		map.put("empsData", list);
		//return LVN
		return "employee_report";
		
	}
	
	
	
	
}// class
