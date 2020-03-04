package com.emptimetrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emptimetrack.model.Employee;
import com.emptimetrack.model.EmployeeVO;
import com.emptimetrack.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService empservice;
	
	 @PostMapping("/employees")
	   public ResponseEntity<?> save(@RequestBody EmployeeVO empVO) {
		  Employee emp = new Employee();
		  emp.setEmpName(empVO.getEmpName());
		  emp.setLocation(empVO.getLocation());
		 
	      Employee emp1 = empservice.save(emp);
	      return ResponseEntity.ok().body(" Employee has been saved with ID:" + emp1.getEmpId());
	   }
	

	
	
	
	
	
	
}
