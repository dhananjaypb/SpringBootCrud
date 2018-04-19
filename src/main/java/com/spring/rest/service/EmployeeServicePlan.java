package com.spring.rest.service;

import java.util.List;

public interface EmployeeServicePlan <d>{

	public List<d> getAllEmployee();

	public d getEmployee(int i);

	public boolean addEmployee(d e);

	public boolean deleteEmployee(int i);

	public boolean updateEmployee(d e);
}
