package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.util.HibernateUtil;

public class launcher {

	public static void main(String[] args) {
		try(Session ses = HibernateUtil.getSession()) {
		System.out.println("Connection Successful");
	} catch (HibernateException e) {
		System.out.println("Connection Failed!");
		e.printStackTrace();
	}

	}

}
