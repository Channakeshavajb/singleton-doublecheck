package com.xworkz.projct.dao;

import javax.print.attribute.standard.RequestingUserName;

public class SingletonDoubleCheck {

	public static SingletonDoubleCheck instance;

	private SingletonDoubleCheck() {
		// TODO Auto-generated constructor stub
		System.out.println("instance created");
	}

	public static SingletonDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}

}
