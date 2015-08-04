/**
 * 
 */
package com.diwakar.hibernate.dao;

import java.util.List;

import com.diwakar.hibernate.model.Employee;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: EmployeeDAO.java
 */
public interface EmployeeDAO {
	
	public Integer create(Employee e);
	public  List<Employee> read();
	public  void update(Employee e);
	public  void delete(Integer id);
	public  void deleteAll();
	public  Employee findByID(Integer id);
	
}
