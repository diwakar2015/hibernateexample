/**
 * 
 */
package com.diwakar.hibernate.common;


/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: UserChoiceEnum.java
 */

public enum UserChoice {
	
	GetAllEmployee(1),
	FindEmployeeByID(2),
	AddNewEmployee(3),
	UpdateEmployee(4),
	DeleteEmployee(5),
	DeleteAllEmployee(6),
	ExitFromApp(7);
	
	int userNumericChoice;
	
	private UserChoice(int userNumericChoice)
	{
		this.userNumericChoice = userNumericChoice;
	}

}
