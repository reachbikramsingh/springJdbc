package com.dss.jdbcResultSetExtractor;

import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dss/jdbcResultSetExtractor/applicationContext.xml");
		UserDao u = (UserDao) context.getBean("udao");
		   List<User> users=u.getAllUsers();
		
		   for(User e:users)  
		        System.out.println(e.getId()+"   "+e.getName()+"  "+e.getSalary());  
		          
		    }  
		
	}

