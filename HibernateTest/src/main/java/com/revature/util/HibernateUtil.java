package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	private static Session ses;
	
	public static Session getSession() {
		if (ses == null) { //if there isn't a session...
			ses = sf.openSession(); //get one!
		}
		return ses; //return a session Object
	}
	public static void closeSession() {
		ses.close();
		ses = null;
	}
}
