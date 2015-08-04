/**
 * 
 */
package com.diwakar.hibernate.common;

import java.util.Scanner;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: UserRequestHandler.java
 */
public class UserRequestHandler {

	public static void delegateOperation(int userChoice)
	{

		UserChoice choice = UserChoiceAsEnum.fromInt(userChoice);
		
		if(choice==null)
		{
			System.out.println("You have entered the wrong choice, Please select the correct option again");
			MainMenu.displayMenu();
		}

		switch(choice)
		{
		
		case GetAllEmployee:
			UserOperationTemplate.getAllTheEmployees();
			break;

		case FindEmployeeByID: 
			UserOperationTemplate.findAnEmployeeById();
			break;
			
		case AddNewEmployee:
			UserOperationTemplate.addNewEmployee();
			break;
			
		case UpdateEmployee: 
			UserOperationTemplate.updateAnEmployee();
			break;
			
		case DeleteEmployee: 
			UserOperationTemplate.deleteAnEmployee();
			break;
			
		case DeleteAllEmployee: 
			UserOperationTemplate.deleteAllTheEmployees();
			break;
			
		case ExitFromApp: 
			Scanner sc = new Scanner(System.in);
			System.out.println("Are you sure, you want to exit Press:  y/yes to quit or Press any other character to continue ?");
			String ans = sc.next();
			if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
			{
				 System.out.println("Exiting the application..");
				System.exit(0);
			}
			else
				MainMenu.displayMenu();
			break;
			
		}

	}


}
