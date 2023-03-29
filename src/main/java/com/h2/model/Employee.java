package com.h2.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	public Employee() {
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

}