/**
 * 
 */
package com.diwakar.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.diwakar.hibernate.dao.EmployeeDAO;
import com.diwakar.hibernate.model.Employee;
import com.diwakar.hibernate.sessionfactory.util.SessionFactoryUtil;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: EmployeeDAOImpl.java
 */
public class EmployeeDAOImpl implements EmployeeDAO{

	public  Integer create(Employee e) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully created " + e.toString());
		return e.getId();

	}

	public  List<Employee> read() {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Employee> employees = session.createQuery("FROM Employee").list();
		session.close();
		System.out.println("Found " + employees.size() + " Employees");
		return employees;

	}

	public  void update(Employee e) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Employee em = (Employee) session.load(Employee.class, e.getId());
		em.setName(e.getName());
		em.setAge(e.getAge());
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully updated " + e.toString());

	}

	public  void delete(Integer id) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Employee e = findByID(id);
		session.delete(e);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted " + e.toString());

	}

	public  Employee findByID(Integer id) {

		Employee emp = null;
		try
		{
			Session session = SessionFactoryUtil.getSessionFactory().openSession();
			emp = (Employee) session.load(Employee.class, id);
			session.close();
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured while finding the employee with ID "+ id+ "\n"+ex);

		}
		return emp;
	}

	public  void deleteAll() {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("DELETE FROM Employee ");
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted all employees.");

	}

}
