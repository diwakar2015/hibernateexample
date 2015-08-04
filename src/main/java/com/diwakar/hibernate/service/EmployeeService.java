/**
 * 
 */
package com.diwakar.hibernate.service;

import java.util.List;

import com.diwakar.hibernate.model.Employee;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: EmployeeService.java
 */
public interface EmployeeService {
	
	public Integer create(Employee e);
	public  List<Employee> read();
	public  void update(Employee e);
	public  void delete(Integer id);
	public  void deleteAll();
	public  Employee findByID(Integer id);

}
