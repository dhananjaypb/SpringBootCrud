package com.spring.rest.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Employee_Id")
	private Integer id;
	@Column(name = "Employee_Name")
	private String name;
	@Column(name = "Employee_Pincode")
	private Integer pincode;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}


	public Employee() {
		super();
	}


	public Employee(Integer id, String name, Integer pincode) {
		super();
		this.id = id;
		this.name = name;
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pincode=" + pincode + "]";
	}

}
