/**
 * 
 */
package com.diwakar.hibernate.common;

import java.util.HashMap;
import java.util.Map;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: UserChoiceAsEnum.java
 */
public class UserChoiceAsEnum {
	
private static final Map<Integer, UserChoice> intToTypeMap = new HashMap<Integer, UserChoice>();
	
	
	static {
	    for (UserChoice choice : UserChoice.values()) {
	        intToTypeMap.put(choice.userNumericChoice, choice);
	    }
	}

	public static UserChoice fromInt(int i) {
		
		UserChoice type = intToTypeMap.get(Integer.valueOf(i));
		
	    return type;
	}

}
