package com.Helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Notes.Note;


public class FactoryProvider {
    public static SessionFactory factory = null;
	public static SessionFactory getfactory() {
		 
		if(factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Note.class).buildSessionFactory();
		}
		return factory;
	}
	
	
	 public static void closeFactory() {
	        if (factory != null) {
	            factory.close(); 
	        }
	    }
	
	
}
