package com.spring.rest.repository;

import java.util.List;

public interface EmployeeDaoPlan <d> {

	public List<d> getAllEmployee();

	public d getEmployee(int i);

	public boolean addEmployee(d e);

	public boolean deleteEmployee(int i);

	public boolean updateEmployee(d e);

}
