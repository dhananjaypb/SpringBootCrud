package com.spring.rest.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.hibernate.annotations.Polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.pojo.Employee;
import com.spring.rest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@RequestMapping(value = "/list", method = RequestMethod.GET )
	public List<Employee> getName() {
		
		return es.getAllEmployee();
	}
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET )
	public String getHi() {
		return "Hi";
	}
	
	@RequestMapping(value="/get/{id}",method= RequestMethod.GET )
	public Employee getEmployee(@PathVariable("id") Integer id){
		return es.getEmployee(id);
	}
	
	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE )
	public boolean deleteEmployee(@PathVariable("id") Integer id){
		return es.deleteEmployee(id);
	}
	
//	@PutMapping("/update")
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes="application/json" )
	public boolean updateEmployee(@RequestBody Employee e){
		return es.updateEmployee(e);
	}
	
//	@PostMapping("/add")
	@RequestMapping(value = "/hi", method = RequestMethod.POST, consumes="application/json" )
	public Employee addEmployee(@RequestBody Employee e){
		System.out.println(e);
		es.addEmployee(e);
		return e;
	}
}
