/**
 * 
 */
package com.diwakar.hibernate.service.impl;

import java.util.List;

import com.diwakar.hibernate.dao.impl.EmployeeDAOImpl;
import com.diwakar.hibernate.model.Employee;
import com.diwakar.hibernate.service.EmployeeService;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: EmployeeServiceImpl.java
 */
public class EmployeeServiceImpl implements EmployeeService {
	
	private static EmployeeDAOImpl employeeDaoImpl = new EmployeeDAOImpl();

	@Override
	public Integer create(Employee e) {
		
		return employeeDaoImpl.create(e);
	}

	@Override
	public List<Employee> read() {
		
		return employeeDaoImpl.read();
	}

	
	@Override
	public void update(Employee e) {
		
		employeeDaoImpl.update(e);
		
	}
	
	@Override
	public void delete(Integer id) {
		
		employeeDaoImpl.delete(id);
	}

	
	@Override
	public Employee findByID(Integer id) {
		
		return employeeDaoImpl.findByID(id);
	}

	public void deleteAll() {
	
		employeeDaoImpl.deleteAll();
		
	}

}
