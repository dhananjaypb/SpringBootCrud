package com.spring.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.pojo.Employee;
import com.spring.rest.repository.EmployeeDao;

@Service
@Transactional
public class EmployeeService implements EmployeeServicePlan<Employee>{

	@Autowired
	EmployeeDao ed;

	public List<Employee> getAllEmployee() {
		return ed.getAllEmployee();
	}

	public Employee getEmployee(int i) {
		return ed.getEmployee(i);
	}

	public boolean addEmployee(Employee e) {
		return ed.addEmployee(e);
	}

	public boolean deleteEmployee(int i) {
		return ed.deleteEmployee(i);
	}

	public boolean updateEmployee(Employee e) {
		return ed.updateEmployee(e);
	}
}
