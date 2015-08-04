/**
 * 
 */
package com.diwakar.hibernate.common;

import java.util.List;

import com.diwakar.hibernate.model.Employee;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: DisplayEmployee.java
 */
public class DisplayEmployee {


	public static void displayEmployee(Employee e)
	{
		System.out.println(e.toString());
	}

	public static void displayEmployee(List<Employee> listOfEmployees)
	{
		System.out.println(" =======Displaying All the employees in the Employee table =======");

		for(Employee e: listOfEmployees) {
			System.out.println(e.toString());
		}

	}

	public static void displayTransactionStatus(String operation, Integer noOfColumns)
	{
		if(noOfColumns>0)
		{
			System.out.println("Transaction completed successfully!!");
			System.out.println("No of columns affcayed for operation "+ operation + " : "+ noOfColumns);
		}
		else
		{
			System.out.println("None of the columns got affacted!!");
		}
	}
}
