package com.emptimetrack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emptimetrack.dao.EmployeeDao;
import com.emptimetrack.model.Employee;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empdao;	
	

	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		 return empdao.save(emp);
	}

	
	
	
}
