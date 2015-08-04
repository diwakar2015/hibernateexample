/**
 * 
 */
package com.diwakar.hibernate.sessionfactory.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *  @author Diwakar
 *
 * Date:  Aug 4, 2015 2015
 * File: SessionFactoryUtil.java
 */

public class SessionFactoryUtil {
	
	
	public static SessionFactory getSessionFactory() {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(builder.build());
		
		return sessionFactory;
	}


}
