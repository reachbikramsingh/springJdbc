package com.dss.jdbcRowmapper;

import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dss/jdbcRowmapper/applicationContext.xml");
		UserDao u = (UserDao) context.getBean("udao");
		List<User> users = u.getAllUsersRowMapper();

		for (User e : users)
			System.out.println(e.getId() + "   " + e.getName() + "  " + e.getSalary());

	}

}
