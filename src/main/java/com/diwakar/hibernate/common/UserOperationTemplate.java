/**
 * 
 */
package com.diwakar.hibernate.common;

import java.util.List;
import java.util.Scanner;

import org.jboss.jandex.Main;

import com.diwakar.hibernate.model.Employee;
import com.diwakar.hibernate.service.impl.EmployeeServiceImpl;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: userOperationTemplate.java
 */
public class UserOperationTemplate {

	private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	private static Scanner scanner = new Scanner(System.in);

	public static void getAllTheEmployees()
	{
		System.out.println("\n\n=========See All Employees=========");
		List<Employee> empList = employeeService.read();
		if(empList!=null)
		{
			if(empList.size()>0)
			{
				DisplayEmployee.displayEmployee(empList);
				MainMenu.displayMenu();
			}
			else
			{
				System.out.println("Thers is NO employee record in the database.");
				MainMenu.displayMenu();
			}
		}
		else
		{
			System.out.println("Something went wrong , or Databse doesnt have any employee record.");
			MainMenu.displayMenu();

		}

	}

	public static void findAnEmployeeById()
	{
		System.out.println("\n\n=========Find an employee=========");
		try
		{
			System.out.println("Enter the employee to find.");
			int id = scanner.nextInt();
			Employee emp = employeeService.findByID(id);

			if(emp!=null)
			{
				DisplayEmployee.displayEmployee(emp);
				MainMenu.displayMenu();
			}
			else
			{
				System.out.println("No such record found in the database, please try with another user");
				findAnEmployeeById();
			}

		}
		catch(Exception e)
		{
			System.out.println("Something went wrong, trying again.."+e);
			findAnEmployeeById();
		}

	}

	public static void addNewEmployee()
	{
		try
		{
			System.out.println("\n\n=========Add a new employee record=========");
			System.out.println("Enter the employee name");
			String empName = scanner.next();
			System.out.println("Enter the employee age");
			int age = scanner.nextInt();
			Employee emp = new Employee(empName,age);
			employeeService.create(emp);
			
			System.out.println("Employee Added! Redirecting to main menu now!!");
			MainMenu.displayMenu();
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong, trying again...");
			addNewEmployee();
		}

	}
	public static void deleteAnEmployee()
	{
		//TODO
	}
	public static void deleteAllTheEmployees()
	{
		//TODO
	}

	public static void updateAnEmployee()
	{
		//TODO

	}

}
