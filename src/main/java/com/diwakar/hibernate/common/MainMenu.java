/**
 * 
 */
package com.diwakar.hibernate.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;


/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: MainMenu.java
 */
public class MainMenu {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	final static Logger logger = Logger.getLogger(MainMenu.class);

	public static void displayMenu()
	{
		int userChoice = 0;

		System.out.println("\n\n<=================Hibernate Example Main Menu=================>");

		System.out.println("Press 1. To see all the employees in the table.");
		System.out.println("Press 2. To find an Employee by ID.");
		System.out.println("Press 3. To add a new employee.");
		System.out.println("Press 4. To update an employee.");
		System.out.println("Press 5. To delete an employee.");
		System.out.println("Press 6. To delete ALL the employees at once.");
		System.out.println("Press 7. To Exit from the application");

		try
		{
			userChoice = Integer.parseInt(reader.readLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter valid number only.");
			displayMenu();

		}
		catch(Exception e)
		{
			System.out.println("Some error occured, please try aagain.");
			displayMenu();

		}
		if(logger.isInfoEnabled())
		{
			logger.info("Calling userRequestHandler with user choice "+ userChoice);
		}
		UserRequestHandler.delegateOperation(userChoice);
	}

}
