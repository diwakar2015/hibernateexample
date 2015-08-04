package com.diwakar.hibernate.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.diwakar.hibernate.common.MainMenu;



/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: App.java
 */

public class App {
	
	
	public static void main(String[] args) {
		
		// To disable the hibernate console output, un-comment this below line.
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
	
	    MainMenu.displayMenu();
	   
	}
}
