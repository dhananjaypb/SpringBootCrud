package com.spring.rest.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.spring.rest.pojo.Employee;

@Repository
public class EmployeeDao implements EmployeeDaoPlan<Employee> {
	
	
	@Autowired
	SessionFactory sf;

	public List<Employee> getAllEmployee() {
		Session s = sf.openSession();
		List<Employee> l = s.createQuery("from Employee").list();
		s.close();
		return l;
	}

	public Employee getEmployee(int i) {
		Session s = sf.openSession();
		Employee e = (Employee) s.get(Employee.class, i);
		s.close();
		return e;
	}

	public boolean addEmployee(Employee e) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
		return true;
	}

	public boolean deleteEmployee(int i) {
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e = s.get(Employee.class,i);
		s.delete(e);
		t.commit();
		s.close();
		return true;
	}

	public boolean updateEmployee(Employee e) {
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(e);
		t.commit();
		s.close();
		return true;
	}
}
