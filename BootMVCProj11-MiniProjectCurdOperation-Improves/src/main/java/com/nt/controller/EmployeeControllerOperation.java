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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.servlet.http.HttpSession;

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
		System.out.println("EmployeeControllerOperation.showEmployeeReport()");
		// use service
		List<Employee> list = service.getAllEmployees();
		// put the results in model attribute
		map.put("empsData", list);
		// return LVN(Logical view name)
		return "employee_report";

	}// method

	@GetMapping("/add")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		System.out.println("EmployeeControllerOperation.showAddEmployeeForm()");
		emp.setJob("CLERK");// initial value to display in form comp as initial value
		// return LVN
		return "employee_register";

	}// method
		// =========================================USING
		// Map=========================================
	/*
			@PostMapping("/add")
			public String addEmployee(Map<String,Object>map, @ModelAttribute("emp") Employee emp) {
				// user service
				System.out.println("EmployeeControllerOperation.addEmployee()");
	
				String result = service.registerEmployee(emp);
				// List<Employee> list = service.getAllEmployees(); //if i refresh browser the  data automatic inserted thats why it close
				// keep results in model attributes
				// map.put("empsData", list); //if i refresh browser then data automatic inserted thats why it close
			map.put("resultMsg", result);
	
				// return LVN
				return "redirect:report";
			}*/

	/*
	 * ===============================USING Redirect attributes========================================
		@PostMapping("/add")
		public String addEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp) {
			// user service
			System.out.println("EmployeeControllerOperation.addEmployee()");
	
			String result = service.registerEmployee(emp);
			// List<Employee> list = service.getAllEmployees(); //if i refresh browser the  data automatic inserted thats why it close
			// keep results in model attributes
			// map.put("empsData", list); //if i refresh browser then data automatic inserted thats why it close
			 attrs.addFlashAttribute("resultMsg", result);
	
			// return LVN
			return "redirect:report";
		}*/

	// =========================================USING
	// HttpSession=========================================

	@PostMapping("/add")
	public String addEmployee(HttpSession ses, @ModelAttribute("emp") Employee emp) {
		// user service
		System.out.println("EmployeeControllerOperation.addEmployee()");

		String result = service.registerEmployee(emp);
		// List<Employee> list = service.getAllEmployees(); //if i refresh browser the
		// data automatic inserted thats why it close
		// keep results in model attributes
		// map.put("empsData", list); //if i refresh browser then data automatic
		// inserted thats why it close
		ses.setAttribute("resultMsg", result);

		// return LVN
		return "redirect:report";
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
	public String EditEmployeeForm(@ModelAttribute("emp") Employee emp,RedirectAttributes attrs) {

		// use service
		String msg = service.editEmployee(emp);
		
		// keep results as flash  attributes in Redirect scope
		attrs.addFlashAttribute("resultMsg", msg);
		// return LVN
		return "redirect:report";
  
	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("no") int no, RedirectAttributes attrs) {
		// use service
		String msg = service.deleteEmployee(no);
		// keep results in model attributes
	attrs.addFlashAttribute("resultMsg", msg);
		
		// return LVN
		return "redirect:report";

	}

}// class
