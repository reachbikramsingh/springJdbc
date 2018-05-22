package com.dss.jdbctemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dss/jdbctemp/applicationContext.xml");
		UserDao u = (UserDao) context.getBean("udao");
//		int status = u.saveUser(new User(27, "bikram", 7845));
//		System.out.println("record inserted..." + status);

		
//		 int status=u.updateUser(new User(23,"Rohit",15000));
//		  System.out.println(status);
		 
		
		  User us=new User(); 
		  us.setId(23);
		  u.deleteUser(us);
		 
	}
}
